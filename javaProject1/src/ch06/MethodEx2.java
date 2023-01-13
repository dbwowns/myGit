package ch06;

// 메소드를 사용하면 얻을 수 있는 장점 : 
// 1) 중복코드를 줄이고 코드를 재사용 할 수있다.
// 2) 모듈화해서 가독성을 높이며, 프로그램도 품질향상 시킬 수 있다.

public class MethodEx2 {
	public static void main(String[] args) { //투수역할
	System.out.println("합(1~10) : " + sum(1, 10));
	System.out.println("합(1~10) : " + sum(10, 100));
	System.out.println("합(1~10) : " + sum(100, 1000));
	}


	public static int sum(int a, int b) {//포수역할
		int sum=0;
		for(int i=a; i<=b; i++	) {
			sum +=i;
		}
		return sum;
	}
}
