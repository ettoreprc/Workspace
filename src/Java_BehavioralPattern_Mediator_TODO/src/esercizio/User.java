package esercizio;

public class User {

	private String nickname ; 
	
	public User () 
	{
		nickname = "Guest" ; 
	}
	public User (String nickname ) 
	{
		this.nickname = nickname  ; 
	}
	
	public String getNickname() 
	{
		try {
			return this.nickname ; 
		} catch (Exception exception) {
			System.err.println("Nickname not Found");
			return "" ; 
		}
	}
}

