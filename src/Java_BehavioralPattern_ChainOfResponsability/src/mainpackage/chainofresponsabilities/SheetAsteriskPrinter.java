package mainpackage.chainofresponsabilities;

public class SheetAsteriskPrinter implements AbstractPrinterChain {

	private AbstractPrinterChain chain;

	public void dispense(Character cur) {
		int i = 0;
		if (cur.getString().equals("*")) {
			while (i < 10) {
				System.out.print("* ");
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
