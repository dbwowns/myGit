package ch12;

public class OuterClass {
	private static int x =10;
	class Inner{
		int getX() {
			return x;
		}
	}
	
	
	public static void main(String[] args) {
		OuterClass e = new OuterClass();
		OuterClass.Inner in = e.new Inner();
		System.out.println(in.getX());
	}
}
