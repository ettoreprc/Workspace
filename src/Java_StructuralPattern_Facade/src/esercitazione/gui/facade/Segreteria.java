package esercitazione.gui.facade;

import java.util.ArrayList;

public abstract class Segreteria {

	private ArrayList<Studente > studenti ; 
	private ArrayList<Dipendente> dipendenti ; 
	
	public Segreteria ()
	{
		
	}
	
	public void aggiungiStudente (String nome , String cognome , int matricola ) 
	{
		if (studenti == null )
		{
			studenti = new ArrayList<>()  ;
		}
		studenti.add(new Studente (nome , cognome , matricola )) ; 
	}
	
	public void aggiungiDipendente (String nome , String cognome , String ruolo , int matricola )
	{
		if (dipendenti == null ) 
		{
			dipendenti = new ArrayList<>() ; 
		}
		dipendenti.add (new Dipendente(nome, cognome, ruolo, matricola)) ; 
	}
}
