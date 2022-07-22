package Curs14;

public class TestLongestWordInAFile {

	public static void main(String[] args) {


		LongestWordInAFile obj = new LongestWordInAFile();
		obj.writeFile("Scriem un program care verifica care este cel mai lung cuvant dintr-un fisier text si il printeaza.\n");
		obj.readFile();
		
		obj.VerifyLongestWord();
	}

}
