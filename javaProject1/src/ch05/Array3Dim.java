package ch05;

public class Array3Dim {
//3차원 배열 : 배열명 = new 자료형[면][행][열]
	
	public static void main(String[] args) {
		//2면 3행 4열
		String[][][] subject = {
		{ //1면
		{"JS01","AL02","PY03","DS04"} //과목코드
		,{"JSP","알고리즘","파이썬","자료구조"} //과목명
		,{"유재준","유재진","이미경","유인연"}} // 지도교수
		
		,{ //2면
		{"CS01","CS02","CS03","CS04"}// 과목코드
		,{"생활영어","경제학","생활체육","음악"} //과목명
		,{"김영철","이수근","강호동","이승기"}// 지도교수
		}};
		//subject[0][0][0] = "JS01" ,subject[0][0][1] = "AL02",
		
		for(int i=0; i<subject.length; i++) {	//면 
			for(int j =0; j<subject[i].length; j++	) {  //행
				for(int k =0; k<subject[i][j].length; k++) { //열	
					System.out.println("["+i+"]["+j+"]["+k+"] : " +subject[i][j][k]);
				}
			}
			System.out.println("========================");
		}
	}
}
