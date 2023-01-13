package ch05;

public class ArrayTest3 {
public static void main(String[] args) {
	int[] num = {10,20,30};
	for(int i =0; i<num.length; i++) {
		System.out.println(num[i]);
	}
	System.out.println();
	
	//향상된 for~each	문
	for(int	value : num ) {
		System.out.println(value);
	}
}
}
