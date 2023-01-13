package ch12;

public class MemberOuter {
	public static int num=1;
	public static String name="홍길동";
	public static String email="hong@gmail.com";
	
	class Inner {
		int getNum() {
			return num;
		}
		String getName() {
			return name;
		}
		String getEmail() {
			return email;
		}
	}
	
	
	
	public static void main(String[] args) {
		MemberOuter m =new MemberOuter();
		MemberOuter.Inner in = m.new Inner();
		System.out.println("---------------------------------");
		System.out.println("고객번호 : "+in.getNum());
		System.out.println("이름 : "+in.getName());
		System.out.println("이메일 : "+in.getEmail());
		System.out.println("---------------------------------");
		
	}
}
