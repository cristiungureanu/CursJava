package Curs3;

public class TestCar {

	public static void main(String[] args) {
		
		//obiect care va chema constructorul
		Car obj = new Car("Bmw",2000);
		
		System.out.println(obj.carDetails());
		
		Car obj2 = new Car("Audi", 3000);
		
		// schimbam valoarea variabilei type in "sedan"
		Car.type = "sedan";
		
		System.out.println(obj2.carDetails());
		
		System.out.println(obj.carDetails());
		/* toate cele 3 printuri sunt corecte:
		 * 
		 * 	All Bmw cars are 2000 and are of type Suv
			All Audi cars are 3000 and are of type sedan
			All Audi cars are 3000 and are of type sedan
		 * 
		 * din cauza ca variabilele sunt statice (variabile de clasa) toate obiectele instantiate au valorile ultimului obiect instantiat (in cazul de fata obj2 si type=sedan)
		 * pentru ca fiecare obiect sa aiba valori diferite variabilele trebuie sa fie non-statice
		 * 
		 * 
		 */
		
		//Car obj3 = new Car("Benz", 5000);
		//System.out.println(obj.carDetails());
		

	}

}
