package ch16;

public class DaemonThread implements Runnable{
	@Override
	public void run() {
		while(true) { // while(true)지만 main 스레드가 종료되면 자동종료됨
			System.out.println("데몬 스레드가 실행중입니다.");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
		}
	}

	public static void main(String[] args) {
		Thread th = new Thread(new DaemonThread());
		th.setDaemon(true); //데몬스레드 설정	
		th.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("메인 스레드 종료");
	}
}
