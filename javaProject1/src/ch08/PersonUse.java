package ch08;

public class PersonUse {
public static void main(String[] args) {
	Person p1 = new Person();//객체생성과 동시에 기본생성자 호출
	p1.showInfo();
	
	Person p2 = new Person("유재진");
	p2.showInfo();
	
	
	Person p3 = new Person("이미경", 160);
	p3.showInfo();
	
	Person p4 = new Person("유인연", 174, 79);
	p4.showInfo();
}
}
