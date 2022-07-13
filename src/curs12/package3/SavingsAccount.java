package curs12.package3;

public class SavingsAccount extends Account{

	
	public SavingsAccount(int accountNumber, double balance, Customer accountOwner) {
		super(accountNumber, balance, accountOwner);
	}

	public void withdraw(double sum) throws InsufficientFundsException{
		
		if (sum>balance) {
			System.out.println("The amount you entered is greater than the available balance: " + balance);
			System.out.println("Thank you for using our ATM!");
			throw new InsufficientFundsException("Insuficient funds for transaction!");
			
		}else {
			balance = balance - sum;
			System.out.println("Please pick your money!");
			System.out.println("Your new balance is: " + balance);
			System.out.println("Thank you for using our ATM!");
		}
		
		}
}
