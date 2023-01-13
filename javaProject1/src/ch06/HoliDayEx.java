package ch06;

import java.util.Scanner;

public class HoliDayEx {
	static int y; //전역변수 , 멤버변수 (클래스 전체에서 사용할 수 있는변수);

	static void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("근속연수를 입력하세요 : ");
		y = scanner.nextInt();
		scanner.close();
	}
		static int holiday(int year) {
			int day=0; //day 는 지역변수이다.
			if(year <= 5 ) {//근속연수 1~5년
				day =10;
			}else if (year <=10) {//6~10
				day = 15;
			}else {
				day =20;
			}
			return day;
		}
		public static void main(String[] args) {
			input();
			System.out.println("휴가일수 : " + holiday(y));
		}
}
