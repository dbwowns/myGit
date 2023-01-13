package ch11;

public class AutoCarTest {
public static void main(String[] args) {
	OperateCar o = new AutoCar();
	o.start();
	o.setSpeed(100);
	o.turn(15);
	o.stop();
}
}
