package mainpackage.decorator;

public class Carciofi extends ExtraAddict {

	public Carciofi(Consumation consumation) {
		this.consumation = consumation;
	}

	@Override
	public String getProductName() {
		return consumation.getProductName()+"+ Carciofi";
	}

	@Override
	public double getPrice() {
		return consumation.getPrice()+0.19;
	}
}