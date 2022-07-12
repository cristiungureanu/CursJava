package curs12.package3;

import java.util.Scanner;

public class TestAgeVerifier {

	public static void main(String[] args) throws MyAgeException {

		AgeVerifier obj =  new AgeVerifier();
		Scanner scan  = new Scanner(System.in);
		System.out.println("Introdu varsta :");
		int age = scan.nextInt();
		
		
					obj.checkAgeLimit(age);
			
		
		
	}

}
