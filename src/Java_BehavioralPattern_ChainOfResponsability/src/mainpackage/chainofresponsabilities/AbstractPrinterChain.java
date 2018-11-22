package mainpackage.chainofresponsabilities;

public interface AbstractPrinterChain {

	void setNextChain(AbstractPrinterChain chain2);
	
	void dispense(Character cur);
	
}
