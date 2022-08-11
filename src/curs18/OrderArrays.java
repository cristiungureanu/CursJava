package curs18;

import java.util.Arrays;

/*
 * Considerand urmatoarele array-uri :
		String[] textArray = {"Alba", "Iasi", "Bacau", "Constanta"};
		Integer[] intArray = {100, 500, 300, 400, 200};
		Character[] charArray = {'a', 'b', 'd', 'c’};
   Vom face o singura metoda care ordoneaza aray-ul de tip String alfabetic, array-ul de tip Integer crescator, si array-ul de tip char tot  alfabetic
 * 
 * 
 */

public class OrderArrays {

	
	public static String[] textArray = {"Alba", "Iasi", "Bacau", "Constanta"};
	public static Integer[] intArray = {100, 500, 300, 400, 200};
	public static Character[] charArray = {'a', 'b', 'd', 'c'};
	
	public static void main(String[] args) {

		//orderArrays2();
		
		System.out.print("Ordered textArray[]: ");
		GenericOrder(textArray);
		
		System.out.print("Ordered textArray[]: ");
		GenericOrder(intArray);
		
		System.out.print("Ordered textArray[]: ");
		GenericOrder(charArray);
	}

	/*
	public static void orderArrays2() {
		
		Arrays.sort(textArray);
		Arrays.sort(intArray);
		Arrays.sort(charArray);
		
		System.out.println("Modified textArray[] : " + Arrays.toString(textArray));
		System.out.println("Modified intArray[] : " + Arrays.toString(intArray));
		System.out.println("Modified charArray[] : " + Arrays.toString(charArray));
		
	}*/
	
	public static <T> void GenericOrder(T[] elements) {
		
		Arrays.sort(elements);
		for(T element: elements) {
			System.out.printf("%s", element + " ");
		}
		System.out.println();
		
	}
}
