package teoria.dellabate;

public class Client {
	 
    public static void main(String[] args) {
        InvokerList invokerList = new InvokerList( new CommandList( new Receiver() ) );
        invokerList.list();
	
	
    }
}