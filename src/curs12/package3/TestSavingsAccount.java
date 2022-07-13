package curs12.package3;

import java.util.Scanner;

public class TestSavingsAccount {

	public static void main(String[] args) throws InsufficientFundsException {
		
		Customer obj = new Customer("Cristi", "Craiova", "email@yahoo.com");
		SavingsAccount acc = new SavingsAccount(3, 1000, obj);
		
		System.out.println("Hi " + obj.name);
		System.out.println("Please enter the amount to withdraw: ");
		
		Scanner scan = new Scanner(System.in);
		double sum = scan.nextDouble();
		
		acc.withdraw(sum);

	}

}
