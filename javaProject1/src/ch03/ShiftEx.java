package ch03;

public class ShiftEx {
	public static void main(String[] args) {
		int a = 2; // 이진수 0010	
		
		int b = a << 2;   //a값을 좌측으로 2비트씩 쉬프트(밀어낸다)
		System.out.println(b);
	}
}
