package teoria.dellabate;

public class Element {

    private String hello = "Element";

    public String getHello() {
        return hello;
    }
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}