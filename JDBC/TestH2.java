package JDBC;

import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class TestH2 {

	public Connection init() throws SQLException, ClassNotFoundException
	{
		Class.forName("org.h2.Driver");
		System.out.println("Driver Loaded");

		Connection conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");

		System.out.println("Connection Established ");
		
		return conn;
	}

	public void insert(Connection conn) throws SQLException {
		String name = "Football";
		float price = 500.0f;
		PreparedStatement pst = conn
				.prepareStatement("insert into PRODUCTS (product_name, product_price) values (?, ?)");

		pst.setString(1, name);
		pst.setFloat(2, price);
		int res = pst.executeUpdate();
		System.out.println(res + " Rows Inserted");

	}

	public void update(Connection conn) throws SQLException {
		String name = "KitKat";
		int id = 4;
		PreparedStatement pst = conn.prepareStatement("update PRODUCTS set product_name=? where product_id =?");
		pst.setString(1, name);
		pst.setInt(2, id);

		int res = pst.executeUpdate();
		System.out.println(res + " Row Updated");

	}

	public void delete(Connection conn) throws SQLException {

		int id = 1;
		PreparedStatement pst = conn.prepareStatement("delete from PRODUCTS  where id =?");

		pst.setInt(1, id);

		int res = pst.executeUpdate();
		System.out.println(res + " Row Deleted");

	}

	public void display(Connection conn) throws SQLException {
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("Select * from products");

		System.out.println("Id\t\tName\t\tPrice");
		System.out.println("-----------------------------------------");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getInt(3));
		}

	}
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
//		
//		String name;
//		float price;
//		
//		System.out.println("enter name:");  
//		name = br.readLine();  
//		
//		System.out.println("enter price:");
//		price = Float.parseFloat(br.readLine());
//		
//		
//		PreparedStatement ps = con.prepareStatement("insert into PRODUCTS (product_name, product_price) values (?, ?)");
//		ps.setString(1,name);
//		ps.setFloat(2, price);
//		
//		int res = ps.executeUpdate();
//		System.out.println("Rows inserted= " + res);
//		
//		con.close();
			
		
//		Statement st = con.createStatement();
//		int res = st.executeUpdate("insert into PRODUCTS (product_name, product_price) values ('Bottle', 125.3)");
//		System.out.println("Rows inserted= " + res);
		
//		String name = "Marker";
//		float price = 20;
//		
//		PreparedStatement ps = con.prepareStatement("insert into PRODUCTS (product_name, product_price) values (?, ?)");
//		ps.setString(1,name);
//		ps.setFloat(2, price);
//		

}