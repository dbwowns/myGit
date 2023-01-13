package ch03;

public class TernaryOperator {
	public static void main(String[] args) {
		int x= 1;
		int y ;
		y = (x==1)? 10: 20; //x가 1이면 10을 출력 아니면 20을 출력
		System.out.println(y);
		
		y=  (x>1)? x++ : x+20 ;
		System.out.println(y);
		
		
	}
}
