package Curs14;

import java.io.IOException;

public class TestTextFileProcessor {

	public static void main(String[] args) throws IOException {
		
		TextFileProcessor obj = new TextFileProcessor();
		obj.writeFile("Textul meu scris in fisier\n");
		obj.readFile();
		System.out.println("---------------");
		
		obj.updateFile("alt text in fisier\n"); // \n pune textul pe randul urmator
		obj.updateFile("Alta linie\n");
		obj.readFile();
		obj.deleteLineFromFile("Alta linie", "");
		
		System.out.println("---------------");
		obj.readFile();
		obj.deleteFile();
	}

}
