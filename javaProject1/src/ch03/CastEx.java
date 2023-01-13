package ch03;

public class CastEx {
	public static void main(String[] args) {
		float f = 1.6f; //4바이트	
		System.out.println(f);
		
		f=100; //자동형변환 (정수100을 자동으로 float형 실수 100.0F 로 변환시킴)
		System.out.println(f);
		
		
		f = 100.5f;
		// int i = f ; 오류남
		int i = (int) f; //강제형변환, 명시적변
		System.out.println(i); // 형변환되서 뒤에소숫점은 날라감
	}
}
