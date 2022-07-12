package Curs13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFileProcessor {

	public void writePropertiesFiles() throws IOException{
		
		try {
			OutputStream outPutStream = new FileOutputStream("test.properties");
			Properties prop = new Properties();
			prop.setProperty("user", "testUser");
			prop.setProperty("pass", "pass123");
			prop.setProperty("email", "test@email.com");
			prop.setProperty("country", "RO");
			
			prop.store(outPutStream, "am salvat fisierul properties");
			outPutStream.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	//read from file
	public void readPropertiesFile(String key) throws FileNotFoundException, IOException{
		
		try(InputStream inputStream = new FileInputStream("test.properties")) {
			
			Properties prop = new Properties();
			prop.load(inputStream);
			
			String value = prop.getProperty(key);
			System.out.println(value);
			
		}catch(FileNotFoundException e) {
			
		}
	}
	
	//update a file
	public void updatePropertiesFile(String key, String value) throws FileNotFoundException, IOException {
		
		Properties prop = new Properties();
		
		try(InputStream inputStream = new FileInputStream("test.properties")){
			
			prop.load(inputStream);
			
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try(OutputStream outputStream = new FileOutputStream("test.properties")){
			
			prop.setProperty(key, value);
			prop.store(outputStream, null);
			
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void deleteFromPropertiesFile(String key) throws IOException {
		
		Properties prop = new Properties();
		
		try(InputStream inputStream = new FileInputStream("test.properties")){
			
			prop.load(inputStream);
			
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(OutputStream output = new FileOutputStream("test.properties")){
			
			prop.remove(key);
			prop.store(output, key);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
