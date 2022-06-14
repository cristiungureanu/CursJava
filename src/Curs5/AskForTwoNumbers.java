package Curs5;

import java.util.Scanner;

public class AskForTwoNumbers {

	
	int number1;
	int number2;
	
	//metoda 1 care citeste de la tastatura 2 numere
	public void askTheUserForNumbers() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter number1: ");
		number1 = scan.nextInt();
		System.out.println("Please enter number2: ");
		number2 = scan.nextInt();
		
		scan.close();
		
		}
	
	// metoda 2 care va printa doar numerele pare aflate intre numerele citite indiferent daca nr1>n2 sau invers
	
	public void PrintEvenBetween2TwoNumbers() {
		
		if (number1<number2) {
			
			System.out.println("The even numbers between " + number1 + " and " + number2 + " are (with for): ");
			
			for(int i=number1+1; i<number2;i++) {
				if(i%2==0) {
					System.out.println(i);
				}
			}
		
			System.out.println("--------------------");
			System.out.println("The even numbers between " + number1 + " and " + number2 + " are (with while): ");
			
			int j = number1+1;
			while (j<number2 && j>number1) {
		
				if(j%2==0) {
					System.out.println(j);
					}
				j++;
			}
		} else {
		
				System.out.println("The even numbers between " + number1 + " and " + number2 + " are (with for): ");
				for(int i=number1-1; i>number2;i--) {
					if(i%2==0) {
						System.out.println(i);
					}
				}
		
				System.out.println("--------------------");
				System.out.println("The even numbers between " + number1 + " and " + number2 + " are (with while): ");
				
				int j = number1-1;
				while (j<number1 && j>number2) {
			
					if(j%2==0) {
						System.out.println(j);
						}
					j--;
				}
		
	}
}
}
