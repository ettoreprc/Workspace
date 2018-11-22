package teoria.dellabate;

public class Client {
    public static void main(String[] args) {
         
        Mediatore mediatore = new ConcretoMediatore();
         
        Collega collegaA = new CollegaA( mediatore, "Andrea" );
        Collega collegaB = new CollegaB( mediatore, "Giovanni" );
         
        collegaA.invia("Ciao, come stai? ", "Giovanni");
        collegaB.invia("Tutto bene, e tu?", "Andrea");
        collegaA.invia("Tutto bene, si programma!", "Giovanni");
 
    }
}