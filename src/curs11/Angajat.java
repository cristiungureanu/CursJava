package curs11;

public interface Angajat {

	public static final String salariu = "100";

	void setName(String name);
	String getName();
	
	void setEmail(String email);
	String getEmail();

	//void setCeva();
	
	default void printNumeDepartament() {
		System.out.println("QA");}
}
