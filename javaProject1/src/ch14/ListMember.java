package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListMember {
	public static void main(String[] args) {

		//ArrayList<클래스객체>  <Object>대신 만들어 놓은 Member객체를 제너릭하면 
		//Member 에서 쓰이는 모든 자료형을 처리할 준비가 가능해짐
		List<Member> list =  new ArrayList<>();

		Member m1 = new Member(); //객체생성
		m1.setName("유재준");
		m1.setUserid("You");
		m1.setPasswd("12345");
		m1.setTel("010-1234-5151");
		m1.setEmail("you@gmail.com");

		
		//객체자료를 ArrayList에 담는 방법
		//1)방법
		list.add(m1); //ArrayList에 Member객체를 1개추가
		System.out.println(list.size());
		
		
		//2)방법
		Member m2 = new Member("hong", "1414", "홍길동", "02-1234-1414", "hong@gmail.com"	);
		list.add(m2); //ArrayList에 Member객체를 1개추가
		System.out.println(list.size());
		
		
		//3)방법
		list.add(new Member("kim", "1234", "김철수", "02-1414-5555", "kim@gmail.com"));
		System.out.println(list.size());
		
		
		System.out.println("이름\t아이디\t비번\t전화\t이메일");
		for(int i =0; i<list.size(); i++) {
			Member m = list.get(i); //여기서 m은 ArrayList의 각 데이터를 가리킬 임시 참조변수로 활용
//			System.out.println(m);
			System.out.println(m.getName()+"\t"+m.getUserid()+"\t"+m.getPasswd()+"\t"+m.getTel()+"\t"+m.getEmail());
		}
		
		


	}
}
