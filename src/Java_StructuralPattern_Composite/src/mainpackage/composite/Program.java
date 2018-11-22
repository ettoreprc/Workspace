package mainpackage.composite;

import java.util.List;
import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		// Inizializza tre ellissi
		Ellisse ellisse1 = new Ellisse();
		Ellisse ellisse2 = new Ellisse();
		Ellisse ellisse3 = new Ellisse();
		Ellisse ellisse4 = new Ellisse();

		// Inizializza tre grafici composti
		CompositeGraphic graphic = new CompositeGraphic();
		CompositeGraphic graphic1 = new CompositeGraphic();
		CompositeGraphic graphic2 = new CompositeGraphic();

		// Compone i grafici
		graphic1.add(ellisse1);
		graphic1.add(ellisse2);
		graphic1.add(ellisse3);

		graphic2.add(ellisse4);

		graphic.add(graphic1);
		graphic.add(graphic2);

		// Stampa i grafici completi (quattro volte la stringa "Ellisse").
		graphic.print();
	}
}