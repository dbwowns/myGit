package ch07;

public class PersonUse {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("유재준");
		p1.setAge(25);
		p1.setHeigth(183);
		p1.print();
		
		System.out.println("이름 : " + p1.getName());
		System.out.println("나이 : "+ p1.getAge());
		System.out.println("키 : "+ p1.getHeigth());
//		p1.name = "유재준";
//		p1.age =20;
//		p1.heigth =180.0;
//		System.out.println("이름 : " + p1.name);
//		System.out.println("나이 : "+ p1.age);
//		System.out.println("키 : "+ p1.heigth);
	}
}
