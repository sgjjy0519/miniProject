package StockAverage;

public class Stock {
	private int shares;       //주식
	private double price;	  //가격
	private double capital;   //총 자본
	
	public void buy(double p, int s) {  //매수
		shares += s;
		price = p;
		capital += p * s;
	}
	
	public void sell(double p, int s) { //매도
		shares -= s;
		price = p;
		capital -= p * s;
	}
	
	public int getShares() {
		return shares;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getAveragePrice() {
		return capital / getShares();
	}
}
