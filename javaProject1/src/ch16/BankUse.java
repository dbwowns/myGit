package ch16;

public class BankUse {
public static void main(String[] args) {
	MyBank m1 = new MyBank();
	
	BankPlayer play1 = new BankPlayer(1, m1);
	BankPlayer play2 = new BankPlayer(2, m1);
	BankPlayer play3 = new BankPlayer(3, m1);

	play1.start();
	play2.start();
	play3.start();

}
}
