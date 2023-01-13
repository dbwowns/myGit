package ch16;

public class BankPlayer extends Thread{
	int type;
	MyBank myBank;
	public BankPlayer(int type,MyBank myBank) {
		this.type = type;
		this.myBank=myBank;
	}
	
	@Override
	public void run() {
		switch (type) {
		case 1: myBank.Bank1();break;
		case 2: myBank.Bank2();break;
		case 3: myBank.Bank3();break;
		}
	}
}
