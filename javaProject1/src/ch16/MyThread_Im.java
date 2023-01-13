package ch16;

public class MyThread_Im implements Runnable{
	String str ; 
	public MyThread_Im(String str) {
		this.str = str;
	}



	@Override
	public void run() {
		for(int i =1 ; i<=5; i++) {
			System.out.println(str+ i);
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
