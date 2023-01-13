package ch04;

import java.util.Scanner;

public class While_Gugu {
	public static void main(String[] args) {
		int dan =2;
		int j =1;
		Scanner scanner = new Scanner(System.in);
		while(dan <=9) {
			System.out.print("구구단중 출력하고 싶은 단을 입력해주세요 : ");
			dan = scanner.nextInt();
		
			while(j<=9) { 
				System.out.println(dan +" x " + j + " = " + (dan*j));
				j++;
				
			}
			break;
		}
		scanner.close();
	}
}
