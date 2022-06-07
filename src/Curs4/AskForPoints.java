package Curs4;

import java.util.Scanner;

public class AskForPoints {
	
	int points;
	
	//metoda 1 care citeste de la tastatura
	public void askTheUserForScore() {
		System.out.println("Please enter a score: ");
		Scanner scan = new Scanner(System.in);
		points = scan.nextInt();
		scan.close();
		}
			
			
		//metoda 2 care compara scorurile
		public void compareTheScores() {
	
			String x = (points>=90)?"FB":(points>=80?"B":"S");
			String y = (x.equals("FB"))?"Ai primit: FoarteBine":((x.equals("B"))?"Ai primit: Bine":"Ai primit: Suficient");
			System.out.println(y);
		}

}
