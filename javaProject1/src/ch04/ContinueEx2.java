package ch04;

public class ContinueEx2 {
public static void main(String[] args) {
	for(int i=0; i<10; i++){
		if(i%2==0) { //짝수는 건너뛰어라
			continue;
			
		}
		System.out.println("홀수값 :" + i);
	}
}
}
