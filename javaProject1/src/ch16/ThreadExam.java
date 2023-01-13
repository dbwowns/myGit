package ch16;


//멀티스레드 : 작업단위가 2개 이상
//먼티스레드 그현하는 방법
//1)Thread를 상속
//2)Runnable을 구현
public class ThreadExam extends Thread{
	public ThreadExam(String name) {
		super(); //부모생성자 호출 - 타이틀 설정
	}
	@Override //반드시 오버라이드
	public void run() {//스레드 실행메소드	
	for(int i=1; i<=5; i++) {
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(1000); //cpu를 1초간 멈춤
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	}

	public static void main(String[] args) {
		ThreadExam e1 = new ThreadExam("thread1");
		ThreadExam e2 = new ThreadExam("thread2");
		ThreadExam e3 = new ThreadExam("thread3");
		
		e1.start(); //자동으로 run() 메소드 호출
		//스레드객체.start() => run() 메소드 호출됨
		e2.start();
		e3.start();
	}
}
