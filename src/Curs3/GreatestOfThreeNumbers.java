package Curs3;

import java.util.Scanner;

public class GreatestOfThreeNumbers {

	/*
	 * Facem un program care citeste 3 numere de la tastatura si verifica care dintre ele este cel mai mare si printeaza in consola
	 * Daca 2 numere sunt egale, va printa "Some numbers are equal"
	 * 
	 * 
	 */
	
	//int number1, number2, number3;
	
	int number1;
	int number2;
	int number3;
	
	//metoda 1 care citeste de la tastatura
	public void askTheUserForThreeNumbers() {
		System.out.println("Please enter number1: ");
		Scanner scan = new Scanner(System.in);
		number1 = scan.nextInt();
		
		System.out.println("Please enter number2: ");
		number2 = scan.nextInt();
		
		System.out.println("Please enter number3: ");
		number3 = scan.nextInt();
		scan.close();
	}
	
	
	//metoda 2 care compara numerele si decide care este cel mai mare
	public void compareTheNumbers() {
		
		//AND --> &
		//OR --> ||
		if(number1 > number2 && number1 > number3) {
			System.out.println("The first number is the greatest!");
		}else if(number2 > number1 && number2 > number3) {
			System.out.println("the second number is greatest!");
			
		}else if (number3>number1 && number3>number2) {
			System.out.println("3 is the greatest");
		}else {
			System.out.println("some numbers are equals");
		}
	}
	
}
