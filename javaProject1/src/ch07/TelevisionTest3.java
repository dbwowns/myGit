package ch07;

public class TelevisionTest3 {
	public static void main(String[] args) {
	Television myTv = new Television(); //객체생성
	myTv.channel = 10;
	myTv.volume = 9;
	myTv.onOff = true;
	myTv.print();
	
	Television yourTv = new Television();
	yourTv.channel =7;
	yourTv.volume = 9;
	yourTv.onOff=true;
	yourTv.print();
	}
}
