package ch09;

public class CircleShape extends Shape{
	private int radius;
	//getter,setter

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public CircleShape(int radius) {
		super("Circle");
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		return radius*radius*Math.PI;
	}
@Override
public void draw() {
	System.out.println("반지름이  "+ radius + "인 원");
	super.draw();
}
}
