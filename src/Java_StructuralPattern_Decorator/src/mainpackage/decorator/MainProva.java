package mainpackage.decorator;

public class MainProva {

	public MainProva() {

	}

	public static void main(String[] args) {
		Consumation c = new BaseBianca();
		ExtraAddict e = new Patate(c);
		System.out.println(e.getProductName() + e.getPrice());
	}
}
