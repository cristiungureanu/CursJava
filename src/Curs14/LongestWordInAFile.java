package Curs14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LongestWordInAFile {
	
	/**
	 * Scriem un program care verifica care este cel mai lung cuvant
		dintr-un fisier text si il printeaza.
		Textul il alegeti voi.
		Fisierul poate fi creat manual
	 * 
	 * 
	 * 
	 * 
	 */
	
	public String longestWord = "";
	public String current;
	

	//write to txt file
		public void writeFile(String textToWrite) {
			
			try {
				FileWriter myFileWriter = new FileWriter("longest.txt");
				myFileWriter.write(textToWrite);
				myFileWriter.close();
				System.out.println("Successfully wrote to file!");
			}catch(IOException e) {
				System.out.println("Cannot write to file");
				e.printStackTrace();
			}
		}
		
	//read from file
		public void readFile() {
			
			File objFile = new File("longest.txt");
			
			try {
				Scanner scan = new Scanner(objFile);
				
				while(scan.hasNext()) {
					String text = scan.nextLine();
					System.out.println("text file: " + text);
				}
				scan.close();
				
			}catch(Exception e) {
				System.out.println("cannot read file");
				e.printStackTrace();
			}
		}
		
		//find and print the longest word in a file
		public String VerifyLongestWord() {
			
			File objFile = new File("longest.txt");
			
			try {
				Scanner scan = new Scanner(objFile);
				
				while(scan.hasNext()) {
					
					current = scan.next();
					//System.out.println("current is: " + current);
					
					if(current.length()>longestWord.length()) {
						longestWord = current;
					}
				}
				scan.close();
				
			}catch(Exception e) {
				System.out.println("cannot read file");
				e.printStackTrace();
			}
			
			System.out.println("longest word is: " + longestWord);
			
			return longestWord;
		}
}
