package ch06;

import java.util.Scanner;

public class Method_Gugu {
public static void main(String[] args) {
	int dan;
	
	System.out.println("단을 입력하세요 : " );
	Scanner scanner = new Scanner(System.in);
	dan = scanner.nextInt();
	gugu(dan); //gugu라는 메소드	
	scanner.close();
}

		public static void gugu(int dan) {
			for(int i =1; i<=9; i++) {
				System.out.println(dan+ "x"+ i +"="+dan*i);
			}
			
}
}
