package twitter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	private static Connection conn;
	
	private DBConnection() {
		
	}
	
	public static Connection getConnection() {
		return conn;
	}
	
	static {
		try {
			Class.forName("org.h2.Driver");
			System.out.println("Driver Loaded");

			conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
//			System.out.println("original connection= " + conn.hashCode());
			System.out.println("Connected");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver coudn't be loaded.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Connection coudn't be established.");
			e.printStackTrace();
		}

	}
	
	
}