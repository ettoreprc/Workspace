package teoria.dellabate;

public class Cameriere {
    private CuocoPizza cuocoPizza;
    public void setCuocoPizza(CuocoPizza cuocoPizza) {
        this.cuocoPizza = cuocoPizza;
    }
    public void creaPizza() {
        cuocoPizza.creaPizza();
        cuocoPizza.ingredienti();
    }
    public Pizza getPizza() {
        return cuocoPizza.getPizza();
    }
}