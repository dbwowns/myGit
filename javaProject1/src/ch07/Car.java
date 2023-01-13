package ch07;

public class Car {
	String color;
	int speed;
	int gear;
	
	//개발자용 메소드
	@Override
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}
	
	void changeGear(int g ) { //g는 지역변수
		gear =g;
	}
	void speedUp() {
		speed = speed +10;
	}
	void speedDown() {
		speed = speed -10;
	}
	
}
