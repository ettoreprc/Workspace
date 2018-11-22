package teoria.dellabate;

public class Client {
	 
    public static void main(String[] args) {
        //Operazione di addizione
        Espressione addizione = new Addizione();
 
        //Contesto delle variabili
        Contesto contesto = new Contesto();
        contesto.push(new Numero("4"));
        contesto.push(new Numero("3"));
 
        //Risultato
        System.out.println( "risultato: " + addizione.interpreta(contesto) );
    }
}