package ch11;

//추상클래스를 쓰는 이유는 표준화(유지보수의 이유)때문
// 추상클래스를 인스턴스를 만들 수 없음
//추상메소드를 자식클래스에서 구현해야한다.

public class AbstractExtends extends AbstractClass{

	@Override
	void method1() {
		System.out.println("추상 메서드를 완성한 메서드");

	}
	public static void main(String[] args) {
		//추상클래스는 객체생성이 안된다.
		//AbstractClass ex =new AbstractClass(); 
		AbstractExtends ex = new AbstractExtends();
		ex.method1();
		ex.method2();
	}
}
