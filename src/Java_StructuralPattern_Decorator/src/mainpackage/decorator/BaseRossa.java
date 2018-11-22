package mainpackage.decorator;

//Concrete Component

public class BaseRossa extends Consumation {

	public BaseRossa() {
		this.setProductName("Rossa");
	}

	@Override
	public double getPrice() {
		return 3;
	}
	
	

}
