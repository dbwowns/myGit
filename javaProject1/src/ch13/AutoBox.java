package ch13;

public class AutoBox {
public static void main(String[] args) {
	//기본자료형
	 int num1 = 10;
	 int num2 ;
	 
	 //클래스자료형
	 Integer i1; //객체참조변수 (주소값 저장) , 아직 선언만 했기떄문에 i1의 값은 null 
	 Integer i2 = new Integer(20); //auto Boxing 처리
	 i1 = num1;
	 num2 = i2; //auto UnBoxing
	 
	 
	 System.out.println(num1 +", "+i1);
	 System.out.println(num2 +", "+i2);
	 
	 
}
}
