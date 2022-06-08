package Curs5;

import java.util.Scanner;

public class LetterSearch {

	/*
	 * cerem un string de la tastatura
	 * cautam in stringul de la tastatura daca contine litera A
	 * daca o gasim, printam litera 'A exista in text'
	 * daca nu o gasim, printam 'litera A nu exista in text'
	 * si printam de cate ori apare
	 */
	
	public static void main(String[] args) {

		System.out.println("Please enter a text: ");
		Scanner scan = new Scanner(System.in);
		String text = scan.next().toUpperCase();
		char letter = 'A';
		System.out.println(text);
		
		//masina
		//012345
		
		//boolean letterFound = false;
		int counter = 0;
		
		System.out.println(text.length());
		
		for (int i=0;i<text.length();i++) {
			
			if (text.charAt(i)==letter) {
		//		letterFound = true;
				counter++;
			}
		}
		if (counter>0) {
			System.out.println("Litera A exista in text de " + counter);
			
		} else {
			System.out.println("Litera A nu exista in text");
		}

	}

}
