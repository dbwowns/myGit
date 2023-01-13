package ch14;

public class Type2 {
	private Object value;
	
	
	
	
	public Object getValue() {
		return value;
	}




	public void setValue(Object value) {
		this.value = value;
	}




	public static void main(String[] args) {
		Type2 t = new Type2();
		t.setValue("you");
		System.out.println(t.getValue());
		
		t.setValue(100);
		System.out.println(t.getValue());
		
		//이처럼 Object로 모든걸 처리하게 되면 내부적으로 형변환등의 처리가 많아져서 메모리 사용량이 늘어난다.
	}
}
