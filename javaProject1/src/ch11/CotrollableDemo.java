package ch11;

public class CotrollableDemo {
public static void main(String[] args) {
//	Tv t = new Tv();
//	t.turnOn();
//	t.turnOff();
//	t.remoteOn();
//	t.remoteOff();
//	t.repair();
//	
//	Controllable.reset(); //static 메소드는 클래스이름.메소드로 접근가능하다.
//	
//	Computer com =new Computer();
//	com.turnOn();
//	com.turnOff();
//	com.repair();
//	Controllable.reset();
	
	NoteBook n = new NoteBook();
	n.turnOn();
	n.turnOff();
	n.repair();
	Controllable.reset();
}
}
