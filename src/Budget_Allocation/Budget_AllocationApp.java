package Budget_Allocation;

import java.util.ArrayList;
import java.util.Scanner;

public class Budget_AllocationApp {

	public static void main(String[] args) {
		System.out.print("현재 할당받을 수 있는 예산 입력 : ");
		Scanner s = new Scanner(System.in);
		double total = s.nextDouble(); //에산
		double sum = 0;
		int i = 0;
		ArrayList<Double> prop = new ArrayList<Double>(); //ArrayList 생성
		System.out.println("다양한 비용의 비율을 입력.");
		System.out.println("누적비율이 100% 초과시 프로그램이 중지됩니다.");
		
		do {
			System.out.println((i+1)+"번째 예산 할당 비율  ");
			double value = s.nextDouble();
			prop.add(value);
			sum += prop.get(i);
			i++;
		}while (sum <= 100);
		s.close();
		
		if(sum > 100) {
			double cumulativeSum = 0.0;
			for(int j=0;j<prop.size()-1;j++) {
				cumulativeSum += prop.get(j);
			}
			prop.set(prop.size()-1, 100.0 - cumulativeSum);
		}
		
		for(double value : prop) {
			double expense = value * total / 100.0;
			System.out.println("할딩비율:"+value+"% 의 금액은"+expense+"원입니다.");
		}
		
	}

}
