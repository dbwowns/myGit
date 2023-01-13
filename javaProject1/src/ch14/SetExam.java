package ch14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import ch12.StaticOuter2;

public class SetExam {
	public static void main(String[] args) {

		Set<String> hs = new TreeSet<>(); //TreeSet 은 알파벳 순서대로 정렬해줌 . 단 입력과정중에서 
		//계속 sorting을 하기 때문에 대량의 데이터를 다루기엔 비효율적이다.

		//	Set<String> hs = new HashSet<>();
		//Set은 중복값을 허용하지 않는다.
		hs.add("korea");
		hs.add("japan");
		hs.add("america");
		hs.add("britain");
		hs.add("britain");//중복값은처리되지않음
		System.out.println(hs);//순서대로 저장되지않음
		for(String str :hs) {
			System.out.println(str);
		}
		System.out.println();
		//Iterator 반복 처리를 위한 클래스
		Iterator<String > it = hs.iterator();
		while(it.hasNext()) {//다음 요소가 있으면 true	
			System.out.println(it.next());//다음요소를 꺼냄
		}



	}
}
