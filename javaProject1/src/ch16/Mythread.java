package ch16;

public class Mythread extends Thread{

	public Mythread(String name) {
		super(name);
	}
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
