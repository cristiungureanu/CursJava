package Curs17;

public class GenericsExample {

	public static void main(String[] args) {

		printDetails("Text");
		printDetails(123);
		printDetails(250.66);
		printDetails(true);
		
		

	}
	
	//generics
	public static <T> void printDetails(T obj) {
		
		System.out.println(" Obiectul meu: " + obj);
		System.out.println(" Data typeul obiectului meu: " + obj.getClass().getName());
		
	}
	
	/*
	public static void printDetails(String text) { // daca pui static nu mai faci obiect
		System.out.println(" Obiectul meu: " + text);
		System.out.println(" Data typeul obiectului meu: " + text.getClass());
	}

	
	public static void printDetails(Integer text) { 
		System.out.println(" Obiectul meu: " + text);
		System.out.println(" Data typeul obiectului meu: " + text.getClass());
	}*/
}
