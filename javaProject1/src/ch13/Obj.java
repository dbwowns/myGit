package ch13;

public class Obj {//extends Object 가 생략되어있음
	public static void main(String[] args) {
		Obj e1 = new Obj();
		System.out.println(e1.getClass());  //class 정보
		System.out.println(e1);
		System.out.println(e1.toString());//"ch13.Obj@15db9742" 문자열 처리
		
	}

}
