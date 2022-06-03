package Curs3;

public class Car {
	
	//variabile
	public static String brand;
	public static String type;
	public static int engine;
	
	
	public Car() {
	}
	//constructor
	public Car(String brand, int engine) {
		setBrand(brand);
		setEngine(engine);
		type = "Suv";
		
	}

	public static String getBrand() {
		return brand;
	}

	public static void setBrand(String brand) {
		Car.brand = brand;
	}

	public static int getEngine() {
		return engine;
	}

	public static void setEngine(int engine) {
		Car.engine = engine;
	}
	
	//metoda static care returneaza un String
	public static String carDetails() {
		//System.out.println("All " + brand + " cars are " + engine + " and are of type " + type);
		String ret = "All " + brand + " cars are " + engine + " and are of type " + type;
		return ret;
		
	}
}


