package ch07;

public class Radio {
	double channel;
	int volume;
	boolean onOff;
	
	void print() {
		if(channel ==89.1) {
			System.out.println("[브리츠 라디오]");
		}
		if(onOff ==true) {
			System.out.println("라디오가 켜져있습니다.");
		}
		System.out.println("현재 채널은 " + channel+"입니다.");
		System.out.println("볼륨은 "+volume+"입니다.");
	}
	void print2() {
		if(channel ==95.1) {
			System.out.println("[아이리버 라디오]");
		}
		if(onOff ==true) {
			System.out.println("라디오가 켜져있습니다.");
		}else {
			System.out.println("라디오가 꺼져있습니다.");
		System.out.println("현재 채널은 " + channel+"입니다.");
		System.out.println("볼륨은 "+volume+"입니다.");
	}
	}
}
