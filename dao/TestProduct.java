package dao;

import java.sql.SQLException;

public class TestProduct {

	public static void main(String[] args) throws SQLException {
		
		ProductDAOImpl impl = new ProductDAOImpl();
		
//		int res = impl.insert(new Product(0,"Glass",20.0f));
//		System.out.println("Rows Inserted:"+res);
		
		int res = impl.update(new Product(6, "Bat",100.0f));
		System.out.println("Rows Updated:"+res);
		
        Product product;
		int res1 = impl.delete(7);
		System.out.println("Rows Deleted:"+res1);
		
		

	}
}
