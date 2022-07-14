package Curs13;

import java.io.IOException;
import java.util.Scanner;

public class TestCaloriiLegume {

	public static void main(String[] args) throws IOException {


		CaloriiLeguma testProp = new CaloriiLeguma();
		testProp.writePropertiesFilesVegetables();
		
		Scanner scan = new Scanner(System.in);
		
		do {
			
		System.out.println("Ce leguma vrei sa cumperi?");
		String vegetable = scan.nextLine().toLowerCase();
		String calorie = testProp.readPropertiesFileCalories(vegetable);
		
		if(calorie != null) {
			System.out.println("Leguma aleasa de tine are " + calorie + " calorii");
			break;
		} 
		System.out.println("Nu vindem aceasta leguma");
		
		
		}
		while(true);
	}

}
