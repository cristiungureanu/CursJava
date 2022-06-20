package Curs6;

import java.util.Scanner;

public class PasswordValidator {
	
	/*
	 * facem un program care valideaza o parola pe baza unor reguli:
	 * Reguli:
	 * 1. parola trebuie sa fie de minim 10 caractere
	 * 2. parola trebuie sa contina upper case
	 * 3. Parola nu trebuie sa fie la fel ca username
	 * 
	 * intrebam userul un username si o parola
	 * il informam care sunt regulile parolei
	 * 
	 * daca parola este valida, printam "parola valida"
	 * daca nu, il informam care reguli nu au fost respectate
	 */

	String username;
	Scanner scan = new Scanner(System.in);
	boolean valid;
	
	public void getUsername() {
		System.out.println("Introdu username: ");
		username = scan.nextLine();
	}
	
	public String getPassword() {
		System.out.println("Introdu password: ");
		String pass = scan.nextLine();
		return pass;
	}
	
	public void printPasswordRules() {
		System.out.println("Reguli: ");
		System.out.println("parola trebuie sa fie de minim 10 caractere ");
		System.out.println("parola trebuie sa contina upper case ");
		System.out.println("Parola nu trebuie sa fie la fel ca username ");
	}
	
	public void checkPasswordRules(String pass) {
		
		valid = true;
		
		if(pass.length()<10) {
			valid = false;
			System.out.println("parola trebuie sa fie de minim 10 caractere ");
		}
		if(pass.equals(pass.toLowerCase())) {
			valid = false;
			System.out.println("parola trebuie sa contina upper case ");
		}
		if(pass.equals(username)) {
			valid = false;
			System.out.println("Parola nu trebuie sa fie la fel ca username ");
		}
	}
	
	public static void main(String[] args) {
		
		PasswordValidator validator = new PasswordValidator();
		validator.printPasswordRules();
		validator.getUsername();
		
		do {
			
			validator.checkPasswordRules(validator.getPassword());
			//if(validator.valid == true) {
			//	break;
			//}
		
		}while(!validator.valid);
		
		System.out.println("Parola valida!");
		
	}
	
}
