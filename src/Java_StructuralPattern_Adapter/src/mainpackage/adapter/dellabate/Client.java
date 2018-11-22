package mainpackage.adapter.dellabate;

public class Client {
	 
    public static void main(String[] args) {
        Impiegato impiegato = new Impiegato();
        impiegato.setCognome("Rossi");
        System.out.println("Impiegato: " + impiegato.getCognome());
 
        AdattatoreEmployer adattatoreEmployer = new AdattatoreEmployer( new Employer() );
        adattatoreEmployer.setCognome("Verdi");
        System.out.println("AdattatoreEmployer: " + adattatoreEmployer.getCognome());
    }
 
}