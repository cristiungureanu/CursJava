package Curs4;

public class RewriteCode {

	public static void main(String[] args) {

		int comision;
		int vanzari = 3500;
		if (vanzari>2500) {
			comision = vanzari*5/100;
			System.out.println("Comisionul tau este: "+ comision);
		} else {
			comision = 0;
			System.out.println("Comisionul tau este: "+ comision);
		}

	}

}
