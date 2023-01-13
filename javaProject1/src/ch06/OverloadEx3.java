package ch06;

public class OverloadEx3 {
	public static void main(String[] args) {
		print("홍길동","hong@gmail.com","010-1234-1234");
		print("이순신", 99,88,77);
		print("김과장",560,0.0,0.0);
	}
	
	 static void print(String name, int money ,double tax, double tot) {
		System.out.println("============================");
		System.out.println("이름\t급여\t세금\t실수령액");
		tax = money*0.3; 
		tot = money - tax;
		System.out.println(name+"\t"+money+"\t"+tax+"\t"+tot);
	}

	static void print(String name, String email, String hp) {
	System.out.println("이름\t이메일\t\t전화");
	System.out.println(name+"\t"+email+"\t"+hp);
	}
	
	static void print(String name, int kor, int eng, int mat) {
		System.out.println("============================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+(kor+eng+mat)
				+"\t"+String.format("%.1f",(double)(kor+eng+mat)/3));
	}
	
	
}
