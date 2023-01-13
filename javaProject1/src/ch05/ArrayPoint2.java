package ch05;

import java.util.Scanner;

public class ArrayPoint2 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String[] name =new String[2];
	System.out.println("2명의 학생의 국,영,수 점수를 각각 입력하세요 ");
	
	int kor[]= new int[2];
	int eng[]= new int[2];
	int math[]= new int[2];
	int tot[] = new int[2];
	double avg[] = new double[2];
	double avg_tot = 0;
	for(int i =0; i<2; i++) {
		
		System.out.print("이름을 입력하세요 : ");
		name[i] = scanner.next();
		System.out.print("국어점수 : ");
		kor[i] =scanner.nextInt();
		System.out.print("영어점수 : ");
		eng[i] =scanner.nextInt();
		System.out.print("수학점수 : ");
		math[i] =scanner.nextInt();
		tot[i] = kor[i]+eng[i]+math[i];
		avg[i] =	tot[i]/3.0;
		avg_tot +=avg[i];
		System.out.println();
	}scanner.close();
	for(int i =0; i<2; i++) {
	System.out.println("이름 : "+ name[i]);
	System.out.println("국어점수 : "+ kor[i]);
	System.out.println("영어점수 : "+ eng[i]);
	System.out.println("수학점수 : "+ math[i]);
	System.out.println("총점 : " + tot[i]);
	System.out.println("평균 : "+ String.format("%.1f",avg[i]));
	System.out.println();
	}
	System.out.println("=============================");
	System.out.println("학급평균 : "+ String.format("%.1f", avg_tot/2));
}
}
