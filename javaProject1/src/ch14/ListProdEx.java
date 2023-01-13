package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListProdEx {
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();//해쉬맵 객체 생성
		List<ProdEx> list = new ArrayList<>(); //리스트 객체 생성
		
		list.add(new ProdEx("TV", "qqq123", "LG", 3000, 3)); //메모리 100번지
		list.add(new ProdEx("에어컨", "ㅁㅇㄴ123", "삼성", 4000, 2));//메모리 200번지
		list.add(new ProdEx("냉장고", "ㅋㅋㅋ131", "KT", 5000, 6));//메모리 300번지....
		list.add(new ProdEx("컴퓨터", "ㅊㅊㅊ331", "넥슨", 6000, 5));//....
		
		map.put("list", list); //맵에 리스트 추가 put("key", value)
		print(map);
		
	}
	
	static void print(Map<String, Object> map) {
		@SuppressWarnings("unchecked")
		ArrayList<ProdEx> list2 = (ArrayList<ProdEx>)map.get("list");
		System.out.println("-------------------(단위: 만원)-----------------------");
		System.out.println("제품명\t제품번호\t제조사\t단가\t수량\t판매금액");
		System.out.println("----------------------------------------------------");
		
		for(ProdEx s : list2) {
			System.out.println(s.getName()+"\t"+s.getNum()+"\t"+s.getCompany()
			+"\t"+s.getPrice()+"\t"+s.getAmount()+"\t"+s.getMoney());
		}
		System.out.println("----------------------------------------------------");
		
		
		
	}
	
	
	
}
