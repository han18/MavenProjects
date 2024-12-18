package Labs.HibernateNewJAP;

import com.test.hib.controller.findUser_Hql;


public class App 
{ 
	public static void main( String[] args )
    {
      findUser_Hql u = new findUser_Hql();
//    	u.findUser();
    	
    	// calling the select method here from findUser.java class
//    	u.findUserSelect();
      // worked
    	
    	// calling the select where clause here in the main method
//    	c) `WHERE` Clause and Order by Clause
//    	u.getRecordbyId();
      // worked
    	
    	// d) Multiple SELECT Expressions
//    	u.getrecords();
      // worked
    	
    	// Example: Aggregate Function calling the method
//    	u.getmaxSalary();
      // worked
      
     //  f) GROUP BY Clause and Aggregate function calling the method
      u.getmaxSalaryGroupBy();
      // last method worked

    }
}


