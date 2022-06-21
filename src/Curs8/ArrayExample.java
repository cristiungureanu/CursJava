package Curs8;

public class ArrayExample {

	public static void main(String[] args) {


		String[] textArray = new String[5];
		
		//String textArrary2[] = new String[4];
		// String[] textArray = {null, null, null, null, null}
		textArray[0] = "This ";
		// String[] textArray = {This, null, null, null, null}
		//index of array  =      0      1     2     3     4  
		
		textArray[1] = "is ";
		textArray[2] = "an ";
		textArray[3] = "array";
		textArray[4] = "!";
		
		System.out.println(textArray[2]);
		
		for(String element : textArray) {
			System.out.print(element);
		}
	}

}
