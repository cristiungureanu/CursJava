package Curs8;

import java.util.Scanner;

public class ReadNumbersAndPutThemInArray {

	public final static int LENGHT = 10;
	static int[] array = new int[LENGHT];
		
	public static void main(String[] args) {

		ReadNumbersAndPutThemInArray obj = new ReadNumbersAndPutThemInArray();
		obj.askForNumbers();
		obj.printArray(array);
		obj.sum(array);

	}
	
	// enter 10 numbers and return array
	public int[] askForNumbers() {
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0;i<LENGHT;i++) {
			int j = i+1;
			System.out.println("Please insert nr " + j + ": ");
			array[i] = scan.nextInt();
		}
		
		return array;
	}
	
	// array print
	public void printArray(int[] array) {
		
		for(int nr : array) {
			System.out.print(nr + " | ");
			
		}
	}
	
	//adding array numbers
	public int sum(int[] array) {
		
		int result=0;
		for(int i=0;i<LENGHT;i++) {
			result+=array[i];
		}
		System.out.println();
		System.out.println("Suma numerelor din array este: " + result);
		return result;
		
	}

}
