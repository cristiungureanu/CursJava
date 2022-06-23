package Curs8;

public class DuplicateNames {

	static String[] myStringArray = {"Maria", "Bob","Ion", "George", "Oana", "Bogdan", "Oana", "Ion"};
	
	public static void main(String[] args) {

		DuplicateNames obj = new DuplicateNames();
		obj.PrintDuplicates(myStringArray);	
		
	}

	public void PrintDuplicates(String[] str) {
				
		for(int i=0;i < myStringArray.length; i++) {
			for(int j=i+1; j<myStringArray.length;j++) {
				if (myStringArray[i].equals(str[j])) {
					System.out.println("Nume duplicat " + str[j]);
			}
		}
		
	}
}
}