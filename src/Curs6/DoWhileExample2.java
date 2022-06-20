package Curs6;

import java.util.Scanner;

public class DoWhileExample2 {
	
	/**
	 * facem un program care intreaba utilizatorul numere pe care le inmulteste cu 10
	 * facem asta pana utilizatorul introduce 0 si atunci iesim din program
	 * 
	 */

	public static void main(String[] args) {

		int numar;
		
		do {
			
			System.out.println("Please enter a number: ");
			Scanner scan = new Scanner(System.in);
			numar = scan.nextInt();
			
			if(numar == 0) {
				break;
			} else {
				System.out.println(numar*10);
			}
			
			
		} while(numar !=0);
		
		System.out.println("Exit program!");

	}

}
