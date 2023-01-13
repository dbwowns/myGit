package ch05;

public class ArrayBasic {
	public static void main(String[] args) {
		int[] score;//배열 참조변수 선언
		score = new int[5];//new를 통해서 메모리에 5개의 int형 자리를 준비함.
		
		//int[] score = new int[5];
		
		
		//배열생성(4byte x 5개 = 20byte)
		System.out.println(score);//출력해보면 메모리의 주소값을 가리키는 참조변수가 된다.
		score[0] =100;
		score[1] =200;
		score[2] =300;
		score[3] =400;
		score[4] =500;
		// score[5] = 600; 범위초과 오류남; 
		
		
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);
		
		// int[] score = {100,200,300,400,500}	; //실무형 배열처리
		
		//배열을다루는데 있어서 for 문을 거의 필수적으로 사용된다.
		for(int i =0; i<5; i++) {
			System.out.println(score[i]);
		}
		
	}
}
