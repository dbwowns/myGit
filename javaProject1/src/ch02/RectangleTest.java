package ch02;

import java.util.Scanner;

public class RectangleTest {
	public static void main(String[] args) {
		Scanner box = new Scanner(System.in);
		
		System.out.println("==============================");
		
		System.out.print("직사각형의 가로 길이를 입력하세요 : ");
		int x = box.nextInt();
		
		System.out.print("직사각형의 세로 길이를 입력하세요 : ");
		int y = box.nextInt()	;
		
		double sum = x*y;
		System.out.println("직사각형의 넓이는 " + sum + "입니다");
		System.out.println("==============================");
		box.close();
	}
}
