package teoria.dellabate;

public class Client {
	 
    public static void main(String[] args) {
        Element element = new Element();
        element.accept( new Visitor() );
    }
 
}