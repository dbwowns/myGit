package ch06;

public class VoidExam {
	public static void hello() { //void는 리턴값이 없음을 의미
		System.out.println("안녕하세요?");
		return; //메소드를 종료한다는 의미 , 생략가능
		
	}
	
	public static void main(String[] args) {
		System.out.println("start");
		hello();
		System.out.println("end");
		
	}
}
