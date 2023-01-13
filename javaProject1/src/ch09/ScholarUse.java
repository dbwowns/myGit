package ch09;

public class ScholarUse {
public static void main(String[] args) {
	Scholar s = new Scholar();
	//1. 부모클래스인 Student 객체가 생성된다.
	//2. Student 생성자 호출.
	//3. Scholar 객체가 호출.
	//4. Scholar 생성자 호출
	s.input("유재준", "2202", "컴공", 4, "1종", 2500000);
	s.print();
	
	s.input2("유재준2", "2201", "전기", 3); //자식클래스에 없으면 자동으로 부모클래스로 찾아간다.
	s.print2();
}
}
