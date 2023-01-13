package ch12;

public class InnerExam2 {
	static class Cal{ //내부 static class
		int value =0;
		public void plus() {
			value++;
		}
	}
	
	public static void main(String[] args) {
		//내부 static class 에 접근할때에는
	//외부클래스.내부클래스  참조변수 = new 외부클래스.내부생성자
		InnerExam2.Cal cal= new InnerExam2.Cal();
		cal.plus();
		System.out.println(cal.value);
	}
}
