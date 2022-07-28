package Curs17;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		transformToString();
	}

	
	public static void transformToString() {
		
		char ch = 'a';
		String str = Character.toString(ch);
		String str2 = String.valueOf(ch);
		
		boolean bol = true;
		String str3 = Boolean.toString(bol); // "true"
		String str4 = String.valueOf(bol);
		
		String str5 = null;
		//System.out.println(str5.toString()); // daca obiectul este null toString() arunca NPE
		System.out.println(String.valueOf(str5)); // daca obiectul este null printeaza "null"
		
		//System.out.println(str.getClass());
	}
}
