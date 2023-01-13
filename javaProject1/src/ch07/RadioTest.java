package ch07;


public class RadioTest {
public static void main(String[] args) {
	Radio ra = new Radio();
	ra.channel = 89.1;
	ra.volume =12;
	ra.onOff = true;
	ra.print();
	System.out.println();
	System.out.println();
	
	Radio ra2 = new Radio();
	ra2.channel = 95.1;
	ra2.volume = 9;
	ra.onOff = false;
	ra2.print2();
	
}
}
