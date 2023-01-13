package ch10;

class A2{
	void print() {
		System.err.println("a");
	}
}

class B2 extends A2{
	@Override
	void print() {
		System.out.println("b");
	}
}
public class FinalMethod {
public static void main(String[] args) {
	B2 b =new B2();
	b.print();
}
}
