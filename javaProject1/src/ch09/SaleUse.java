package ch09;

public class SaleUse {
public static void main(String[] args) {
	Sale s = new Sale();
	//데이터 입력
	s.input(1, "냉장고", "LG", "20221226", 2000, 5);
	s.calc();
	s.print();
}
}
