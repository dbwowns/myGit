package ch05;

import java.util.Scanner;

public class ArrayScore2d_Scan {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int size;
	float avg =0f;
	int tot=0;
	String st = "";
	System.out.print("학생수를 입력하세요 : ");
	size = scanner.nextInt();
	System.out.println("국, 영, 수 점수를 각각 입력하세요 : ");
	int score[][] = new int[size][size];
	
	
	for(int i=0;i<score.length; i++	) {
			System.out.print((i+1) + "번 학생의 점수 : ");
		for(int j=0; j<score[i].length; j++) {
			score[i][j] = scanner.nextInt();
			
		}
	}		
	
	
	System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t등급");	
	for(int i=0; i < score.length; i++	) {
		System.out.print((i+1));
		 tot =0;
			
		for(int j =0; j<score[i].length; j++) {
			tot += score[i][j];
			avg = (float)tot/score[i].length;
			System.out.print("\t"+score[i][j]);
		}if(avg> 80) {
			st = "A";
		}else if(avg > 65) {
			st = "B";
		}else if(avg >50) {
			st	="C";
		}else {
			st = "F";
		}
		System.out.print("\t"+tot+"\t"+String.format("%.1f", avg)+"\t"+st+"\n");
	}
	scanner.close();

}
}
