package ch07;

public class TelevisionTest5 {
public static void main(String[] args) {
	Television myTv = new Television();
	myTv.setChannel(11);
	int ch = myTv.getChannel(); //ch=11
	System.out.println("현재 채널은 :"+ch);
}
}
