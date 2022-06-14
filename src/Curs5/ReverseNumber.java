package Curs5;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		System.out.println("Please enter a number: ");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int reverse = 0;
		
		System.out.println("Numarul citit este: " + number);
		
		while(number!=0) {
			
			
			//construim numarul reverse
			reverse = reverse * 10;			
			reverse = reverse + number%10;	//luam restul lui number impartit la 10 (adica ultima cifra) si-l adaugam primul in numarul reverse
			number = number/10;   
		}

		System.out.println("Reverse number is " + reverse);
	}

}
