package InvestmentApp;

import java.text.DecimalFormat;
import java.util.Scanner;

public class InvestEarning {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("주당  구매가격 입력:");
		double buyingPrice = s.nextDouble();
		int day = 1;
		double closingPrice = 0.1;
		DecimalFormat df = new DecimalFormat("0.00"); //숫자를 형식화 하기
		
		while(true) {
			System.out.println(day+"번째 날 ");
			System.out.print("장 마감시기의 종가 입력(종가가 -값이면 종료) : ");
			closingPrice = s.nextDouble();
			if(closingPrice < 0.0) // 종가가 
				break;
			double earnings = closingPrice - buyingPrice;
			if(earnings > 0.0) {
				System.out.println(day+"번째 날 당신의 수익은 주당 "+ df.format(earnings)+"입니다.");
			}else if(earnings < 0.0) {
				System.out.println(day+"번째 날 당신의 손실은 주당 "+ df.format(-earnings)+"입니다.");
			}else {
				System.out.println(day+"번째 날, 당신의 수익은 없습니다.");
			}
			day += 1;
		}
		System.out.println("프로그램종료");
		s.close();

	}

}
