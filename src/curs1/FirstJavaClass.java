package curs1;

public class FirstJavaClass {

	//--> one line comment
	
	/*
	 * --> multiple line comment
	 */
	
	int age = 23;
	
	//variabila
	String nume = "Johnny";

	//String --> reprezinta data typul vaiabilei
	//nume --> numele ales de user pentru variabila
	//= --> reprezinta un operator de atribuire
	// "Johnny" --> reprezinta valoarea care este tinuta in variabila nume 
	
	public static void main(String[] args) {
		
		//instantierea clasei
		FirstJavaClass obiect = new FirstJavaClass();
		obiect.greetings(); //call-ul metodei

	}
	
	//metoda
	public void greetings() {
		
		System.out.println("Hello " + nume);
	}
	//public --> access modifier
	//void --> return type
	//greetings --> numele metodei

}
