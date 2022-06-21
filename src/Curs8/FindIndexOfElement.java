package Curs8;

public class FindIndexOfElement {

	int[] number = {3, 4, 5,8, 7, 9};
	
	/*
	 * Avem un array de tip integer
	 * vrem sa printam care este elementul si indexul unui anume element
	 * Ex: index pt element 8 este 3
	 * 
	 * rezolvare cu FOR
	 * rezolvare cu FOR EACH
	 * 
	 */
	
	public static void main(String[] args) {

		FindIndexOfElement obj = new FindIndexOfElement();
		System.out.println("Rezolcare cu FOR");
		obj.rezolvareCuFor(8);
		System.out.println("---------------");
		System.out.println("Rezolcare cu FOR EACH");
		obj.rezolvareCuForEach(8);
		System.out.println("---------------");
		System.out.println("Rezolcare cu WHILE");
		obj.rezolvareCuForEach(8);

	}
	
	//rezolvare cu FOR
	public void rezolvareCuFor(int element) {
		
		for(int i=0; i<number.length; i++ ) {
			if(number[i] == element) {
				System.out.println("index pentru element " + element + " este " + i);
			}
		}
		
	}
	
	//rezolvare cu FOR EACH
	public void rezolvareCuForEach(int element) {
		int i = 0;
		for(int nr : number) {
			if(nr == element) {
				System.out.println("index pentru element " + element + " este " + i);
			}
		i++;
		}
	}	
	
	
	//rezolvare cu WHILE
	public void rezolvareCuWhile(int element) {
		int i = 0;
		while(i<number.length) {
			if(number[i] == element) {
				System.out.println("index pentru element " + element + " este " + i);
			}
		i++;
		}
	}
}
