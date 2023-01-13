package ch02;

public class HelloExam {
	
	
	//사용자 정의 메소드 
	public static int sum(int n, int m) {
		return n+m;
	}
	
	//프로그램의 시작은 메인메소드부터 
	public static void main(String[]args) {//메인메소드(실행메소드) 
		int i =20; //변수 초기화(할당,저장)
		int s; //지역변수선언만	
		char a;//지역변수선언만 
		
		s= sum(i,10); //s=30;
		a = '?';//지역변수초기화
	
		
		System.out.println(a);
		System.out.println("Hello ㅎㅇ");
		System.out.println(s);
	}

}
