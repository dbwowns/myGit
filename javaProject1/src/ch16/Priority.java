package ch16;

public class Priority extends Thread	{
public static void main(String[] args) {
	Priority e1 = new Priority();
	Priority e2 = new Priority();
	e1.setName("스레드1");
	e2.setName("스레드2");
	System.out.println("e1의 기본 우선순위 : "+ e1.getPriority());
	System.out.println("e2의 기본 우선순위 : "+ e2.getPriority());
	
//	e1.setPriority(7);  숫자로도 줄수 있으나 상수값으로 해야 그나마 cpu에 반영된다.
	e1.setPriority(MIN_PRIORITY);//최소 우선순위(1)
	e2.setPriority(MAX_PRIORITY);//최대 우선순위(10)
	e1.start();
	e2.start();
	
}
@Override
	public void run() {
	for(int i =1; i<=10; i++) {
		System.out.println(Thread.currentThread().getName()+"==>"+i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
