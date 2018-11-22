package mainpackage.decorator;

public abstract class Consumation {

	private String productName;

	public Consumation() {
		productName = " ";
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public abstract double getPrice();
}
