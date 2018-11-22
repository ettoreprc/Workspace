package esercitazione.gui.facade;

public class Studente {

	private String nome , cognome  ; 
	private int matricola ;
	
	public Studente (String nome , String cognome , int matricola ) 
	{
		this.nome = nome  ;
		this.matricola = matricola ; 
		this.cognome = cognome ; 
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
	public int getMatricola() {
		return this.matricola;
	}
	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}
	
	
	
	
}
