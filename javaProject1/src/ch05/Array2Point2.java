package ch05;

public class Array2Point2 {
public static void main(String[] args) {
	
//	int[][] score = {{70,80,90},{67,68,69},{78,97,96},{58,74,85},{74,85,96}}; //5행3열
	//정석으로 뒤데이터를 나타내보세요
	
	int[][]	 score ;
	score =new int[5][3];
	score[0][0]=70;
	score[0][1]=80;
	score[0][2]=90;
	
	score[1][0]=67;
	score[1][1]=68;
	score[1][2]=69;
	
	score[2][0]=78;
	score[2][1]=97;
	score[2][2]=96;
	
	score[3][0]=58;
	score[3][1]=74;
	score[3][2]=85;
	
	score[4][0]=74;
	score[4][1]=85;
	score[4][2]=96;
	
	System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
	for(int i=0; i<score.length; i++) {
		int sum=0;//총점
		float avg = 0f;//평균
		System.out.printf("%d\t", i+1); //번호출력	
		for(int j=0; j<score[i].length; j++) { // 국영수 배열값 처리
			sum += score[i][j];
			System.out.printf("%d\t", score[i][j]);
		}
			avg = sum/(float)score[i].length; //평균계산
			
			System.out.printf("%d\t %.1f%n", sum,avg);
	}
	
}
}
