package ch13;

public class WrapperEx3 {
public static void main(String[] args) {
	String data = "Hello 1234";
	System.out.println("(Chracter 사용)");
	for(int i=0; i<data.length(); i++) {
		if(Character.isUpperCase(data.charAt(i))) {// 대문자면 true
			System.out.println(data.charAt(i)+ " 는 대문자입니다.");
		}else if(Character.isLowerCase(data.charAt(i))) { //소문자면 true
			System.out.println(data.charAt(i)+" 는 소문자입니다.");
		}else if (Character.isDigit(data.charAt(i))) {//숫자면 true
			System.out.println(data.charAt(i)+" 는 숫자입니다.");
		}
	}
	System.out.println("==================");
	System.out.println("(Integer 사용)");
	System.out.println("문자 "+(data.substring(6))+"입니다."); 
	System.out.println("숫자 "+Integer.parseInt(data.substring(6))+"입니다.");
//	System.out.println("문자 "+Integer.toString(1234)+"입니다.");//숫자를 문자로 
//	System.out.println("숫자 "+Integer.parseInt("1234")+"입니다.");//문자를 숫자로
	System.out.println("숫자 "+Integer.parseInt(data.substring(6))+" + 2 = "
	+ (Integer.parseInt(data.substring(6))+2)+"입니다.");
	
	}
}
