package mainpackage.decorator;

public class Patate extends ExtraAddict {

	public Patate(Consumation consumation) {
		this.consumation = consumation;
	}

	@Override
	public String getProductName() {
		return consumation.getProductName()+"+ Patate";
	}

	@Override
	public double getPrice() {
		return consumation.getPrice()+0.2;
	}

}
