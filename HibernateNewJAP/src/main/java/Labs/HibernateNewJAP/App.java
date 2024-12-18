package Labs.HibernateNewJAP;

import com.test.hib.controller.findUser_Hql;


public class App 
{ 
	public static void main( String[] args )
    {
      findUser_Hql u = new findUser_Hql();
    	u.findUser();
    	
    	// calling the select method here from findUser.java class
    	u.findUserSelect();
    }
}


