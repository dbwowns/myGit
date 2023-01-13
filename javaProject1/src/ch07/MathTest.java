package ch07;

public class MathTest {
public static void main(String[] args) {
	int sum ;
	Math myMath = new Math();
	sum = myMath.add(10, 30);
	System.out.println("10,20의 합은"+sum);
	sum = myMath.add(7, 2);
	System.out.println("7,2의 합은"+sum);
}
}
