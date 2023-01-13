package ch08;

public class Book { //도서판매정보 프로그램(생성자 버전)
	//멤버변수
	private String bookName;
	private String author;//저자
	private String press;//출판사
	private int year;
	private int price;//단가
	private int amount;//판매수량
	private int money;//판매금액 
	//생성자
	public Book() {
		this("Java","김선생","한빛",2022,35000,10); //다른생성자 호출할때에는 첫째줄에 호출해야함
		System.out.println("기본생성자 호출");
	}
	public Book(String bookName, String author, String press, int year, int price, int amount) {
		System.out.println("매개변수가 있는 생성자 호출");
		this.bookName = bookName;
		this.author = author;
		this.press = press;
		this.year = year;
		this.price = price;
		this.amount = amount;
		money = price *amount;
	}

	public void print() {
		System.out.println("도서명\t저자\t출판사\t출판연도\t단가\t판매수량\t판매금액");
		System.out.println(bookName+"\t"+author+"\t"+press+"\t"+year+"\t"+price+"\t"+amount+"\t"+money);
	}

	
}
