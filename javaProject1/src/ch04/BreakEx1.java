package ch04;
//break(탈출문)
public class BreakEx1 {
	public static void main(String[] args) {
		int i = 1;
		while(true) {
			System.out.println(i++);
			if(i >10) 	break; //반복문을 종료시킴 한줄짜리는 {} 생략가능 
		}
		System.out.println("프로그램 종료");
	}
}
