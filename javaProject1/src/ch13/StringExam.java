package ch13;

public class StringExam {

	public static void main(String[] args) {
		String str1 = new String ("Hello World!");
		String str2 = new String ("Hello World!");
	
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		System.out.println("=====(==)사용 ======");
		if(str1 == str2) {
			System.out.println("str1 과 str2 가 같은 같은 인스턴스를 참조합니다.");
		}else {
			System.out.println("str1 과 str2 가 같은 다른 인스턴스를 참조합니다.");
		}
		
		System.out.println("===== equals()사용 ======");
		if(str1.equals(str2)) {
			System.out.println("str1 과 str2 가 같은 같은 값을 참조합니다.");
		}else {
			System.out.println("str1 과 str2 가 같은 다른 값을 참조합니다.");
		}
		
	}
}
