package ch11;

public  class Sinfo implements Student{
	
	String name;
	String addr;
	String email;
	int kor;
	int eng;
	int math;
	
	public Sinfo() {
		
	}

	
	public Sinfo(String name, String addr, String email, int kor , int eng, int math) {
	this.name = name;
	this.addr = addr;
	this.email=email;
	this.kor=  kor ;
	this.eng = eng;
	this.math = math;
	}
	
	public void address() {
		System.out.println("========================================================");
		System.out.println("이름\t주소\t\t이메일");
		System.out.println(name+"\t"+addr+"\t"+email);
	}

	public void point() {
	int tot = kor+eng+math;
	double avg = tot /3.0;
	System.out.println("-------------------------------------------------------");
	System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
	System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+String.format("%.1f", avg));
	System.out.println("========================================================");
	}
	
}
