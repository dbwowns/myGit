package ch08;

public class MyManagerUse {
public static void main(String[] args) {
	MyManager m1 = MyManager.getInstance();
	System.out.println(m1);
	System.out.println(m1.getScore());
	m1.setScore(100);
	System.out.println(m1.getScore());
}
}
