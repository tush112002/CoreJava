package ast2;

import java.sql.SQLException;

public interface ProductDAO {
	
	public void avgPrice() throws SQLException;
	public void viewDetails(Product product, Category category) throws SQLException;
}
