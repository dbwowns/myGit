package ch16;

public class ATMsync {
	public static void main(String[] args) {
		ATM atm = new ATM();
		Thread mom = new Thread(atm, "mom");
		Thread son = new Thread(atm, "son");
		mom.start();
		son.start();
	}
}


class ATM implements Runnable{
	private long accBalance = 10000; //통장잔고


	@Override
	public void run() {
		synchronized (this) {
			for(int i=0; i<10; i++) {
				notify(); //일시정지상태에 있는 스레드를 깨움
				//wait하고 있는 스레드(한개만)에 notify신호를 보낸다.
				//여러 스레드에서 wait을 하고있어도 하나만 깨운다. 어떤 스레드를 깨울지 알 수 없다.
				//wait을 하고있는 스레드가 없는 경우 notify신호는  그냥 소멸한다.

				//notifyAll() : wait하고 있는 모든 스레드를 꺠운다. 이떄 깨어나는 순서는 
				//어떤 것이 깰지 모른다. wait 하고 있는 스레드가 없으면 마찬가지로 소멸한다.

				try {
					wait();
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(getAccount() <= 0) { //통장잔액이 없으면
					break;
				}
				withDraw(1000);
			}
		}
	}


	public void withDraw(long cash) { //출근거래메소드
		if(getAccount()>0) {
			accBalance -=cash;//잔액에서 1000원 인출
			System.out.print(Thread.currentThread().getName() + " , ");
			System.out.printf("잔액 : %,d 원 %n",getAccount());
		}else {
			System.out.print(Thread.currentThread().getName() + " , ");
			System.out.println("잔액이 부족합니다.");
		}

	}


	public long getAccount() {

		return accBalance;
	}
}

