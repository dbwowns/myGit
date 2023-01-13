package ch07;

public class Employee {
	private String name;
	private String part;//부서
	private String position;//직위
	private int basic;//기본급
	private int bonus;//보너스 (기본급 300%)
	private int total;//총액(기본급+보너스)
	private int tax; //세금(총액 3.3%)	
	private int salary;//실수령액(총액-세금)
	
	public void input(String name, String part, String position, int basic) { //계산안하는거
		this.name = name;
		this.part = part;
		this.position = position;
		this.basic = basic;
	}
	public void calc() {//계산하는거
		bonus = basic*3;//보너스 (기본급 300%)
		total = basic + bonus;//총액(기본급+보너스)
		tax= (int)(total*0.033); //세금(총액 3.3%)	
		salary = total - tax;//실수령액(총액-세금)
	}
	public void print() {
		System.out.println("이름\t부서\t직위\t기본급\t보너스\t총액\t세금\t실수령액");
		System.out.println(name+"\t"+part+"\t"+position+"\t"+basic+"\t"+bonus+"\t"+total+"\t"+tax+"\t"+salary);
	}

}
