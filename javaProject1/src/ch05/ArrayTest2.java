package ch05;

public class ArrayTest2 {
	public static void main(String[] args) {
		int sum =0;
		float avg = 0f; 
		int[] score = {100,88,99,88,77};
		for(int i=0; i<score.length; i++) {
			sum +=score[i];
		}
		avg = sum/(float)score.length; //계산결과를 float으로 얻기위해
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
		
	}
}
