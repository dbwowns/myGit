package ch15;

public class Test {
public static void main(String[] args) {
	
	try {
		int num = Integer.parseInt("ABC");
	System.out.println(num);
	
	} catch (NumberFormatException e) {
		// TODO: handle exception
	}
}
}
