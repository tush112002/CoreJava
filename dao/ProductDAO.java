package dao;

import java.sql.SQLException;
import java.util.List;

import ast2.Category;

public interface ProductDAO {
	
	int insert(Product product, Category category) throws SQLException;
	int update(Product product) throws SQLException;
	int delete(int productId) throws SQLException;
	List<Product> viewAll();
	
}
