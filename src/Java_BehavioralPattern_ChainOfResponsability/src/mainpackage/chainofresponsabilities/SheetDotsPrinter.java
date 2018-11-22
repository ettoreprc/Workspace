package mainpackage.chainofresponsabilities;

public class SheetDotsPrinter implements AbstractPrinterChain {

	private AbstractPrinterChain chain;

	@Override
	public void dispense(Character cur) {
		int i = 0;
		if (cur.getString().equals(".")) {
			while (i < 10) {
				System.out.print(". ");
				i++;
			}
		} else {
			this.chain.dispense(cur);
		}
	}

	@Override
	public void setNextChain(AbstractPrinterChain chain2) {
		this.chain = chain2;
	}

}
