package VehicleInsurance;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("1.승용차 / 2.트럭 / 3.버스 / 4.오토바이");
		System.out.print("차량 종류를 입력하세요 : ");
		
		Scanner s = new Scanner(System.in);
		
		int type = s.nextInt();
		int premium = 0;
		
		switch(type) {
		case 1:
			premium = 200;
			break;
		case 2:
			premium = 300;
			break;
		case 3:
			premium = 400;
			break;
		case 4:
			System.out.println("1.50cc미만 / 2.50cc~125cc / 3.125cc~250cc");
			System.out.print("오토바이의 출력을 입력하세요 : ");
			
			int motorType = s.nextInt();
			
			switch(motorType) {
			case 1:
				premium = 125;
				break;
			case 2:
				premium = 150;
				break;
			case 3:
				premium = 175;
				break;
			default :
				System.out.println("잘못된 입력입니다.");
			}
			break;
		default :
			System.out.println("잘못된 입력입니다.");
			break;		
		}
		s.close();
		System.out.println("선택한 종류의 차량의 보험료는 "+premium+" 만원 입니다.");
	}

}
