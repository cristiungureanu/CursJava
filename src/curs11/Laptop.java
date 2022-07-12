package curs11;

public class Laptop extends Product {

	private int buyingPrice;
	private int tva;
	private int adaosComercial;
	
	public Laptop(int buyPrice,int tva, int adaos) {
		setAdaosComercial(adaos);
		setTva(tva);
		setBuyingPrice(buyPrice);
	}
	 
	public int getBuyingPrice() {
		return buyingPrice;
	}

	public void setBuyingPrice(int buyingPrice) {
		this.buyingPrice = buyingPrice;
	}


	public int getTva() {
		return tva;
	}


	public void setTva(int tva) {
		this.tva = tva;
	}


	public int getAdaosComercial() {
		return adaosComercial;
	}


	public void setAdaosComercial(int adaosComercial) {
		this.adaosComercial = adaosComercial;
	}
	
	@Override
	public int calculatePrice() {
		return buyingPrice + tva + adaosComercial;
	}

	

}
