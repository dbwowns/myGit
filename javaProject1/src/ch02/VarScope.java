package ch02;

public class VarScope {
	static int x; //전역변수 (멤버,필드)	멤버변수는 초기화를 하지 않아도 기본값이 할당된다. 
	
	public static void main(String[] args) {
		int y = 0; //지역변수 
		
		System.out.println("x = " +x);
		System.out.println("y = " +y);
		
	}
	
}
