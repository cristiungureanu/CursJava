package curs15;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Considerand cele doua ArrayList de mai jos :
Primul contine : Product1 ; Product2 ; Product3 ; Product4 ; Product5
Al doilea contine : Product1 ; Product2 ; Product6 ; Product4 ; Product8
Avem nevoie sa verificam daca produsele din primul arraylist se afla si in al doilea arrayList
Rezultatul verificarii ar trebui sa fie un output de tip yes/no
Ex din consola:
 * 
 * [Yes, Yes, No, Yes, No]
 * 
 * @author Cristi
 *
 */


public class ArrayListHomework {

	public static void main(String[] args) {


		List<String> list1 = new ArrayList<>();
		list1.add("Product1");
		list1.add("Product2");
		list1.add("Product3");
		list1.add("Product4");
		list1.add("Product5");
		
		List<String> list2 = new ArrayList<>();
		list2.add("Product1");
		list2.add("Product2");
		list2.add("Product6");
		list2.add("Product4");
		list2.add("Product8");
		
		for(String nume : list1) {
			System.out.println(list1.indexOf(nume) + ": " + nume);
		}
		
		System.out.println("----------------");

		for(String nume : list2) {
			System.out.println(list2.indexOf(nume) + ": " + nume);
		}
		
		/*for(String nume1 : list1) {
			for(String nume2 : list2) {
				if(nume1.equals(nume2)) {
					System.out.println(nume1);
				}*/
		
		System.out.println("----------------");
		for(int i = 0; i<list2.size();i++) {
			if(list1.contains(list2.get(i))) {
				list2.set(i, "Yes");
			}else {
				list2.set(i, "No");
			}
		}
		
		for(String nume : list2) {
			System.out.print(nume + " ");
		}
		
	}

}
