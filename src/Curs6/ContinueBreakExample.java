package Curs6;

public class ContinueBreakExample {

	public static void main(String[] args) {


		for(int i=0; i<10; i++) {
			if(i==5) {
				//break;
				continue; //te intoarce in for si face skip la ce urmeaza dupa if
			}
			System.out.println(i);
		}

	}

}
