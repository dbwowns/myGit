package ch13;

public class StrMethod {
	public static void main(String[] args) {
		String str1 = "java";
		str1 +=" programming";   
		System.out.println(str1.length()); //문자열의 길이
		String str2 = str1.concat(" programmer"); //concat()도 문자열 연결시킴;
		System.out.println(str2);
		System.out.println(str1);
		System.out.println(str1.charAt(2));//n번째 문자	
		System.out.println(str2.indexOf("program")); //"program" 의 시작문자열인 p문자의 위치;
		System.out.println(str2.indexOf("z"));  //내용이 없으면 -1을 리턴한다
		System.out.println(str2.substring(0,4)); //substring(start , end ) => 0~3;
		System.out.println(str2.substring(5)); //5 ~끝까지
		System.out.println(str2.replace("java", "jsp"));//java->jsp
		System.out.println(str2);
		str2 = str2.replace("java", "jsp");
		System.out.println(str2);
		
		String str3 = "1234515515";
		System.out.println(str3.substring(5,9));  //5~(9-1)까지;
		System.out.println(str3.replace(str3.substring(5,9), "****"));
	}

}
