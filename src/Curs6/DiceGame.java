package Curs6;

import java.util.Scanner;

public class DiceGame {
	
	/**
	 * Facem un joc de zaruri care are urmatoarele reguli:
	 * daca userul da: 2, 6, 12 --> Pierde jocul -> ne oprim > BREAK
	 * daca userul da: 7, 11 ----> Castiga jocul -> ne oprim >BREAK
	 * daca userul da:3, 10 --> repeta aruncarea automat > CONTINUE
	 * daca userul da oricare dintre optiunile lipsa, il intrebam daca vrea sa mai dea inca o data
	 * raspunsul va fi un boolean: true/false -> ne oprim daca boolean este false
	 */

	public static void main(String[] args) {
		
		boolean condition = true;
		
		while(condition) {
			
			int dice1 = (int) (Math.random()*6+1);   //0.0 - 0.9
			int dice2 = (int) (Math.random()*6+1);
			int total = dice1+dice2;
			System.out.println("Ai dat: " + total);
			
			if(total == 2 || total == 6 || total == 12) {
				System.out.println("Imi pare rau! Ai dat: " + total + " Ai pierdut jocul!");
				break;
			} else if(total == 7 || total == 11) {
				System.out.println("Felicitari! Ai dat: " + total + " Ai castigat!");
				break;
			} else if(total == 3 || total == 10) {
				System.out.println("Ai dat: " + total + " Jocul continua! Automat mai dai o data!");
				continue;
			} else {
				System.out.println("Mai dai o data?");
				Scanner scan = new Scanner(System.in);
				condition = scan.nextBoolean();
				//scan.close();
			}
			
			
		}
		
		System.out.println("Game over!");

	}

}
