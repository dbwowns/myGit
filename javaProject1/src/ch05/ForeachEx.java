package ch05;

public class ForeachEx {
	enum Week {월, 화, 수, 목, 금, 토, 일}
	//enum은 배열보다 간편한 방식으로 단지 데이터를 나열해서 쓰기만 하면된다.
	
	public static void main(String[] args) {
		int[] n = {1,2,3,4,5};
		String names[] = {"사과","배","바나나","체리","포도"};
		int sum = 0;
		
		for(int k:n) {
			System.out.println(k + " ");
			sum +=k;
		}
		System.out.println("합은 : " + sum);
		System.out.println();
		
		for(String s : names) {
			System.out.println(s + " ");
		}
		System.out.println();
		for(Week day : Week.values()) { // 집합변수처리는 객체 .values()
			System.out.println(day + "요일 ");
		}
	}
}
