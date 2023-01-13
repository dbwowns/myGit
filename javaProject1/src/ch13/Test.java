package ch13;

import java.util.Random;

public class Test {
public static void main(String[] args) {
	System.out.println(Math.ceil(10.1));  //올림처리함수
	System.out.println(Math.round(10.5)); //반올림함수
	System.out.println(Math.floor(10.8));  //내림함수
	System.out.println(Math.pow(10, 3));  //10에 3승
	Random rand = new Random();
	System.out.println("정수값 : "+rand.nextInt(100)); //100이하 정수랜덤
	
	int a=10;
	Integer b=20; 
	Integer c= new Integer(30);
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	
}
}
