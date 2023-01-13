package ch05;

public class SkewedArray2 {
public static void main(String[] args) {
	int intArray[][] =new int [4][];
	intArray[0] = new int [3]; //첫째 행에 3개의 열을 생성하겠다.	
	intArray[1] = new int [2]; //둘째 행에 2개의 열을 생성하겠다.
	intArray[2] = new int [3]; //셋째 행에 3개의 열을 생성하겠다.
	intArray[3] = new int [2]; //네째 행에 2개의 열을 생성하겠다.
	
	for(int i=0; i<intArray.length; i++	) {
		for(int j=0; j<intArray[i].length; j++) {
			intArray[i][j] = (i+1)*10 +j;
		}
	}
	for(int i=0; i<intArray.length; i++	) {
		for(int j=0; j<intArray[i].length; j++) {
			System.out.println(intArray[i][j]+ " "); //데이터 출력
		}
		System.out.println();
	}
	
} 
}
