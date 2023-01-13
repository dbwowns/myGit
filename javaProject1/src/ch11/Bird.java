package ch11;

public class Bird implements Flyer { //Flyer에  마우스 올리고 F4를 누르면 계층구조 확인가능

	@Override
	public void takeOff() {
		System.out.println("Bird 이륙");
	}

	@Override
	public void fly() {
		System.out.println("Bird 비행");
	}

	@Override
	public void land() {
		System.out.println("Bird 착륙");
	}

}
