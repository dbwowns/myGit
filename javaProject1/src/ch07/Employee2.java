package ch07;

public class Employee2 {
	private String name;
	private String part;//부서
	private String position;//직위
	private int basic;//기본급
	private int bonus;//보너스 (기본급 300%)
	private int total;//총액(기본급+보너스)
	private int tax; //세금(총액 3.3%)	
	private int salary;//실수령액(총액-세금)

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getBasic() {
		return basic;
	}
	public void setBasic(int basic) {
		this.basic = basic;
	}
	public int getBonus() {
		bonus = basic*3;
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public int getTotal() {
		total = basic + bonus;
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTax() {
		tax= (int)(total*0.033);
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public int getSalary() {
		salary = total - tax;
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	//	public void input(String name, String part, String position, int basic) { 
	//		this.name = name;
	//		this.part = part;
	//		this.position = position;
	//		this.basic = basic;
	//	}
	//	
	//	public void calc() {//계산하는거
	//		bonus = basic*3;//보너스 (기본급 300%)
	//		total = basic + bonus;//총액(기본급+보너스)
	//		tax= (int)(total*0.033); //세금(총액 3.3%)	
	//		salary = total - tax;//실수령액(총액-세금)
	//	}
	public void print() {
		System.out.println("이름\t부서\t직위\t기본급\t보너스\t총액\t세액\t실수령액");
		System.out.println(name+"\t"+part+"\t"+position+"\t"+basic+"\t"+bonus+"\t"+total+"\t"+tax+"\t"+salary);
	}


}
