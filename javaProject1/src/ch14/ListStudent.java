package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListStudent {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("2022", "유재준", "컴퓨터", 3,"김교수"));
		list.add(new Student("2021", "유재진", "정치", 1,"박교수"));
		list.add(new Student("2019", "유인연", "토목", 4,"홍교수"));
		System.out.println("학번\t이름\t전공\t학년\t지도교수");
		
		//그냥 for문
//		for(int i =0; i<list.size(); i++) {
//			Student s = list.get(i);
//			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+s.getMajor()+"\t"+s.getYear()+"\t"+s.getProfessor());
//		}
		
		//for~each문 (향상된 for문)
		for(Student s : list) {
			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+s.getMajor()+"\t"+s.getYear()+"\t"+s.getProfessor());
	
		}
		
	}
}
