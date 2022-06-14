package Curs5;

import java.util.Scanner;

public class Palindrom {
	
	static String word;

	public static void main(String[] args) {

		System.out.println("Please enter a word: ");
		Scanner scan = new Scanner(System.in);
		word = scan.next();
		
		Palindrom rev = new Palindrom();
		
		System.out.println("Reverse of the entered word is " + rev.reversedNumber(word));
		
		if (word.equals(rev.reversedNumber(word))){
			System.out.println("Numarul este palindrom");
		} else {
			System.out.println("Numarul nu este palindrom");
		}
		
			
	}
	
	public static String reversedNumber(String no) {
		
		String reverse = "";
		
		for (int i=no.length();i>0;i--) {
		
			//System.out.println(i);
			//System.out.println(no.charAt(i-1));
			//System.out.println("------");
		reverse = reverse + (no.charAt(i-1));
		}
		return reverse;
		
	}

}
