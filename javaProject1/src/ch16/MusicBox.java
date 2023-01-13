package ch16;

public class MusicBox { //공유객체
	
	public synchronized void playMusicA() {
		for(int i=0;i<10;i++) {
			System.out.println("가요 음악");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void playMusicB() {
		for(int i=0;i<10;i++) {
			System.out.println("팝송 음악");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public  void playMusicC() {
		for(int i=0;i<10;i++) {
			synchronized(this) {
				System.out.println("트로트 음악");
				
			}
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

}
