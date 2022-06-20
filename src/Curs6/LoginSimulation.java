package Curs6;

import java.util.Scanner;

public class LoginSimulation {

	String username;
	String password;
	
	String user = "TestUser";
	int pass = 1234;
	boolean valid;
	int attempts = 0;
	
	Scanner scan = new Scanner(System.in);

	
	public void getUsername() {
		System.out.println("Introdu username: ");
		username = scan.nextLine();
	}
	
	public void getPassword() {
		System.out.println("Introdu password: ");
		password = scan.nextLine();
		//return password;
	}
	
	public void printMessages() {
		
	}
	
	public void checkRules() {
		
		valid = true;
		
		
		
		if(username.equals(user) && (pass == Integer.parseInt(password))) {
			System.out.println("Login Successful");
		} else {
			System.out.println("Login error");
			valid = false;
		}
		attempts++;
		
		if(attempts == 3 && valid == false) {
			System.out.println("Maximum attempts reached. User blocked");
		}
		
	}
	
}
