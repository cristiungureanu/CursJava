package Curs4;

public class IncrementDecrement {

	public static void main(String[] args) {
		
		//num++  --> postincrement
		//++num  -->preincrement
		//num1+1
		
		int num = 10;
		System.out.println("----------POST-----------");
		System.out.println("Valoarea lui num inainte de increment: " + num);
		System.out.println("Valoarea lui num in post increment: " + num++);
		System.out.println("Valoarea lui num dupa post increment: " + num);
		
		System.out.println("----------PRE-----------");
		
		int num2 = 10;
		System.out.println("Valoarea lui num inainte de increment: " + num2);
		System.out.println("Valoarea lui num in pre increment: " + ++num2);
		System.out.println("Valoarea lui num dupa pre increment: " + num2);
		
		//pre increment --> ++num
		//post increment --> num++
		//pre decrement --> --num
		//post decrement --> num--
	}

}
