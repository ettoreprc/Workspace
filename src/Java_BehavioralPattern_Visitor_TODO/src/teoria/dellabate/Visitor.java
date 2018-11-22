package teoria.dellabate;

public class Visitor {
	 
    public void visit(Element element) {
        System.out.println( "Hello " + element.getHello());
    }
 
}