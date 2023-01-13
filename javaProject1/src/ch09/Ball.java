package ch09;

public class Ball extends Circle{
	private String color;
	public Ball(String color) {
		this.color = color;
	}
	public Ball() {//기본 생성자
		

	}
	public void findColor() {//ball클래스의 멤버메소
		System.out.println(color + "공입니다.");
		
	}
	public void findVolume() {//ball클래스의 멤버메소
		System.out.println("부피 구하기");
	}
}
