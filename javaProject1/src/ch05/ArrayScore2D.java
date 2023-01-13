package ch05;

public class ArrayScore2D {
public static void main(String[] args) {
	
	 int score[][] = {{100,100,100},{89,76,92},{88,69,72},{45,60,59},{96,92,89}};
	 String st =new String("");
	 System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t등급");
	 for(int i =0; i<score.length; i++) {
		 int sum=0;
		 float avg=0f;
		 System.out.print(i+1);
		 for(int j=0; j<score[i].length; j++) {
		 sum += score[i][j];
		 avg = (float)sum/score[i].length;
		 System.out.print("\t"+score[i][j]);		
		 } 
		 if(avg >90) {
		st ="A";
		 }else if(avg>80) {
			 st ="B";
		 }else if(avg>70) {
			 st ="C";
		 }else if (avg>60) {
			 st ="D";
		 }else {
			 st ="F";
		 }
		 System.out.println("\t"+sum+"\t"+String.format("%.1f", avg)+"\t"+st);
		 
		
		 System.out.println();
	 }
}
}
