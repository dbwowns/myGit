package ch04;

public class BreakEx4 {
public static void main(String[] args) {
	int n =1;
	System.out.println("---------------------------");
	while(n<10) {
		System.out.println(n+ "Hello World");
		n++;
		if(n==8) break; 
	}
	
	System.out.println("n값이 8이며 while문을 빠져나옴");
	System.out.println("---------------------------");
}
}
