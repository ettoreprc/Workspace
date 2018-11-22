package mainpackage.esempiodidattico;

import java.util.Random;

public class Receiver {

	public void list() {
		System.out.println(exec("Sei un : "));
	}

	private String exec(String command) {

		Random rand = new Random() ; 
		int randomNumber = rand.nextInt(5) ; 
		String s = null ; 
		switch (randomNumber) {
		case 0:
			s = "Napoletano" ; 
			break;
		case 1:
			s = "Stronzo" ; 
			break;
		case 2:
			s = "Rincoglionito" ; 
			break;
		case 3:
			s = "Babbo di Minchia" ; 
			break;
		case 4:
			s = "Cornuto" ; 
			break;
		default:
			break;
		}
		System.out.print("Sei un : ");
		return s;
	}

}
