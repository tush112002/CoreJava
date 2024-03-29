package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ProductDAOImpl implements ProductDAO {
	
	private Connection conn;
	
	public ProductDAOImpl() {
		conn = DBConn.getConnection();
		System.out.println("impl's connection= " + conn.hashCode());
	}
	

	@Override
	public int insert(Product product) throws SQLException {
		String query = "insert into products(product_name,product_price) values (?,?)";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setString(1, product.getProductName());
		ps.setFloat(2,product.getProductPrice());
		int res = ps.executeUpdate();
		return res;
	}

	@Override
	public int update(Product product) throws SQLException {
		// TODO Auto-generated method stub
//      int productId = 10;
		String query = "update products set product_name = ?,product_price =?  where product_id=?";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setInt(1,product.getProductId());
		ps.setString(2, product.getProductName());
		ps.setFloat(3,product.getProductPrice());
		int res = ps.executeUpdate();
		return res;
	}

	private int ProductId() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int delete(int productId) throws SQLException {
		// TODO Auto-generated method stub
		String query = "delete from products where product_id=?";
//		productId = 7;
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setInt(1, productId);
		int res = ps.executeUpdate();
		return res;
	}

	@Override
	public List<Product> viewAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
