package curs2;

public class MethodExample {

	/*
	 * numar de camere dinamic
	 * calcul al mp al fiecarei camere
	 * nr total de mp
	 * 
	 */
	
	
	
	public static void main(String[] args) {

		//room1
		int lenght = 4;
		int width = 2;
		int totalMP = lenght * width;
		System.out.println("Aria camerei 1 este:" + totalMP);
		
		//room2
		int lenght2 = 3;
		int width2 = 4;
		int totalMP2 = lenght2 * width2;
		System.out.println("Aria camerei 2 este:" + totalMP2);
		
		MethodExample room = new MethodExample();
		System.out.println(room.calculateArea(4, 2));
		
		MethodExample room2 = new MethodExample();
		System.out.println(room2.calculateArea(3, 3));
		
		MethodExample room3 = new MethodExample();
		System.out.println(room3.calculateArea(4, 4));
		
		int total = room.calculateArea(4, 2) + room2.calculateArea(3, 3) + room3.calculateArea(4, 4);
		System.out.println(total);
		
		
		System.out.println(calculateTotal(room.calculateArea(4, 2), room2.calculateArea(3, 3), room3.calculateArea(4, 4), 70));
	}
	
	
	public int calculateArea(int lenght, int width) {
		return lenght * width;
	}
	
	public void calculateArea(int lenght, int width) {
		System.out.println("Aria camerei este: " + lenght * width);
	}
	
	public static int calculateTotal(int...rooms) { //varargs --> argumente variabile --> int..rooms --> int[] rooms
		int result = 0;
		for(int room : rooms) {
			result = result + room;
			//result = 0 + 8;
			//8 = 8 + 12;
			//20 = 20 + 16;
		}
		
		return result;
	}
}
