package Curs4;

public class TernaryOperator {

	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 10;

		int x = (num1>num2)? num1 : num2;
		
		System.out.println(x);

		// sau scrisa asa
		if (num1>num2) {
			x = num1;
		}else {
			x=num2;
		}
	}

}
