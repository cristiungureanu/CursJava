package Curs7;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {

		/*
		 * intrebam userul ce calificativ a primit
		 * In functie de calificativ printam un mesaj:
		 * A -- Felicitari
		 * B -- Destul de bine
		 * C -- Suficient
		 * D-- insuficient
		 * 
		 * Daca introduce alt calificativ printam "Nota invalida"
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("te rog introdu o nota: ");
		String nota = scan.next();
		
		switch(nota.toUpperCase()) {
		
		case "A":
			System.out.println("Felicitari!");
			break;
		case "B":
			System.out.println("Destul de bine!");
			break;
		case "C":
			System.out.println("Suficient!");
			break;
		case "D":
			System.out.println("Insuficient!");
			break;
		default:
			System.out.println("Nota invalida!");
		}
	}

}
