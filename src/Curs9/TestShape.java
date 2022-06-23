package Curs9;

public class TestShape {

	public static void main(String[] args) {


		Square obj =  new Square("Cerc", "Galben");
		
		System.out.println(obj.shapeColor);
		System.out.println(obj.shapeName);
		
		obj.displayDetails();
		
		Square obj2 = new Square();
		System.out.println(obj2.shapeColor);
		System.out.println(obj2.shapeName);
		
		obj2.displayDetails();
		
	}

}
