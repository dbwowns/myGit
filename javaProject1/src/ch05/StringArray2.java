package ch05;

public class StringArray2 {
public static void main(String[] args) {
	String[] str = {"JAVA", "DB" , "HTML", "Spring"};
	for(int i =0; i<str.length; i++) {
		System.out.println(str[i]);
	}
	
	//향상된 for~each문으로 처리해봐라
	for(String ss  :  str) {
		System.out.println(ss);
	}
}
}
