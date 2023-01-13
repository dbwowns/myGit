package ch08;

public class AuctionUse {
	public static void main(String[] args) {
		Auction a1 = new Auction();
		a1.setName("홍길동");
		a1.setUserid("hong");
		a1.setMoney(150000);
		a1.print();
	}
}
