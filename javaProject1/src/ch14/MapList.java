package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList {
	static void print(Map<String, Object>map) {
		ArrayList<Student> list2 = (ArrayList<Student>)map.get("list");
		for(Student s : list2) {
			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+s.getMajor()+"\t"+s.getYear()
			+"\t"+s.getProfessor());
		}
	}


	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();//맵 인스턴스
		List<Student> list = new ArrayList<>();//리스트 인스턴스
		list.add(new Student("11111", "유재", "컴퓨터", 4, "김교수"));
		list.add(new Student("22222", "유재2", "컴퓨터2", 3, "김교수2"));
		list.add(new Student("33333", "유재3", "컴퓨터3", 2, "김교수3"));
		map.put("list", list); //맵에 리스트 추가
		print(map);//압축파일처럼 list안의 3개의 객체가 map에 담겨져 print쪽의 매개변수화되어 값을 넘김
	}
}
