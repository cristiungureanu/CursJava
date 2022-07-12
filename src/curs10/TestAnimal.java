package curs10;

public class TestAnimal {

	public static void main(String[] args) {

		
	/*	Animal animal =  new Animal();
		animal.makeSound();
		
		System.out.println("---------------------------");
		
		Lion leu  = new Lion();
		leu.makeSound();
		leu.eatMeat();
	
		System.out.println("---------------------------");

		Deer bambi = new Deer();
		bambi.makeSound();
		bambi.eatGrass(); */
		
		//WebDriver driver = new FirefoxDriver();
		
		//Animal -> Leu --> leu--> ANimal si Leu
		// !Leu -->Animal --> comun Animal&Leu si ce exista in leu
		//Leu avem makesSound(comun Animal&Leu) si avem eatMeat(exista in leu)
		
		Animal leu = new Lion();
		leu.makeSound();
		((Lion) leu).eatMeat();
		leu.metodaAnimal();
		feedAnimal(leu);
		
		leu = new Deer();
		leu.makeSound();
		((Deer)leu).eatGrass();
		feedAnimal(leu);
		
		/*Lion simba  = new Lion();
		simba.makeSound();
		simba.eatMeat();
		simba.metodaAnimal();*/
			
	}
	
	public static void feedAnimal(Animal obiect) {
		
		if(obiect instanceof Lion) {
			System.out.println("you are geeting burgers!");
		}else if(obiect instanceof Deer) {
			System.out.println("you are getting salad!");
		}
	}
	
	
	/*
	 * HomePage
	 * ContactPage
	 * ShopCartPage
	 * ProductPage
	 * 
	 * 
	 * HomePage homepgae = new HomepAge()
	 * ProductPage ProductPage =  new ProductPage
	 * ShopCartPage ShopCartPage = new ShopCartPage
	 * 
	 * app.homePage.ceva
	 * app.productPage.ceva
	 * 
	 * 
	 * ShopCartPage shopCart = homepage.navToShoprCart()
	 * ProductPage productPage = homepage.navToProduct()
	 * 
	 */
	
	
	
	

}
