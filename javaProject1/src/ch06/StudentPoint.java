package ch06;

public class StudentPoint {
static String name[] = {"홍길동","사임당","이순신"};
static int[] num = {1001,1002,1003};
static int Java[]= {90,95,84};
static int[] DB	= {85,79,92};
static int[] HTML = {99,88,95};
static int[] JSP = {76,92,72};
static int[] tot = {0,0,0};
static double[] avg = {0.0,0.0,0.0};

	public static void getTot() {
			for(int i=0; i<name.length; i++) {
				tot[i]=Java[i]+DB[i]+HTML[i]+JSP[i];
			}
	}
	public static void getAvg() {
		for(int i =0; i<name.length; i++) {
			avg[i]= tot[i]/4.0;
		}
	}
	public static void print() {
		System.out.println("전체 학생수 : " +name.length+" 명");
		System.out.println("=======================================================================");
		System.out.println("학번\t이름\tJava\tDB\tHTML\tJSP\t총점\t평균");
		System.out.println("=======================================================================");
		for(int i=0; i<name.length; i++) {
		System.out.print(num[i]+"\t"+name[i]+"\t"+Java[i]+"\t"+DB[i]+"\t"+HTML[i]+"\t"+JSP[i]
				+"\t"+tot[i]+"\t"+String.format("%.1f", avg[i])+"\n");
		}
		System.out.println("=======================================================================");
	}
	
	public static void main(String[] args) {
		getTot();
		getAvg();
		print();
	}
}








