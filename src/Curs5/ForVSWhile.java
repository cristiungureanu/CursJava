package Curs5;

import java.util.Scanner;

public class ForVSWhile {

	
	/**
	 * facem un program care ii cere utilizatorului numere pe care le aduna
	 * userul introduce cate numere doreste(fara limita)
	 * cand doreste sa se opreasca va introduce 0
	 * 
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		rezolvareCuFor();
		rezolvareCuWhile();
		
	}
	
	public static void rezolvareCuFor() {
		
		System.out.println("Please enter a number: ");
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		
		for(int x=scan.nextInt();x!=0; x=scan.nextInt()) {
			sum+=x;
			System.out.println("Please enter a number: ");
		}
		//scan.close();
		System.out.println("Suma totala: " + sum);
	}
	
	
	public static void rezolvareCuWhile() {
		
		System.out.println("Please enter a number: ");
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int number = scan.nextInt();
		
		
		while(number!=0) {
			sum +=number;
			System.out.println("Please enter a number: ");
			number = scan.nextInt();
		}
		scan.close();
		System.out.println("Suma totala: " + sum);
	}

}
