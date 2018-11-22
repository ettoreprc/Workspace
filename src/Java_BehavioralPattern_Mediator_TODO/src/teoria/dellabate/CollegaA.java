package teoria.dellabate;

public class CollegaA extends Collega {
	 
    private String nickName;
    private Mediatore mediatore;
     
    public CollegaA(Mediatore mediatore, String nickName) {
        this.mediatore = mediatore;
        this.nickName = nickName;
         
        this.mediatore.aggiungi(this);
    }
     
    @Override
    public void invia(String messaggio, String nickNameDestinatario) {
        mediatore.inviaRicevi(nickName, messaggio, nickNameDestinatario);
    }
 
    @Override
    public String getNickName() {
        return this.nickName;
    }
 
    @Override
    public void ricevi(String messaggio, String nickNameMittente) {
        System.out.println(nickNameMittente + " -> " + nickName + ": " + messaggio );
    }
}