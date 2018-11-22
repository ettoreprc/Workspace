package esercitazione.gui.facade;

public class Dipendente {

	private String nome , cognome , ruolo ; 
	private int matricola ;
	
	public Dipendente (String nome , String cognome , String ruolo , int matricola ) 
	{
		this.nome = nome  ;
		this.matricola = matricola ; 
		this.cognome = cognome ; 
		this.ruolo = ruolo ; 
	}
	
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return this.cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getRuolo() {
		return this.ruolo;
	}
	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}
	public int getMatricola() {
		return this.matricola;
	}
	public void setMatricola(int matricola) {
		this.matricola = matricola;
	} 
	
}
