package ch07;

public class StudentUse {
public static void main(String[] args) {
	Student st = new Student();
	//데이터 입력
	st.setName("유재준");
	st.setMajor("컴퓨터");
	st.setYear(3);
	st.setNum("1234");
	st.setPoint(4.1);
	st.setMoney(400);
	st.print();
}
}
