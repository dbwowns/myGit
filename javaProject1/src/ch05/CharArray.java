package ch05;

public class CharArray {
	public static void main(String[] args) {
		//char[] ch = {'J','A','V','A'}; // 실무형 방식
		
		//정석으로 바꿔서 처리해보세요
		//char[] ch;
		
		char[] ch = new char[4];
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V'; 
		ch[3] = 'A';
		System.out.println("0번째 문자 : "+ ch[0]);
		System.out.println("1번째 문자 : "+ ch[1]);
		System.out.println("2번째 문자 : "+ ch[2]);
		System.out.println("3번째 문자 : "+ ch[3]);
		
		
		
		for(int i =0; i <ch.length; i++) {
			System.out.println(i + "번째 문자 : " +ch[i]);
		}
	}
}
