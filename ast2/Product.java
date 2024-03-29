package ast2;

public class Product {

	private int productId;
	private String productName;
	private float productPrice;
	private int categoryId;

	public Product(int productId, String productName, float productPrice,int categoryId) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.categoryId = categoryId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public Product(int i) {
		// TODO Auto-generated constructor stub
		this.productId = productId;
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

}
