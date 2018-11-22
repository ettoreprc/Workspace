package mainpackage.esempiodidattico;

public class Client {

	public static void main(String[] args) {
		InvokerList invoker = new InvokerList(new CommandList(new Receiver())) ; 
		invoker.list();
	}
}
