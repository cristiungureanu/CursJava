package Curs13;

import java.util.Scanner;

public class ExceptionExample2 {

	public static void main(String[] args) {
		
		ExceptionExample2 obj = new ExceptionExample2();
		obj.division();

	}
	
	public void division() {
		Scanner scan = new Scanner(System.in);
		int num1, num2, sum;
		
		do {
			
			try {
			System.out.println("Please enter number 1: ");
			
			try {
			num1 = Integer.parseInt(scan.next());
			}catch(NumberFormatException e) {
				System.out.println("Please enter only numeric inputs");
				continue;
			}
			
			System.out.println("Please enter number 2: ");
			try {
				num2 = Integer.parseInt(scan.next());
				}catch(NumberFormatException e) {
					System.out.println("Please enter only numeric inputs");
					continue;
				}
			
			if(num1==0 || num2==0) {
				throw new ArithmeticException("One of the numbers is 0. Try again!");
			}
			sum = num1/num2;
			System.out.println("Results:" + sum);
			break;
			
			}catch(Exception e) {
				System.out.println(e.getMessage());
			};
			
		}while(true);
	}

}
