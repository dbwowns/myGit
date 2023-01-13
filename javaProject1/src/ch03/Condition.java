package ch03;

public class Condition {
	public static void main(String[] args) {
		int num = -5;
//		System.out.println( num > 0 ? num : -num ); // -(-5) = 5
		if(num > 0) {//조건이 true면
			System.out.println(num);
		}else {//조건이 false면
			System.out.println(-num);
		}
	}
}	
