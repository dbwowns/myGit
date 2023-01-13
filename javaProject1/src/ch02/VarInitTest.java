package ch02;

public class VarInitTest {

	public static void main(String[] args) {
			int index; // 지역변수 선언만해서 밑에 오류나는거
		//	index = 0;  초기화를 해주면 오류가 사라진다.
			index =8;
			index = index +1;
			System.out.println("index : " + index);
	}

}
