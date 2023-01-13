package ch16;

public class MyBank {
	public synchronized void Bank1() {
		for(int i=1;i<=5;i++) {
			System.out.println("홍길동님의 통장잔고는 "+ i*10+"만원 입니다");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}

	public synchronized void Bank2() {
		for(int i=1;i<=5;i++) {
			System.out.println("사임당님의 통장잔고는 "+ i*10+"만원 입니다");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}System.out.println();
	}
	public  synchronized void Bank3() {
		for(int i=1;i<=5;i++) {
			System.out.println("이몽룡님의 통장잔고는 "+ i*10+"만원 입니다");

			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}System.out.println();
	}
}
