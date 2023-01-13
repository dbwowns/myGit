package ch14;

import java.util.Scanner;

public class Book {
	private String BookName;
	private String perss; //출판사
	private int price;//단가
	private int amount;//판매수량
	private int money;//판매금액

	public void input() {
		Scanner scanner =  new Scanner(System.in);
		System.out.println("도서명 : ");
		BookName = scanner.next();
		
		System.out.println("출판사 : ");
		perss = scanner.next();
		
		System.out.println("단가 : ");
		price = scanner.nextInt();
		
		System.out.println("판매수량 : ");
		amount = scanner.nextInt();
		
		money = price *amount;

	}

	
	
	public String getBookName() {
		return BookName;
	}

	public void setBookName(String bookName) {
		BookName = bookName;
	}

	public String getPerss() {
		return perss;
	}

	public void setPerss(String perss) {
		this.perss = perss;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
	
	
	
	
	
	
}
