package JDBC;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TablesQuery {
	
    
	Class.forName("org.h2.Driver");
	System.out.println("Driver Loaded");

	Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
	System.out.println("Connected");
	
	


}
