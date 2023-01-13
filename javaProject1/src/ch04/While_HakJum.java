package ch04;

import java.util.Scanner;

public class While_HakJum {
	public static void main(String[] args) {
	int kor, eng, math;
	double avg;
	int tot;
	String st = "";
	char ch = ' ';   
	Scanner scan  = new Scanner(System.in);
	System.out.println("전체 성적입력이 끝나면 마지막에-1을 입력하세요.");
	System.out.print("아무정수나 입력해주세요 : ");
	int n = scan.nextInt();
	
	while(n==-1) {
		System.out.println("시스템이 종료되었습니다");
		break;
	}
	while(n != -1) {
		System.out.print("국어 : ");
		kor = scan.nextInt();
		System.out.print("영어 : ");
		eng = scan.nextInt();
		System.out.print("수학 : ");
		math = scan.nextInt();
		System.out.print("계속하려면 아무정수나 입력해주세요 : ");
		int n1 = scan.nextInt();
		
		tot = kor+eng+math;
		avg = tot/3;
		
			
		if(avg >=90) {
			ch = '수';
		}else if(avg >=75) {
			ch = '우';
		}else if(avg >= 60) {
			ch = '미';
		}else if(avg >=50) {
			ch = '양';
		}else {
			ch = '가';
		}
		st += (kor + "\t" + eng + "\t" + math + "\t" + tot + "\t" + avg + "\t" + ch +"\n");
		
		if(n1 ==-1) { break;}
		}
	
		scan.close();
		System.out.println("============================================");
		System.out.print("국어\t영어\t수학\t총합\t평균\t등급\n");
		System.out.println("--------------------------------------------");
		System.out.print(st);
		System.out.println("============================================");
	
}
}
