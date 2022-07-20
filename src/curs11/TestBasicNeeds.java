package curs11;

public class TestBasicNeeds {

	public static void main(String[] args) {
		
		Human objHuman = new Human();
		System.out.println("Primate instance of HUMAN:");
		objHuman.walk();
		objHuman.run();
		System.out.println(objHuman.eat());
		objHuman.speak();
		objHuman.sleep();
		
		System.out.println("--------------------");
		
		Monkey objMonkey = new Monkey();
		System.out.println("Primate instance of MONKEY:");
		objMonkey.walk();
		objMonkey.run();
		objMonkey.sleep();
		System.out.println(objMonkey.eat());
		objMonkey.speak();
		

	}

}
