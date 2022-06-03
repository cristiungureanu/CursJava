package Curs3;

import java.util.Scanner;

public class AskTheAge {
	
	int age;
	
	    //metoda 1 care citeste de la tastatura
		public void askHowOldAreYou() {
			System.out.println("How old are you? ");
			Scanner scan = new Scanner(System.in);
			age = scan.nextInt();
		}
		
		
		//metoda 2 care compara varstele
		public void compareTheAge() {
			
			if(age<18) {
				System.out.println("Esti minor!");
			}else if(age>=18 && age<=65) {
				System.out.println("Esti adult!");
			}else {
				System.out.println("Esti batran");
			}
		}

}
