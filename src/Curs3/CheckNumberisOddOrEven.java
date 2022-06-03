package Curs3;

import java.util.Scanner;

public class CheckNumberisOddOrEven {
	
	int number;
	
	/*
	 * Program care verifica daca un nr este par sau impar
	 * Daca nr este par atunci printeaza "Numer is even"
	 * daca nr este impar atunci printeaza "Number is odd"
	 * Numarul este dat dinamic(citit de la tastatura)
	 * 
	 */

	//metoda 1 care citeste nr de la tastatura
	public void askTheUserForANumber() {
		System.out.println("Please enter a number: ");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		
	}
	
	//metoda 2 care verifica daca numarul este par sau impar
	
	public void checkNumber() {
		
		// % --modulus 2 == 2
		if(number % 2 == 0) {
			System.out.println("Number is even!");
			
		}else {
			System.out.println("Number is odd!");
		}
		
	}
}
