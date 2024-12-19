
import package model; 

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query; // Use the modern Hibernate API

public class App {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        
        // Create student objects
        Student student = new Student("Haseeb", "Muhammad", "mhaseebe@mail.com");
        Student student1 = new Student("John", "Cena", "john@mail.com");
        Student student2 = new Student("Jennifer", "Bai", "jBaji@mail.com");
        
        // Save the student objects
        session.save(student);
        session.save(student1);
        session.save(student2);
        
        // Commit the transaction
        t.commit();
        
        // Retrieve data from H2 database
        String hql = "SELECT s FROM Student s"; 
        Query<Student> query = session.createQuery(hql, Student.class);
        List<Student> list = query.getResultList();
        
        for (Student stu : list) {
            System.out.println("Student Id: " + stu.getId() + 
                               " | First name: " + stu.getFirstName() +
                               " | LastName: " + stu.getLastName() +
                               " | Email: " + stu.getEmail());
        }
        
        // Close the session and factory
        session.close();
        factory.close();
    }
}
