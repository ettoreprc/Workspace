package esercitazione.pattern.facade;

import javax.swing.JOptionPane;

public class Client {

	public static void main(String[] args) {
		Facade f = new Facade () ; 
//		f.makeFrame () ; 
//		f.show() ; 
		
		String s ; 		
		do {
			
			s = JOptionPane.showInputDialog("vuoi vedere la facciata ? ") ; 
			if (s.equalsIgnoreCase("si") ) 
				f.show();
			
		}while (s != "si") ; 
		
	}
}
