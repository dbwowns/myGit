package ch04;

import java.util.Scanner;

public class ForPoint {
public static void main(String[] args) {
	int kor, math ,eng ;
	int tot;
	double avg;
	char ch =' ';
	String result = "";
	
	
	
	Scanner scanner = new Scanner(System.in);
	
	for(int i =0; i<3 ; i++) {
	
	System.out.print("국어 : ");
	kor = scanner.nextInt();
	System.out.print("수학 : ");
	math = scanner.nextInt();
	System.out.print("영어 : ");
	eng = scanner.nextInt();
	
	tot = kor+math+eng;
	avg = tot/3;
	
		if(avg >=90 ) {
			ch = '수';
			
		}else if(avg>=80 ) {
			ch = '우';
			
		}else if(avg>=70) {
			ch = '미';
			
		}else if(avg >=50){
			ch = '양';
			
		}else {
			ch = '가';
		}
		result += kor+"\t"+math+"\t"+eng+"\t"+tot+"\t"+avg+"\t"+ch+"\n";
	}
	scanner.close();
	System.out.println("============================================");
	System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
	System.out.println("--------------------------------------------");
	System.out.print(result);
	System.out.println("============================================");
	} 

}
