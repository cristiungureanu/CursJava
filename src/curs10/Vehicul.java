package curs10;

import java.util.Scanner;

public class Vehicul {
	
	private String brand;
	private String nivelPoluare;
	private int vitezaMedie;
	
	
	// getters and setters
	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getNivelPoluare() {
		return nivelPoluare;
	}


	public void setNivelPoluare(String nivelPoluare) {
		this.nivelPoluare = nivelPoluare;
	}


	public int getVitezaMedie() {
		return vitezaMedie;
	}


	public void setVitezaMedie(int vitezaMedie) {
		this.vitezaMedie = vitezaMedie;
	}
	
	
	public String Motorizare(String motorizare) {
		return motorizare; 
	}
	
	public String detaliiVehicul() {
		
		String ret = "Nivelul de poluare pentru " + brand + " este: " + nivelPoluare + " si viteza medie atinsa este de " + vitezaMedie + " km/h";
		return ret;
	}
	

}
