package ch06;

public class CallEx {
	//메소드 위치는 main 위에있거나 아래에 있거나 상관x
	public static void test(int b) {
		System.out.println("test method 호출");
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		System.out.println("시작");
		int a =10;
		test(a);
		test2(a);
		System.out.println("끝");
	}

	private static void test2(int a) {
		System.out.println(a);
		
	}
}
