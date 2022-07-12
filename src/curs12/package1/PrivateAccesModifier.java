package curs12.package1;

public class PrivateAccesModifier {

	/*
	 * Scopul este limitat la clasa in care se afla
	 * clasa sau interfata nu poate fi declarata ca private
	 * 
	 * Aceasi clasa: yes
	 * 
	 * Subclasa acealsi pachet : no
	 * Alta clasa acealsi pachet : no
	 * Subclasa alt pachet : no
	 * Alta clasa alt pachet :no
	 * 
	 * 
	 */
	
	private String mesaj = "Private";
	
	private PrivateAccesModifier() {}
	
	public static void main(String[] args) {

	}

}
