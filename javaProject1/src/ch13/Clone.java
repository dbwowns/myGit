package ch13;
//인스턴스를 복제하려면 Cloneable를 implements해야한다.
public class Clone implements Cloneable{
	int num=10;
	void print() {
		System.out.println(num);
	}
	
	
	public static void main(String[] args) {
		Clone c = new Clone();
		Clone c2 =null;
		try {//예외가 발생할 가능성의 코드
			c2 = (Clone)c.clone(); //인스턴스를 복제, clone()은 Object의 메소드이기 때문에
			//좌변과 맞추기 위해 (Clone)으로 형변환해야 한다.
			
		} catch (Exception e) { //예외가 발생될때 작동
		e.printStackTrace();//개발자를 위한 디버깅 정보 제공
		}
		System.out.println(c);
		System.out.println(c2);
		c.print();
		c2.print();
	
}
}
