package curs2;

public class Tester {
	
	//variabile
	String nume;
	int ratePerHour;
	int age;
	
	
	//constructor default
	//public Tester() {}
	
	public Tester(String nume, int ratePerHour, int age) {
		setNume(nume);
		setRatePerHour(ratePerHour);
		setAge(age);
		}
	//metode getter & setter
	
	// string is return type
	public String getNume() {
		return nume;
	}
	
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	//this se foloseste ca sa faca distinctia intre numele de sus general vs cel din metoda local
	// tester tester1 - new Tester();
	//tester.setNume("Oana");
	//tester1.getNume() --> Oana
	
	// tester tester2 - new Tester();
	//tester.setNume("Diana");
	//tester2.getNume() --> Diana
	
	public int getRatePerHour() {
		return ratePerHour;
	}
	
	public void setRatePerHour(int ratePerHour) {
		this.ratePerHour = ratePerHour;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	

}
