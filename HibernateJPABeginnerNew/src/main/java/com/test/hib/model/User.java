package com.test.hib.model;

import javax.persistence.*;
import

@Entity
@Table(name = "USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Integer id;
    
    @Column(name = "FULL_NAME")
    private String fullname;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "AGE")
    private int age;

    @Column(name = "SALARY")
    private double salary;

    @Column(name = "CITY")
    private String city;
    
    // Getters and Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getFullname() { return fullname; }
    public void setFullname(String fullname) { this.fullname = fullname; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
}



//@Entity annotation specifies that the class is an entity.
//@Table maps the entity with the table. If no @Table is defined, 
//the default value is used: the class name of the entity.
//@Id declares the identifier property of the entity.
//@Column maps the entity's field to the table's column.
//If @Column is omitted, the default value is used: the field name of the entity.
