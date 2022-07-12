package curs12.package1;

class DefaultAccesModifer {

	/*
	 * Default inseamna ca nu specificam niciun acces modifier
	 * Scopul este limitat la pachetul in care se afla
	 * 
	 * Same class: yes
	 * SubClass in acelasi pachet :yes
	 * Alta clasa in acelasi pachet : yes
	 * 
	 * SubClasa in alt pachet : no
	 * Alta clasa in alt pachet :no
	 * 
	 * 
	 */
	
	String mesaj =  "Default modifier";
	
	void printMesaj() {
		System.out.println(mesaj);
	}
	
	
	
	public static void main(String[] args) {

		DefaultAccesModifer obj= new DefaultAccesModifer();
		obj.printMesaj();
		
		
	}

}
