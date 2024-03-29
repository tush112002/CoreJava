package ast2;


public class Products implements Comparable<Product> {

	private int productId;
	private String productName;
	private float productPrice;

	public Products() {
		// TODO Auto-generated constructor stub
	}

	public Products(int productId, String productName, float productPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}

	@Override
	public int compareTo(Product o) {

		return (this.getProductPrice() > o.getProductPrice()) ? -1
				: (this.getProductPrice() < o.getProductPrice()) ? 1 : 0;
	}

}
