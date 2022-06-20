package Curs6;

public class Fibonacci {

	static int howManyNo = 9;
	static int sum;
	int sumTotal;
	static int no1 = 0;
	static int no2 = 1;
	
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(no1 + " ");
		sb.append(no2);
		
		
		// building the sequence with FOR
		/*
		 * for(int i=0; i<howManyNo-2;i++) {
		 * 
		 * sum = no1+no2; sb.append(" " + sum); 
		 * no1 = no2; 
		 * no2 = sum; 
		 * }
		 *
		 */System.out.println(sb.toString());
		
		// building the sequence with WHILE
		int j=0;
		while(j<howManyNo-2) {
			sum = no1+no2;
			sb.append(" " + sum);
			no1 = no2;
			no2 = sum;	
			j++;
		}
		System.out.println(sb.toString());

	}

}
