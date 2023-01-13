package ch08;

public class Foo {
	int a;
	double b;

	public Foo() {
		this(3);
		int c=1;
	}
	
	
	public Foo(int x) { //x==3;
		a=x;
		b=20.0;
	}
}
