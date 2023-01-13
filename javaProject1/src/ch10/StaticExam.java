package ch10;
//개별적인 값을 사용할때  => non-static   ex)학생등
//공통적인 값을 사용할때  => static		ex) 학점 4.0아성 ,3.5이상 등...

public class StaticExam {
	public static void main(String[] args) {
		//대표적으로 자주사용하고 고정된값 등은 static으로 사용한다. ex) Math클래스 등...
		int a = 40, b=30,	result;
		result = Math.max(a, b);// 둘중 큰값	
		System.out.println(result);
		result = Math.min(a, b);//둘중 작은값
		System.out.println(result);
		System.out.println(Math.sqrt(100));
		double r = 15.3;
		System.out.println("원의 둘레 :" + 2*Math.PI*r);
		System.out.println("원의 넓이 :" + Math.PI*r*r);
		
	
		
	}
}
