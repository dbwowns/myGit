package ch09;

public class Area {
	private int width; //width =0 ; 기본으로 초기화됨
	private int length;
	
	public Area() {
	}
	public Area(int width, int length) {
		this.width = width;
		this.length = length;
	}
	//메소드
	public int getArea() {
		return width* length;
	}
}
