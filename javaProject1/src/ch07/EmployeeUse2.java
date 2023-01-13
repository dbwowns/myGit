package ch07;

public class EmployeeUse2 {
	public static void main(String[] args) {
		Employee2 e1 = new Employee2();
		e1.setName("김철수");
		e1.setPart("관리부");
		e1.setPosition("과장");
		e1.setBasic(300);
		e1.getBonus();
		e1.getTotal();
		e1.getTax();
		e1.getSalary();
		e1.print();
	}
}
