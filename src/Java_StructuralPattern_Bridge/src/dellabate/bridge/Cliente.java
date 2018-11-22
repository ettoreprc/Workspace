package dellabate.bridge;

public class Cliente {
    public static void main(String[] args) {
        Cameriere cameriere = new CamerierePizzeria();
        Pasto ordinazione = cameriere.ordinazione(new PizzaMargherita());
        System.out.println(ordinazione);
    }
}
