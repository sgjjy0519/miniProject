package Grade_Average;

public class Main {

	public static void main(String[] args) {
		Student hendo = new Student("hendo");
		hendo.add("국어", 'C');
		hendo.add("영어", 'A');
		hendo.add("수학", 'B');
		hendo.add("한국사", 'F');
		
		System.out.println(hendo.getName() + " 의 평균은 " + hendo.getGPA()+" 입니다.");
		System.out.println("수강한 강좌는 "+hendo.getSubjects()+"입니다.");
		
		

	}

}
