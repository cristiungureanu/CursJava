package Curs8;

import java.util.Random;

public class ArrayExample2 {

	/*
	 * Facem un program care genereaza 6 numere intr 0-9
	 * le pune intr-un array
	 * nu pune numere duplicate
	 * printeaza arrayul
	 */
	
	//int[] numbers = new int[6];
	
	
	//constanta
	public final int LENGHT = 6; // constantele au valoarea unica si se scriu cu CAPS; FINAL - restrictioneaza posibilitatea de a-i asigna o alta valoare
	//int[] numbers = new int[LENGHT]
	
	public final int MAX_NUMBERS = 9;
	
	public static void main(String[] args) {
		ArrayExample2 obj = new ArrayExample2();
		obj.printArray(obj.generateNumbers());

	}
	
	//genereaza numere
	public int[] generateNumbers() {
		
		int[] numbers = new int[LENGHT];
		Random random = new Random();
		
		
		for(int i = 0;i<LENGHT;i++) {
			
			int randomNr = 0;
			
			do {
				randomNr = random.nextInt(MAX_NUMBERS);
					
			}while(checkForUnicity(numbers, randomNr));
			
			numbers[i] = randomNr;
		}
		
		return numbers;
	}
	
	//printeaza
	public void printArray(int[] array) {
		
		for(int nr : array) {
			System.out.print(nr + " | ");
		}
	}
	
	
	public boolean checkForUnicity(int[] array, int element) {
		
		for(int nr : array) {
			if(nr == element) {
				return true;
			}
		}return false;
		
	}
}
