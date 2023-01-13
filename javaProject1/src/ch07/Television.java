package ch07;

public class Television {
	//전역변수 (멤버변수)	
	int channel; //초기화 안해줘도됨 channel =0이 자동으로 되어있음. channel = 7;
	int volume;// volume = 10;
	boolean onOff; //불린 타입은 기본적으로 false로 초기화됨. onOff=false;  onOff =true;

	
	//멤버 메소드
	void print() {
		System.out.println("채널은 "+channel +"이고 볼륨은"+volume+"입니다");
	}
	int getChannel() {
		return channel; //채널에 기억된값 리턴   
	}
	void setChannel(int ch) { //ch =11 을 받아서 채널에 기억하게함
		channel = ch;
	}
	
}