package ch09;

public class Volume extends Area{
	
	private int height;
	public Volume() {
	}
	public Volume(int width , int length, int heigth) {
		super(width, length);//부모생성자 호출  매개변수 두개짜리
		this.height=heigth;
		
	}
	//메소드
	public int getVolume() {
		return getArea()*height;
	}
	
	
}
