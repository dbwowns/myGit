package ch04;

public class Do_while_char {
	public static void main(String[] args) {
		char c='a';
		do {
			System.out.println(c);
			c= (char)(c+1); //영문의 경우 1을 더하면 다음문자의 코드값이 나옴
			
		}while(c <='z'); 
	}
}
