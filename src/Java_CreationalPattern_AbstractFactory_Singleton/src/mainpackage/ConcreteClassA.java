package mainpackage;

public class ConcreteClassA extends AbstractFactory {
	@Override
	public void Method_1() {
		System.out.println("ConcreteClassA");
	}

	public AbstractFactory getInstance() {
		
		return super.getInstance();
	}
}
