package mainpackage;

public class Person {

	private String name , surname ; 
	private static Person instance ; 
	private Person () 
	{
		name = "Ettore" ; 
		surname = "Cammarata" ; 
	}
	
	public static Person getInstance () {
		if (instance == null ) 
			instance = new Person () ; 
		return instance ; 
	} 
	
	public String getName() 
	{
		return this.name ; 
	}
	public String getSurname () 
	{
		return this.surname ; 
	}
}
