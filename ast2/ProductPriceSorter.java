package ast2;

import java.util.Comparator;

public class ProductPriceSorter implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		return (o1.getProductPrice() > o2.getProductPrice()) ? 1 : 
				(o1.getProductPrice() < o2.getProductPrice()) ? -1 :
				0;
	}

}