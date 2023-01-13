package ch11;

public class StudentUse {
public static void main(String[] args) {
	Sinfo s = new Sinfo();
	s.name ="홍길동";
	s.addr="서울 강남구";
	s.email = "hong@gmail.com";
	s.kor=90;
	s.eng=85;
	s.math=79;
	s.address();
	s.point();
}
}
