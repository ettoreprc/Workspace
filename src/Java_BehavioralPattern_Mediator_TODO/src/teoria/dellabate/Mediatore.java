package teoria.dellabate;

public abstract class Mediatore {
	 
	   public abstract void aggiungi(Collega collega);
	 
	   public abstract void inviaRicevi(String nickNameMittente, String messaggio, String nickNameDestinatario);
	 
	}
