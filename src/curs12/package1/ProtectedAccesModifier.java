package curs12.package1;

public class ProtectedAccesModifier {

	/*
	 * Scopul lui este in acelasi pachet si sub-clase din pachete diferite
	 * Clasele NU pot fi declarate ca protected
	 * 
	 * Aceasi clasa : yes
	 * Alta clasa acelasi pachet : yes
	 * 
	 * SubClasa in acelasi pachet :yes
	 * 
	 * Subclasa in alt pachet : yes
	 * Alta clasa in alt pachet : no
	 * 
	 * 
	 */
	
	protected String mesaj = "Protected Acces";
	
	protected void printMesaj() {
		System.out.println(mesaj);
	}
	
	
	public static void main(String[] args) {
		ProtectedAccesModifier obj = new ProtectedAccesModifier();
		obj.printMesaj();
	}
	
}
