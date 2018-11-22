package com.mainpackage.numeri;

import javax.swing.JOptionPane;

public class Foglio {

	public NumeroUno creaUno() {
		return new NumeroUno();
	}

	public NumeroDue creaDue() {
		return new NumeroDue();
	}

	public NumeroTre creaTre() {
		return new NumeroTre();
	}

	private void scrivi() {

		boolean stampa = true;
		String numero = JOptionPane.showInputDialog("che numero stampo?");
		Numero n;

		switch (numero) {
		case "1":
			stampa = true;
			n = this.creaUno();
			break;
		case "2":
			stampa = true;
			n = this.creaDue();
			break;
		case "3":
			stampa = true;
			n = this.creaTre();
			break;
		default:
			n = new NumeroUno();
			stampa = false;
			break;

		}
		if (stampa)
			n.print();
		else
			JOptionPane.showMessageDialog(null,
					"Il numero inserito non è valido. Inserire un numero compreso tra 1 e 3");
	}

	public static void main(String[] args) {

		Foglio f = new Foglio();

		while (true) {
			f.scrivi();

			String finito = JOptionPane.showInputDialog("Finito?");

			switch (finito) {
			case "SI":
				System.exit(0);
				break;
			case "si":
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}
}
