package teoria.dellabate;

public class Cliente {
    public static void main(String[] args) {
        Cameriere cameriere= new Cameriere();
        CuocoPizza cuocoPizza = new CuocoPizzaMargherita();
        cameriere.setCuocoPizza(cuocoPizza);
        cameriere.creaPizza();
        Pizza pizza = cameriere.getPizza();
        System.out.println( "Ingredienti: " + pizza.getIngredienti() );
    }
}