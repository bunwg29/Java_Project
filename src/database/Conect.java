package database;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Conect {
	public static Connection getConnection() {
		Connection c = null;
		
		try {
			
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			
			
			String url = "jdbc:mySQL://localhost:3306/admin_acount";
			String username = "root";
			String password = "123456@";
			
			
			c = DriverManager.getConnection(url, username, password);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return c;
	}
	
	public static void closeConnection(Connection c) {
		try {
			if(c!=null) {
				c.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}