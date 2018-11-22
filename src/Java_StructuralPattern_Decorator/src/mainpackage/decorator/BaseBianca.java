package mainpackage.decorator;

//Concrete Component

public class BaseBianca extends Consumation {

	public BaseBianca() {
		this.setProductName("Bianca");
	}

	@Override
	public double getPrice() {
		return 2;
	}
	
	

}
