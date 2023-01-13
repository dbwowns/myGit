package ch14;

import java.util.Scanner;

public class Product2 {
	
	private String productNum; //제품번호
	private String productName;//제품명
	private String productPress; //제조사	
	private int price;//단가
	private int amount;//판매수량
	private int money;//판매금액 (단가*수량)

	
	public Product2() {
	}
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("제품번호 : ");
		productNum = scanner.next();
		
		System.out.println("제품명 : ");
		productName = scanner.next();
		
		System.out.println("제조사 : ");
		productPress = scanner.next();
		
		System.out.println("단가(천원)	 : ");
		price = scanner.nextInt();
		
		System.out.println("수량 : ");
		amount = scanner.nextInt();
		
		money = price* amount;
	}

	public String getProductNum() {
		return productNum;
	}

	public void setProductNum(String productNum) {
		this.productNum = productNum;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductPress() {
		return productPress;
	}

	public void setProductPress(String productPress) {
		this.productPress = productPress;
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
