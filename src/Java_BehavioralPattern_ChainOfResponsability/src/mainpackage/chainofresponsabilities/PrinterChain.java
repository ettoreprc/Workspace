package mainpackage.chainofresponsabilities;

import javax.swing.JOptionPane;

public class PrinterChain {

	private AbstractPrinterChain chain ; 
	
	public PrinterChain () 
	{
		this.chain = new SheetAsteriskPrinter() ; 
		AbstractPrinterChain chain2 = new SheetDotsPrinter() ; 
		AbstractPrinterChain chain3 = new SheetDollarPrinter() ; 
		
		chain.setNextChain(chain2);
		chain2.setNextChain(chain3);
	}
	public static void main(String[] args) {
		PrinterChain chainPrinter = new PrinterChain()  ; 
		String string = JOptionPane.showInputDialog("inserisci un carattere "); 
			do 
			{
				chainPrinter.chain.dispense(new Character(string));
				 string = JOptionPane.showInputDialog("inserisci un carattere "); 
				 System.out.println();
			}while (!string.equals("10"));
		}
}
