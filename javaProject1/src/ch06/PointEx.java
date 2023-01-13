package ch06;

public class PointEx {

	
	static String[] name = {"홍길동","유재준","이순신","이미경","유인연"	};
	static int[]	kor = {80,90,100,60,70};
	static int[]	eng = {88,97,99,61,50};
	static int[]	math = {70,20,50,67,74};
	static int[] 	tot = {0,0,0,0,0};
	static double[]	avg = {0.0,0.0,0.0,0.0,0.0};
	
	static void getTot() {
		//총점계산기
		for(int i=0; i<5; i++) {
			tot[i] = kor[i]+math[i]+eng[i];
		}
	}
	static void getAvg() {
		for(int i=0; i<5; i++) {
			avg[i]= tot[i]/3.0;
		}
	}
	
	static void print() {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<5; i++) {
			System.out.println(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+math[i]+"\t"
					+tot[i]+"\t"+String.format("%.1f", avg[i]));
		}
	}
	public static void main(String[] args) {
		getTot();
		getAvg();
		print();
	}
	
}







