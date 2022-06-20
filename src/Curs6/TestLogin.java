package Curs6;

public class TestLogin {

	public static void main(String[] args) {

		LoginSimulation obj = new LoginSimulation();
		
		do {
			obj.getUsername();
			obj.getPassword();
			obj.checkRules();
			System.out.println("attempt: " + obj.attempts);
			
		} while(obj.attempts<3 && !obj.valid);

	}

}
