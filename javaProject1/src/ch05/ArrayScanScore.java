package ch05;

import java.util.Scanner;

public class ArrayScanScore {
public static void main(String[] args) {
	
	int size;	
	int tot =0;
	double avg=0;
	Scanner scanner = new Scanner(System.in);
	System.out.print("처리할 학생의 수를 입력하세요 : ");
	size = scanner.nextInt();
	
	int score[] = new int[size];
	for(int i =0; i < score.length; i++) {
		System.out.print("성적을 입력하세요 : ");
		score[i] = scanner.nextInt();
		
			
	tot +=score[i];
		avg = (double)tot/score.length;
	}
	scanner.close();
		System.out.println("총점 "+ tot +"점 입니다.");
		System.out.print("평균성적은 " + String.format("%.1f", avg) +"점 입니다.");
	
}
}
