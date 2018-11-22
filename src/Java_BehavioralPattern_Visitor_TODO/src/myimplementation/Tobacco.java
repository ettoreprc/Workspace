package myimplementation;

class Tobacco implements Visitable {
	
	private String price;

	Tobacco(String item) {
		price = item;
	}

	public String accept(Visitor visitor) {
		return visitor.visit(this);
	}

	public String getPrice() {
		return price;
	}
	
}
