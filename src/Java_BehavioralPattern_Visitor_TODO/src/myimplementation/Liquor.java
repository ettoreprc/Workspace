package myimplementation;

class Liquor implements Visitable {
	
	private String price;

	Liquor(String string) {
		price = string;
	}

	public String accept(Visitor visitor) {
		return visitor.visit(this);
	}

	public String getPrice() {
		return price;
	}
	
}