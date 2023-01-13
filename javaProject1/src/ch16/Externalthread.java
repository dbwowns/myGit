package ch16;

public class Externalthread {
	public static void main(String[] args) {
		Mythread t1 =new Mythread("스레드1");
		Mythread t2 =new Mythread("스레드2");
		Mythread t3 =new Mythread("스레드3");
		t1.start(); //run() 메소드 호출
		t2.start();
		t3.start();  //t1,t2,t3 가 동시에 작동됨
		System.out.println("메인스레드");//다른 스레드가 run하는 시점에 메인스레드의 내용도 있으면
		//가끔 메인스레드부터 시작되는 현상이 있다.
		
		
		
	}
}
