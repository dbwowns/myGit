package ch05;

public class ArrayIf {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60,70,80,90,100};
		
		if(arr !=null) {//arr이 주소번지가 null이 아닌 조
			for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i]+"\t");
			
		}
}
		System.out.println();
		for(int i : arr	) {
			System.out.println(i);
		}
	}
}
