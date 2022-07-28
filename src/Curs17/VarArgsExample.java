package Curs17;

public class VarArgsExample {

	public static void main(String[] args) {
		
		printArguments("1", "2", "3");
		printArguments("1", "2", "3", "4");
		printArguments("7", "8");
		
		printArguments2(123, false, "1", "2", "3", "4");
		
		
		printArguments3('c', 123, 350.6, true);
		printArguments3("text", true, 350.6, true, 444);
	}

	
	public static <T> void printArguments3(T...values) {
		
		for(T value : values ) {
			System.out.println(value);
		}
	}
	
	
	// metoda generica care le inlocuieste pe cele 2 de mai sus, avand un nr variabil de argumente
	public static void printArguments(String...values) {
		
		for(String value : values) {
			System.out.println(value);
		}
		
	}
	
	
	public static void printArguments2(int num, boolean conditie, String...values) { // varargs trebuie sa fie ultima din lista de argumente
		
		for(String value : values) {
			System.out.println(value);
		}
		
	}
	
	
	/*8
	public static void printArguments(String str1, String str2, String str3) {
		
		System.out.println(str1+ " " + str2+ " " + str3);
		
	}
	
	public static void printArguments(String str1, String str2, String str3, String str4) {
		
		System.out.println(str1+ " " + str2+ " " + str3 + " " + str4);
		
	}*/
}
