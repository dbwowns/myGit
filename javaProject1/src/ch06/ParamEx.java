package ch06;

public class ParamEx {
	//매개변수 2개이상
	static int plus(int a,int b) {
		return a+b;
	}
	static int minus(int a, int b) {
		return a-b;
	}
	static int mulit(int a, int b) {
		return a*b;
	}
	static int divide(int a, int b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		int n;
		n=plus(10, 20);
		System.out.println("plus : "+n);
		n=minus(100, 50);
		System.out.println("minus : "+n);
		n=mulit(9, 8);
		System.out.println("multi : "+n);
		n=divide(9, 3);
		System.out.println("divide : "+n);
				
	}
}
