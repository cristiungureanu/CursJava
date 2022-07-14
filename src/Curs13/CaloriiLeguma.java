package Curs13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class CaloriiLeguma {

	//scriem intr-un properties file 5 legume si un nr de calorii asociat lor
	public void writePropertiesFilesVegetables() throws IOException{
		
		try {
			OutputStream outPutStream = new FileOutputStream("vegetables.properties");
			Properties prop = new Properties();
			prop.setProperty("morcov", "58");
			prop.setProperty("rosie", "20");
			prop.setProperty("castravete", "40");
			prop.setProperty("ceapa", "5");
			prop.setProperty("usturoi", "31");
			
			prop.store(outPutStream, "am salvat fisierul properties");
			outPutStream.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//citim din properties file valoarea caloriilor
	public String readPropertiesFileCalories(String leguma) throws FileNotFoundException, IOException {
		String calorie = null;
		try(InputStream inputStream = new FileInputStream("vegetables.properties")){
			
			Properties prop = new Properties();
			prop.load(inputStream);
			
			calorie = prop.getProperty(leguma);
		}catch(FileNotFoundException e) {
			
		}
		
		return calorie;
	}
}
