package ch12;

public class InnerExam3 {
	public void exec() {
		class Cal { //메소드 안에 class선언(지역중첩클래스)
			int value = 1;
			public void plus() {
				value++;
			}
		} 
		Cal cal =new Cal();
		cal.plus();
		System.out.println(cal.value);
	}
	
	
	public static void main(String[] args) {
		InnerExam3 i  =new InnerExam3();
		i.exec();
	}
	
}
