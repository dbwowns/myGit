package ch08;

public class MyManager {//싱글톤 기법
	private int score;
	
	private MyManager(int score) {
		this.score = score;
	}
	
	
	private static MyManager mgr; //객체형 데이터타입 
	
	public static MyManager getInstance() {
		if(mgr==null) {//처음 MyManager가 객체화 될때의 경우
			mgr = new MyManager(10);
		}
		return mgr; //한번이상 객체 생성되었다면(즉, 주소값이 있으면)그 값을 리턴
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
	
}
