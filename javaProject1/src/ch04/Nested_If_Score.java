package ch04;

import java.util.Scanner;

public class Nested_If_Score {
public static void main(String[] args) {
	int Java;
	char ch = ' ';
	char ch1 = ' ';
	Scanner scanner =new Scanner(System.in);
	System.out.print("Java 점수 : ");
	Java = scanner.nextInt();
	
	if(Java >=	90) {
		ch = 'A';
		if(Java >90) {
			ch1 = '+';
		}else {
			ch1 = '0';
		}
	}
	else if(Java >=	80) {
		ch = 'B';
		if(Java >80) {
			ch1 = '+';
		}else {
			ch1 = '0';
		}
	}
	else if(Java >=	70) {
		ch = 'C';
		if(Java >70) {
			ch1 = '+';
		}else {
			ch1 = '0';
		}
	}
	else if(Java >=	60) {
		ch = 'D';
		if(Java >60) {
			ch1 = '+';
		}else {
			ch1 = '0';
		}
	}
	else  {
		ch = 'f';
	}
	System.out.println("당신의 점수는 "+Java +"이고 등급은 "+ ch+ch1+" 입니다." );
	
	scanner.close();
}
}
