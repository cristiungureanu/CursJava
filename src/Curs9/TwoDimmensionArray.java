package Curs9;

import java.util.Arrays;

public class TwoDimmensionArray {

	public static void main(String[] args) {


		int [][] array = {{1,2}, {3,4}};
		/*
		 *      column0 column1
		 * row0    1        2
		 * row1    3        4 
		 * 
		 */
		System.out.println(array[0][1]);
		System.out.println(array[1][1]);
		
		for(int i= 0;i<2; i++) {
			for(int j = 0; j<2; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int[] row : array) {
			System.out.println(Arrays.toString(row));
			for(int col : row) {
				System.out.println("COL: " + col);
			}
		}
		System.out.println("=============================");
		
		/*
		 * T[][] array = new T[][]  --> string row, int col sau boolean etc ["String", 123, true]
		 * 
		 * 
		 * 							col0	col1	col2	col3
		 *  testArray --> 	row0	Rosu	Verde	Galben	Alb
		 *  				row1	Iasi	Alba	Cluj	Pitesti
		 */
		String[][] textArray = new String[2][4];
		textArray[0][0] = "Rosu";
		textArray[0][1] = "Verde";
		textArray[0][2] = "Galben";
		textArray[0][3] = "Alb";
		
		textArray[1][0] = "Iasi";
		textArray[1][1] = "Alba";
		textArray[1][2] = "Cluj";
		textArray[1][3] = "Pitesti";
		
		//row
		System.out.println("ROW NR: " + textArray.length);
		
		//col
		System.out.println("COL NR: " + textArray[0].length);
		
		for(int i=0; i<textArray.length; i++) {
			System.out.println("ROW :");
			for(int j=0; j<textArray[0].length; j++) {
				System.out.println("COLUMN: " + textArray[i][j] + " ");
			}
			
		}
		
	}

}
