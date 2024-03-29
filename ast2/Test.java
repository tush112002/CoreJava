package ast2;

import java.sql.SQLException;

public class Test {
	
	public static void main(String[] args) throws SQLException {
		
		ProductDAOImpl pi = new ProductDAOImpl();
		
		pi.viewDetails(new Product(0),new Category(0, null));
		pi.avgPrice();
		
	}
	
}
