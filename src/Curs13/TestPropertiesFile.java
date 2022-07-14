package Curs13;

import java.io.IOException;

public class TestPropertiesFile {

	public static void main(String[] args) throws IOException{


		PropertiesFileProcessor propFile = new PropertiesFileProcessor();
		
		propFile.writePropertiesFiles();
		propFile.readPropertiesFile("user");
		propFile.readPropertiesFile("email");
		propFile.readPropertiesFile("country7");
		
		
		System.out.println("-----------------");
		//propFile.updatePropertiesFile("country", "UK");
		//propFile.readPropertiesFile("country");
		
		//System.out.println("-----------------");
		//propFile.deleteFromPropertiesFile("email");
	}

}
