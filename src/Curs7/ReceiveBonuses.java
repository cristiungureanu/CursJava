package Curs7;

import java.util.Scanner;

public class ReceiveBonuses {

	int YearsOfExperience;
	int Sales;
	int Month;
	static int bonus = 0;
	
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu anul de vechime in firma: ");
		int YearsOfExperience = scan.nextInt();
		
		int Sales; 
		int Month;
		
		switch(YearsOfExperience) {
		case 1:
			bonus = 100;
			System.out.println("Angajatul are 1 an vechime si primeste un bonus de: " + bonus);
			break;
		case 2:
			bonus = 200;
			System.out.println("Angajatul are 2 ani vechime si primeste un bonus de: " + bonus);
			break;
		case 3:
			System.out.println("Te rog introdu valoarea vanzarilor efectuate: ");
			Sales = scan.nextInt();
			
			if(Sales<=5000) {
				
				bonus = 600;
				System.out.println("Angajatul are 3 ani vechime si primeste un bonus de: " + bonus);
				
			} else if(Sales<=10000) {
				
				System.out.println("Te rog introdu luna care a efectuat vanzarile: ");
				Month = scan.nextInt();
				
				switch(Month) {
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
					bonus = 800;
					System.out.println("Angajatul are 3 ani vechime si valoarea vanzarilor este <=10000 si vanzarile au fost efectuate in oricare din lunile 1-6 =>primeste un bonus de: " + bonus);
					break;
				case 7:
				case 8:
				case 9:
				case 10:
				case 11:
					bonus = 1000;
					System.out.println("Angajatul are 3 ani vechime si valoarea vanzarilor este <=10000 si vanzarile au fost efectuate in oricare din lunile 7-11 =>primeste un bonus de: " + bonus);
					break;	
				case 12:
					bonus = 900;
					System.out.println("Angajatul are 3 ani vechime si valoarea vanzarilor este <=10000 si vanzarile au fost efectuate in oricare din luna 12 =>primeste un bonus de: " + bonus);
					System.out.println("In decembrie se vand singure!");
					break;
				}
			} else {
				bonus = 1200;
				System.out.println("Angajatul are 3 ani vechime si valoarea vanzarillor este > 10000 =>primeste un bonus de: " + bonus);
			}
			
		default:
			System.out.println("Nu se poate calcula bonusul");
			}
		
			
	
}
	
}
