package curs11;

public class TestProduct {

	public static void main(String[] args) {

		
		//Product produs  = new Product();
		
		Laptop laptop =  new Laptop(300, 19, 200);
		System.out.println(laptop.calculatePrice());
		laptop.printProductRating();
		
		Mobile mobile  =  new Mobile(120, 4);
		System.out.println(mobile.calculatePrice());
		mobile.printProductRating();
		
		
	}

}
