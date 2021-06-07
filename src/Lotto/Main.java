package Lotto;

import java.util.Arrays;
import java.util.Random;


public class Main {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int min = 1, max = 45, slots = 6;
		
		//모든 요소는 0으로 초기화
		int[] lottoArr = new int[slots];
		boolean isRepeated;
		int randomNum = 0;
		
		for(int index = 0; index < slots; index++) {
			do {
				isRepeated = false;
				// 1~45
				randomNum = rand.nextInt(max + 1 - min) + min;
				// 반복되는 숫자 확인 
				for(int k=0;k<=index;k++) {
					if(lottoArr[k] == randomNum) {
						isRepeated = true;
						break;
					}
				}
			}while(isRepeated);
			lottoArr[index] = randomNum;
		}
		Arrays.sort(lottoArr); //정렬
		System.out.print("로또번호 :");
		for(int i=0;i<slots;i++) {
			System.out.print(lottoArr[i]+" ");
		}
		
		
//		int[] number = new int[6];
//		
//		for(int i=0;i<number.length;i++) {
//			number[i] = (int)(Math.random()*45)+1;
//			System.out.println(number[i]);
//		}
		

	}

}
