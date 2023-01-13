package ch11;

public  class VehicleUse {

	public static void main(String[] args) {
		Vehicle v = new Car();
		v.speedUp();
		v.speedDown();
		v.handle();
		
		v  = new Plane();
		v.speedUp();
		v.speedDown();
		v.handle();
		
		v=new Boat();
		v.speedUp();
		v.speedDown();
		v.handle();
	}
}
