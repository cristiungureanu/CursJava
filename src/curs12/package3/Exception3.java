package curs12.package3;

public class Exception3 {

	public static void main(String[] args) {

		
		try {
			String name = null;
			System.out.println(name.length());
			
		}catch(NullPointerException e) {
			
			System.out.println("Null pointer occured!");
			System.out.println(3/0);
			
		}finally {
			System.out.println("Finally block of code");
			
		}
		
		System.out.println("Code after try catch");
		
	}

}
