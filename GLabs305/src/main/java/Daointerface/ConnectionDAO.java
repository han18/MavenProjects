// this class we would provide connection parameters 
//like database JDBC URL, user name and password as final variables

package Daointerface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionDAO {
    static Connection con = null;
    protected PreparedStatement ps = null;
    protected ResultSet rs = null;

    public static Connection getConnection() throws ClassNotFoundException {
        // database name library
    	final String DBURL = "jdbc:mysql://localhost:3306/library"; // it runs on port 3306, not 3305
        final String DBUSERNAME = "root";
        final String DBPASSWORD = "password";
        System.out.println("--- MySQL Is Connected ");
        try {
            con = DriverManager.getConnection(DBURL, DBUSERNAME, DBPASSWORD);
            System.out.println("Connected Database Successfully");
        } catch (SQLException e) {
            System.out.println(e);
            e.printStackTrace();
        }
        return con;
    }

    public void disconnect() {
        try {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
