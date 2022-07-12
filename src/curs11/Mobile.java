package curs11;

public class Mobile extends Product{

	private int buyingPrice;
	private int tva;
	
	public Mobile(int buyingPrice, int tva) {
		setBuyingPrice(buyingPrice);
		setTva(tva);
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

	@Override
	public int calculatePrice() {
		
		return tva + buyingPrice;
	}

}
