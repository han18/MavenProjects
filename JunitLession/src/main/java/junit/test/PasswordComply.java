

package junit.test;
import java.sql.CallableStatement;
import java.sql.Connection;
// for getting errors
import java.sql.DriverManager;
import java.sql.SQLException;

public class PasswordComply {
	
	private String passwordString;
	private final int minPasswordLength = 8;
	private final int maxPasswordLength = 12;
	
	static final String DB_URL = "jdbc:mysql://localhost/PERSCHOLAS";

}

