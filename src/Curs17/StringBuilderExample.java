package Curs17;

public class StringBuilderExample {

	public static void main(String[] args) {
		reverseSttring("Java");
		deleteFromString("Eu invat java");	
		replaceFromString("Salut Bogdan", 6, 12, "Oana");
		insertIntoString("Salut ", 5, "Ion");
		
	}

	public static void reverseSttring(String text) {
		StringBuilder sb = new StringBuilder(text);
		sb.reverse();
		System.out.println(sb);
	}
	
	public static void deleteFromString(String text) {
		StringBuilder sb = new StringBuilder(text);
		sb.delete(2, 6);
		System.out.println(sb);
	}
	
	public static void replaceFromString(String text, int stratIndex, int endIndex, String textToReplace) {
		StringBuilder sb =  new StringBuilder(text);
		sb.replace(stratIndex, endIndex, textToReplace);
		System.out.println(sb);
		
	}
	public static void insertIntoString(String text, int indexStart, String textToInsert) {
		StringBuilder sb =  new StringBuilder(text);
		sb.insert(indexStart, textToInsert);
		System.out.println(sb);

	}
	
}