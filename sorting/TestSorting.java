package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestSorting {

	public static void main(String[] args) {

		Product p1 = new Product(1, "Pen", 12);
		Product p2 = new Product(5, "Pencil", 4);
		Product p3 = new Product(3, "File", 18.4f);
		Product p4 = new Product(10, "Book", 280.88f);

		List<Product> products = new ArrayList<>();

		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);

		Collections.sort(products);
		System.out.println("Sorted by Id");
		System.out.println(products);

		Collections.sort(products, new ProductPriceSorter());
		System.out.println("Sorted by Price");
		System.out.println(products);

		Comparator<Product> priceLambdaDescSorter = (o1, o2) -> {
			return (o1.getProductPrice() > o2.getProductPrice()) ? -1
					: (o1.getProductPrice() < o2.getProductPrice()) ? 1 : 0;
		};

		Collections.sort(products, priceLambdaDescSorter);
		System.out.println("Sorted by Price Desc using lambda");
		System.out.println(products);

	}

}