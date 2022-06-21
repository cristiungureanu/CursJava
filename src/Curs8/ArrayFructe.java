package Curs8;

public class ArrayFructe {

	public static void main(String[] args) {

		Fructe objMar = new Fructe("Mar", 150);
		
		
		Fructe[] fruct = new Fructe[4];
		//Fructe[] fruct = {null, null, null, null}
		
		fruct[0] = new Fructe("Banana", 250);
		//System.out.println();
		fruct[0].printDetails();
		//Fructe[] fruct = {objBanana, null, null, null}
		fruct[1] = objMar;
		//Fructe[] fruct = {objBanana, objMar, null, null}
		System.out.println();
		
		objMar.printDetails();
		fruct[1].printDetails();
		
		objMar = new Fructe("Ionatan", 300);
		
		objMar.printDetails();
		System.out.println("=======");
		fruct[1].printDetails();
		fruct[2] = new Fructe("Para", 250);
		fruct[3] = new Fructe("Cireasa", 80);
		
		for(Fructe element : fruct) {
			element.printDetails();
		}
		
	}

}
