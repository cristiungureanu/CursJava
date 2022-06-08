package Curs5;

import java.util.Scanner;

public class WhileLoopExample2 {
	
	/*
	 * Facem un program care calculeaza salariul pe o saptamana
	 * intrebam userul cate ore a lucrat
	 * calculam doar daca numarul de ore este intre 1 si 40
	 * daca nr de ore este valid il rugam sa mai introduca o data (pana introduce un numar valid)
	 * 
	 */

	public static void main(String[] args) {
		
		int ratePerHour = 15;
		int maxHours = 40;
		
		System.out.println("Cate ore ai lucrat saptamana aceasta? : ");
		Scanner scan = new Scanner(System.in);
		int hoursWorked = scan.nextInt();
		
		while(hoursWorked>maxHours || hoursWorked<1) {
			System.out.println("Nr. invalid!");
			System.out.println("Te rog introdu un numar intre 1 si 40");
			hoursWorked = scan.nextInt();
		}
		System.out.println("Salariu de platit este: " + hoursWorked*ratePerHour);
	}

}
