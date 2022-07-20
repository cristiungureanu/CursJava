package curs11;

public class Human extends Primate implements BasicNeeds{


	public String eat() {
		return "Omnivore";
		
	}

	@Override
	public void sleep() {
		System.out.println("I need to sleep!");
		
	}

	@Override
	public void drink() {
		
	}

	
}
