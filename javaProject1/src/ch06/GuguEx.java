package ch06;

public class GuguEx {

	
	public static void gugu(int dan) {
		System.out.println("==="+dan+"단===");
		for(int i=1; i<=9; i++) {
			System.out.println(dan+"x"+i+"="+dan*i);
		}
	}
	
	public static void guguAll() {
		for(int i=2; i<=9;	i++	) {
			System.out.println("==="+i+"단===");
			for(int j=1; j<=9;j++) {
				System.out.println(i+"x"+j+"="+j*i);
			}
		}
	}
	public static void main(String[] args) {
//		gugu(3);
//		System.out.println();
//		guguAll();
		for(int i=2; i<=9; i++) {  //guguAll 이랑똑같음
			gugu(i);
		}
	}
}
