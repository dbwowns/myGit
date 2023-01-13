package ch05;

public class Array2Point {
	public static void main(String[] args) {

		//		int[][] point;
//		point=new int [5][5];
//		point[0][0]=80;
//		point[0][1]=90;
//		point[0][2]=100;
//		point[0][3]=0;//총점처리
//		point[0][4]=0;//평균처리
		
		int [][] point = {{80,90,100,0,0},{78,56,74,0,0},{69,50,78,0,0}
		,{19,75,54,0,0},{65,74,37,0,0}};  //5행 5열; 
		for(int i =0; i <point.length; i++) {
			point [i][3] =point[i][0]+point[i][1]+point[i][2];
			point[i][4] = point[i][3]/3;
		}
		System.out.println("국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<5; i++) {
			System.out.println(point[i][0]+ "\t"+point[i][1] +"\t"+point[i][2]
					+"\t"+point[i][3]+"\t"+point[i][4]);
		}
		
	}
}
