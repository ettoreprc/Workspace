package myimplementation;

class Necessity implements Visitable {
	
	private String price;

	Necessity(String item) {
		price = item;
	}

	public String accept(Visitor visitor) {
		return visitor.visit(this);
	}

	public String getPrice() {
		return price;
	}
	
}