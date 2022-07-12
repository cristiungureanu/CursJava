package Curs13;

public class ExceptionsExample {

	public static void main(String[] args) {


		String nume = null;
		int[] array = {1, 2, 3, 4};
		
		try {
			
			System.out.println("Salut " + nume);
			
			try {
				int x = 3;
				System.out.println(array[x]);
				
				System.out.println(nume.length());
		
			}catch(IndexOutOfBoundsException e) {
				System.out.println("Index out of bounds");
			}
			
			
		}catch(NullPointerException e) {
			System.out.println("Null pointer occured");
		}
			

	}

}
