package ch09;

public class Manager extends Employee{
	private double bonus; //보너스 (연봉*0.3);

	public void input(int num , String name, String adress, String email, int salary, String rrn, double bonus) {
		setNum(num);
		setName(name);
		setAdress(adress);
		setEmail(email);
		setSalary(salary);
		setRrn(rrn);
		this.bonus = bonus;
	}

	public void calc() {
		bonus = (double)salary*0.3;
	}

	public void print() {
		System.out.println("==========================");
		System.out.println("사번 : "+ getNum());
		System.out.println("이름 : "+ getName());
		System.out.println("주소 : "+ getAdress());
		System.out.println("이메일 : "+ getEmail());
		System.out.println("주민번호 : "+ getRrn());
		System.out.println("연봉 : "+ getSalary());
		System.out.println("보너스 : "+ bonus);
		System.out.println("==========================");	
	}
}
