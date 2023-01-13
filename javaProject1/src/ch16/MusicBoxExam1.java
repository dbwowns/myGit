package ch16;

public class MusicBoxExam1 {

	
	public static void main(String[] args) {
		MusicBox box = new MusicBox();
		
		
		MusicPlayer play1 = new MusicPlayer(1, box);
		MusicPlayer play2 = new MusicPlayer(2, box);
		MusicPlayer play3 = new MusicPlayer(3, box);
		
		//스레드 실행
		play1.start();
		play2.start();
		play3.start();
		
		
		
	}
}
