package Curs17;

public class StringHomework {

	/**
	 * Vom face 4 metode :
		1. Prima metoda va verifica de catre ori apare cuvantul “Nulla” in acest string si va printa numarul
		2. A doua metoda va imparti stringul in cate propozitii cuprinde si le va printa fiecare pe randul ei in consola. Putem folosi split(). Ideal pe un obiect de tip StringBuilder (sb.toString().split())
		3. A treia metoda va folosi metoda deleteCharAt() din StringBuilder
		pentru a sterge toate aparitiile literei ‘a’
		4. A patra metoda va folosi clasa StringBuilder pentru a inlocui toate aparitiile literei ‘o’ cu caracterul ‘#’ . Putem folosi metoda
	setCharAt() din StringBuilder()
	 * 
	 * 
	 */
	
	
	
	public static String text = "Lorem ipsum dolor sit amet, consectetur "
			+ "adipiscing elit. Aliquam consectetur odio ac quam commodo, eu "
			+ "eleifend felis imperdiet. Integer bibendum nunc quis sem faucibus, "
			+ "vitae laoreet mi dignissim. Praesent eget ligula nec lorem varius "
			+ "malesuada. Nulla neque lacus, euismod quis erat nec, convallis "
			+ "vestibulum augue. Nullam et aliquet justo. Aliquam erat volutpat. "
			+ "Nulla elementum urna in dolor viverra, in efficitur lectus mattis.";
	
	public static void main(String[] args) {
		
		countWord();
		System.out.println("----------------");
		splitStringInPhrases();
		
		//String[] arrOfStr = text.split("\\.");
        //for (String a : arrOfStr) 
        //{
        //    System.out.println(a + ".");
		//}

		System.out.println("------deleting letter a----------");
		deleteAChar(text);
		System.out.println("---------replacing o with #-------");
		replaceLetters(text);
	}

	
	public static void countWord() {
		
		String[] array = text.split(" ");
		int count = 0;
		
		for(int i=0; i<array.length;i++) {
			if(array[i].equals("Nulla")) {
				count++;
			}
		}
		System.out.println("Cuvantul Nulla apare de: " + count);
		
	}
	
	public static void splitStringInPhrases() {
		
		StringBuilder sb = new StringBuilder(text);
		
		System.out.println("String = " + sb.toString());
		System.out.println("--------split------------");
			
		String[] arrOfStr2 = sb.toString().split("\\.");
		
		 for (String a : arrOfStr2) 
	        {
	            System.out.println(a + ".");
			}	
	}
	
	public static void deleteAChar(String text) {
		
		StringBuilder sb =  new StringBuilder(text);
		
		for(int i = sb.length()-1; i> -1; i--) {
		    if((sb.charAt(i) == 'a') || (sb.charAt(i) == 'A')) {
		        sb = sb.deleteCharAt(i);
		    }
		}
		System.out.println(sb);

	}
	
	public static void replaceLetters(String text) {
		
		StringBuilder sb =  new StringBuilder(text);
		
		for(int i = 0; i<sb.length(); i++) {
		    if((sb.charAt(i) == 'o') || (sb.charAt(i) == 'O')) {
		       sb.setCharAt(i,'#');
		    }
		}
		System.out.println(sb);
		
	}
}
