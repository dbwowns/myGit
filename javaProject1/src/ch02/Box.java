package ch02;

public class Box {

	public static void main(String[] args) {
		double a, b;
		double box, box2;
		
		a = 10.0;
		b = 5.0;
		box = a*b;
		box2 = 2.0 *(a+b);
		
		System.out.println("사각형의 넓이는 : "+ box);
		System.out.println("사각형의 둘레는 : "+ box2);
	}

}
