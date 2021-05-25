package StockAverage;

public class ShareHolder {

	public static void main(String[] args) {
		Stock lit = new Stock();
		lit.buy(30.5, 3000);
		lit.buy(25.5, 4000);
		lit.sell(35.0,5000);
		
		System.out.println("매수가격 : "+lit.getShares());
		System.out.println("주가 : "+lit.getPrice());
		System.out.println(lit.getAveragePrice());
	}

}
