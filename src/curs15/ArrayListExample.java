package curs15;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {


		List<String> list = new ArrayList<>();
		//int[] number = new int[6];
		
		System.out.println(list.size());
		
		//add elements
		list.add("Oana");
		list.add("Ioana");
		list.add("Maria");
		list.add("Ion");
		
		System.out.println(list.size());
		
		for(String nume : list) {
			System.out.println(list.indexOf(nume) + ": " + nume);
		}
		
		System.out.println("----------------");
		
		list.add(0, "Bogdan");
		
		for(String nume : list) {
			System.out.println(list.indexOf(nume) + ": " + nume);
		}
		
		System.out.println(list.get(3));
		
		System.out.println("----------------");
		
		list.remove(0);
		list.remove("Maria");
		
		for(String nume : list) {
			System.out.println(list.indexOf(nume) + ": " + nume);
		}
		
		
		System.out.println("----------------");
		list.set(0, "Carmen"); //update
		for(String nume : list) {
			System.out.println(list.indexOf(nume) + ": " + nume);
		}
		System.out.println("----------------");
		System.out.println(list.contains("Ion"));
	}

}
