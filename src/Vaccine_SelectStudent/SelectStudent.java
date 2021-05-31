package Vaccine_SelectStudent;

import java.util.Scanner;

public class SelectStudent {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("학생 수를 입력하세요 : ");
		int numOfStudent = s.nextInt();
		
		String[] student = new String[numOfStudent];
		int[] age = new int[numOfStudent];
		
		Scanner stuName = new Scanner(System.in);
		Scanner stuAge = new Scanner(System.in);
		
		for(int i=0;i<numOfStudent;i++) {
			System.out.println("이름 입력 :");
			student[i] = stuName.nextLine();
			System.out.println("나이 입력:");
			age[i] = stuAge.nextInt();
		}
		
		for(int i=0;i<numOfStudent;i++) {
			if(age[i] >= 15) {
				System.out.println(student[i]+"는 백신접종 대상입니다.");
				System.out.println("학생의 나이는 현재"+age[i]+"살 입니다.");
				System.out.println();
			}else {
				System.out.println(student[i]+"님은 백신 접종 대상자가 아닙니다.");
				System.out.println();
			}
		}
		
		s.close();
		stuName.close();
		stuAge.close();
	}
}
