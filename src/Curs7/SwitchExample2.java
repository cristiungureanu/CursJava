package Curs7;

import java.util.Scanner;

public class SwitchExample2 {

	/*
	 * facem un program care verifica daca un student are dreptul la bursa de studii
	 * Conditiile sunt:
	 * sa fie anul 3
	 * sa aiba un punctaj de 80 pentru bursa 1
	 * sa aiba un punctaj de 50 pentru bursa 2
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		System.out.println("Te rog introdu ce an esti: ");
		Scanner scan = new Scanner(System.in);
		int an = scan.nextInt();
		
		int punctaj;// = scan.nextInt();
		
		switch(an) {
		
		case 1:
		case 2:
			System.out.println("Nu esti eligibil pentru bursa");
			break;
		case 3:
			System.out.println("Te rog introdu punctajul: ");
			punctaj = scan.nextInt();
			
			switch(punctaj) {
				case 50:
					System.out.println("Esti eligibil pentru bursa 2");
					break;
				case 80:
					System.out.println("Esti eligibil pentru bursa 1");
					break;
				default:
					System.out.println("te rog introdu o valoare valida!");
				}
			break;
		default:
			System.out.println("te rog introdu un an valid!");
		}
		

	}

}
