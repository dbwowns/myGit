package ch12;

public class MemberAnony {
public static void main(String[] args) {
	Member m = new Member() {
		
		@Override
		public void num() {
			 int num=2;
			System.out.println("고객번호 : "+num);
			
		}
		
		@Override
		public void name() {
			String name = "김길동";
			System.out.println("이름 : "+name);
		}
		
		@Override
		public void email() {
			String email = "kim@gmail.com";
			System.out.println("이메일 : "+ email);
		}
	};
	System.out.println("======================");
	m.num();
	m.name();
	m.email();
	System.out.println("======================");
}
}
