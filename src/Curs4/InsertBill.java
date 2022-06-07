package Curs4;

import java.util.Scanner;

public class InsertBill {

	public static void main(String[] args) {
		
		double bill;
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the bill: ");
		bill = scan.nextInt();
		scan.close();
		
		double x = (bill>=100)? bill - (bill*0.1) : bill - (bill*0.05); 
		System.out.println("Rezultatul este: " + x);
	}
	
	
}
