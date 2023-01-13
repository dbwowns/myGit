package ch05;

import java.util.Scanner;

//사용자가 배열의 크기를 지정
public class ArrayTest4 {
public static void main(String[] args) {
	int total = 0;
	int size;
	Scanner scanner =new Scanner(System.in);
	System.out.println("배열의 크기를 입력하세요 : ");
	size = scanner.nextInt();
	
	int[] scores =new int[size];//변수로 배열의 크기를 지정
	for(int i=0; i<scores.length; i++	) {
		System.out.println("성적을 입력하세요 :");
		scores[i] =scanner.nextInt();
	}
	
	for(int i=0; i<scores.length; i++) {
		total += scores[i];
	}
	System.out.println("평균성적은 : " + total/scores.length);
	scanner.close();
}
}
