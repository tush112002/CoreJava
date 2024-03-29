package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestProduct {
	public static void main(String[] args) {
		
		List<Product> product = new ArrayList<>();
		
		product.add(new Product(1,"Pen",10.0));
		product.add(new Product(2,"Pencil",5.0));
		product.add(new Product(3,"Paper",20.0));
		product.add(new Product(4,"SketchPen",50.0));
		product.add(new Product(5,"Book",70.0));
		product.add(new Product(6,"NoteBook",60.0));
		product.add(new Product(7,"Bottlle",30.0));
		product.add(new Product(8,"Eraser",9.0));
		product.add(new Product(9,"Duster",80.0));
		
		List<Product> myProductList = product.stream()
				.map(p -> new Product(p.getProductId() , p.getProductName(),p.getProductPrice() * 0.9))
				.filter(p -> p.getProductPrice()>25.0)
				.collect(Collectors.toList());
		
		System.out.println(myProductList);
	}
}
