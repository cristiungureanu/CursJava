package Curs9;

public class TestInheritance {

	public static void main(String[] args) {

		TesterAutomat tester = new TesterAutomat();
		tester.seniority = "Senior";
		tester.name = "Ion";
		
		
		tester.setProgrsammingLanguage("Java");  	//clasa TesterAutomat
		tester.setDepartament("QA"); 				//clasa Tester
		tester.setSeniority("Junior");  			//clasa Tester
		tester.setEmail("matei@matei.com"); 		// clasa Angajat
		tester.setName("Matei"); 					//clasa Angajat
		
		System.out.println("Numele angajatului este " + tester.getName() + " face parte din departamentul " 
		+ tester.getDepartament() + " , este de nivel " + tester.getSeniority() + " si foloseste " +
				tester.getProgrsammingLanguage() + " pentru a scrie teste!");
		
		/*
		 * POM - PageObjectModel
		 * 
		 * pageObjects (ContactPage, HomePage ...)
		 * teste (ClaseTest1, ClasaTest2...)
		 * utils (Driver, Logging, Screenshots..., SeleniumUtils)
		 * 
		 * contactPage.metoda1
		 * 
		 * @Test
		 * public void doSomething(){
		 * 
		 * Driver driver = new Driver()
		 * SeleniumUtils utils = new SeleniumUtils
		 * ContactPahge ctPage =  new ContactPage
		 * 
		 * driver.findElement
		 * utils.ceva
		 * ctPage.locator
		 * 
		 */
		
	}

}
