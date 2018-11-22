package mainpackage;

public class Client {
	
	public static void main(String[] args) {
		System.out.print(Person.getInstance().getSurname()+" "); 
		System.out.println(Person.getInstance().getName());
		
	}
}
