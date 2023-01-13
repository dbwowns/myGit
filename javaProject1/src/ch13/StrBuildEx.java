package ch13;

public class StrBuildEx {
	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder("I am a");
		//System.out.println(str1);

		StringBuilder str2 = new StringBuilder(" Java Programmer");
		//System.out.println(str2);
		str1.append(str2);
		System.out.println("---------------------------------------");
		System.out.println("append() 메소드를 활용 : "+str1);
		System.out.println();
		str1.replace(7, 11,"JSP");
		System.out.println("replace() 메소드를 활용 : "+str1);
		System.out.println();
		String	str3 = str1.substring(7);
		System.out.println("substring() 메소드를 활용 : "+str3);
		System.out.println("---------------------------------------");
	}
}
