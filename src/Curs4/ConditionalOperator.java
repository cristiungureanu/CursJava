package Curs4;

import java.util.Scanner;

public class ConditionalOperator {

	public static void main(String[] args) {
		/*
		 * Program care citeste 2 numere de la tastatura si verifica urmatoarele
		 * verifica daca fiecare numar este pozitiv
		 * verifica daca ambele numere sunt pozitive
		 * verifica care dintre cele 2 numere este mai mic
		 */
		
		int num1;
		int num2;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first number: ");
		num1 = scan.nextInt();
		System.out.println("Please enter second number: ");
		num2 = scan.nextInt();
		scan.close();

	
	//verifica daca num1 este pozitiv
	if (num1>0)
	{
		System.out.println("Num1 este pozitiv");
	}else {
		System.out.println("Num1 este negativ");
	}
	
	
	//result = conditie?expresie1:expresie2
	//result = num1>0 ? "Num1 este pozitiv" : "Num1 este negativ"
	
	//verificam daca num2 este pozitiv
	if (num2>0)
	{
		System.out.println("Num2 este pozitiv");
	}else {
		System.out.println("Num2 este negativ");
	}
	
	//verificam daca num1 si num2 sunt pozitive
	
	if ((num1>0) && (num2>0))
	{
		System.out.println("Num1 si Num2 sunt pozitive");
	}else {
		System.out.println("At least one if negative");
	}
	
	//verificam care dintre cele 2 numere este mai mic

	if (num1>num2) {
		System.out.println("Num2 is teh smallest");
	}else if(num1 == num2){
		System.out.println("Both are equals");
	} else {
		System.out.println("Num1 is the smallest");
	}
	
	String result;
	result = num1>0 ? "Num1 este pozitiv" : "Num1 este negativ";
	System.out.println(result);
	result = num2>0 ? "Num2 este pozitiv" : "Num2 este negativ";
	System.out.println(result);
	result = (num1>0)&&(num2>0) ? "Num1 si Num2 sunt pozitive" : "At least one if negative";
	System.out.println(result);
	result = (num1==num2)? "Both are equals" : (num1 <num2 ? "Num1 is the smallest" : "Num2 is teh smallest");
}
}
