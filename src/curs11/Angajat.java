package curs11;

public interface Angajat {

	public static final String salariu = "300";

	void setName(String name);
	String getName();
	
	void setEmail(String email);
	String getEmail();

	default void setCeva() {
	}
	
	default void printNumeDepartament() {
		System.out.println("QA");}
}
