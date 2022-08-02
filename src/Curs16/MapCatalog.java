package Curs16;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class MapCatalog {

	static String name;
	static int mark;
	
	public static void main(String[] args) {
		
		Map<String, Integer> catalog = new HashMap<>();
		
		catalog.put("Cristi", 7);
		catalog.put("Dan", 8);
		catalog.put("Alina", 10);
		catalog.put("Maria", 5);
		catalog.put("Vasile", 4);
		
		System.out.println(catalog);
		
		askTheStudent();
		//System.out.println("Numele citit este: " + name);
		//System.out.println("Nota citita este: " + mark);
		System.out.println("------------------------------");
		
		Verification(catalog);
		
		System.out.println("New catalog-----------------");
		System.out.println(catalog);
		
	}

	public static void askTheStudent() {
		
		System.out.println("Cum te cheama?");
		
		Scanner scan = new Scanner(System.in);
		try {
			name = scan.nextLine();
			name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Ce nota ai luat?");
		
		try {
		mark = scan.nextInt();
		} catch (InputMismatchException e) {
			
			System.out.println("Please insert only numeric");
		}

	}
	
	
	public static void Verification(Map<String, Integer> cat) {
		
		if(cat.containsKey(name)) {
			if(mark<=cat.get(name)) {
					System.out.println("Nu ai nevoie de alta nota!");
			}else {
				cat.replace(name, mark);
				}
				
			}
		else {
			cat.put(name, mark);
			System.out.println("Nu aveai nota, ti-am trecut acum!");
		}
		
		
	}
}
