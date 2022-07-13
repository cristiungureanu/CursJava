package curs12.package3;

import java.util.Scanner;

public class Account {

	private int accountNumber;
	public double balance;
	public Customer accountOwner;
	
	public Account(int accountNumber, double balance, Customer accountOwner) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountOwner = accountOwner;
	}
	
	
	public void withdraw(double sum) throws InsufficientFundsException{
		}
}
