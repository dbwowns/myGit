package ch10;

class Pa{
	String name = "유재주ㄴ";
	public void print() {
		System.out.println( "이름 : "+name);
	}
}
class Ch extends Pa{
	int age =30;
	@Override
	public void print() {
		super.print(); //부모 프린트 호출
		System.out.println("나이 : "+age);
	}
}
public class Poly2 {
	public static void main(String[] args) {
		String tel= "010-2345-1231";
		Pa p = new Ch(); //다형성
		p.print(); //자식쪽 프린트 호출
		System.out.println("전화번호 :" + tel);
	}
}
