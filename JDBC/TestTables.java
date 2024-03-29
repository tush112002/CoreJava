package JDBC;
import java.sql.*;

public class TestTables {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("org.h2.Driver");
		System.out.println("Driver Loaded");

		Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		System.out.println("Connected");
		
		Statement st = con.createStatement();
		String sql = "select * from products1 p inner join cat c on p.cid = c.cid ";
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
//			int product_id = rs.getInt("product_id");
//			String product_name = rs.getString("product_name");
//			float product_price = rs.getFloat("product_price");
//			int cid = rs.getInt("cid");
//			System.out.println(product_id+product_name+product_price+cid);
			
			 System.out.println (
                     rs.getInt(1)+"   "+
                     rs.getString(2)+"     "+
                     rs.getFloat(3)+"    "+
                     rs.getInt(4));
			
		}
	}

}
