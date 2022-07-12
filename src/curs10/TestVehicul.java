package curs10;

public class TestVehicul {

	public static void main(String[] args) {

		
		Vehicul objBicla = new Bicicleta("Cube", "fara poluare", 23);
		
		Vehicul objMasina = new Masina("BMW", "euro5", 71);
		
		System.out.println(objBicla.detaliiVehicul());
		System.out.println(objMasina.detaliiVehicul());
		
		System.out.println("------------------");
		
		verificaMotorizarea(objBicla);
		verificaMotorizarea(objMasina);

	}
	
	public static void verificaMotorizarea(Vehicul obiect) {
		
		if(obiect instanceof Bicicleta) {
			System.out.println("BICICLETA cu numele " + obiect.getBrand() + " si cu motorizarea "+ obiect.Motorizare("70"));
				
		}else if(obiect instanceof Masina) {
			System.out.println("MASINA cu numele: " + obiect.getBrand() + " si cu motorizarea: "+ obiect.Motorizare("2000"));
			
		}
	}

}
