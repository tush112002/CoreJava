package astsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import sorting.Product;

public class TestProducts {
	public static void main(String[] args) {
		List<Product> productList = new ArrayList<>();
		productList.add(new Product(1, "Laptop", 999.9f));
		productList.add(new Product(2, "Smartphone", 699.9f));
		productList.add(new Product(3, "Headphones", 99.9f));
		productList.add(new Product(4, "Tablet", 499.9f));
		productList.add(new Product(5, "Smartwatch", 199.9f));

		Collections.sort(productList);

		Comparator<Product> priceLambdaDescSorter = (o1, o2) -> {
			return (o1.getProductPrice() > o2.getProductPrice()) ? -1
					: (o1.getProductPrice() < o2.getProductPrice()) ? 1 : 0;
		};

		System.out.println("Sorted Product List:");
		for (Product product : productList) {
			System.out.println(product);
		}
	}

}
