package ast2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ProductDAOImpl implements ProductDAO {

	private Connection conn;

	public ProductDAOImpl() {
		conn = DBConnection.getConnection();
	}

	@Override
	public void avgPrice() throws SQLException {
	    String query = "SELECT c.category_name, AVG(p.product_price) AS avg_price " +
	                   "FROM products1 p " +
	                   "INNER JOIN category c ON p.cid = c.category_id " +
	                   "GROUP BY c.category_name";
	    PreparedStatement preparedStatement = conn.prepareStatement(query);
	    ResultSet resultSet = preparedStatement.executeQuery();
	    while(resultSet.next()) {
	        String categoryName = resultSet.getString("category_name");
	        float avgPrice = resultSet.getFloat("avg_price");
	        System.out.println("Average Price for category " + categoryName + ": " + avgPrice);
	    }
	}


	@Override
	public void viewDetails(Product product, Category category) throws SQLException {
		String query = "SELECT p.product_id, p.product_name, p.product_price, p.cid, c.category_name "
				+ "FROM products1 p INNER JOIN category c ON p.cid = c.CATEGORY_ID ";
		PreparedStatement preparedStatement = conn.prepareStatement(query);
		ResultSet res = preparedStatement.executeQuery();
		while (res.next()) {
			int id = res.getInt("product_id");
			String name = res.getString("product_name");
			float price = res.getFloat("product_price");
			int cid = res.getInt("cid");
			String name2 = res.getString("category_name");

			System.out.println("Product Id: " + id);
			System.out.println("Product Name: " + name);
			System.out.println("Product Price: " + price);
			System.out.println("Category Id: " + cid);
			System.out.println("Category Name: " + name2 + "\n");
		}
	}

}
