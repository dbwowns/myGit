package ch06;

public class SalaryEx {
	static String[] name= {"박과장" ,"유과장","이과장	","나대리","이실장"}; //전역변수 어디에서 사용가능, 값들이 기억되어짐
	static int[]	salary= {2800,3000,2500,2300,4000};
	static int[]	bonus= {0,0,0,0,0};//보너스
	static int[]	total= new int [5];//총액(연봉+보너스)
	static int[]	 tax = new int[5]; //세금처리
	static int[]	pay = new int[5];// 실수령액
	static int 	pay_tot;// 총지급액
	
	
	static void calc() {//계산용도
		for(int i=0;i<name.length;i++) {
			bonus[i] = (int)(salary[i]*0.3); //연봉의 30%	
			total[i]= salary[i]+bonus[i];//총액
			tax[i] = (int)(total[i]*0.03); //세금(총액의 3%)	
			pay[i]	= total[i] - tax[i];//실수령액
			pay_tot =pay_tot + pay[i];
			
		}
	}
	static void print() {//출력용도
		System.out.println("이름\t연봉\t보너스\t총\t세금\t실수령액");
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]+"\t"+salary[i]+"\t"+bonus[i]+"\t"+total[i]+"\t"
		+ tax[i]+"\t"+pay[i]);
		}
		System.out.println("총지급액 합계 : "+pay_tot);
		System.out.println("총지급액평균 : " + pay_tot/name.length);
		
	}
	public static void main(String[] args) {
		calc(); // 계산할 기능의 메소드 호출
		print(); //출력용도 메소드 호출
	}
}





