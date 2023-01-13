package ch08;

public class Person {
	private String name;
	private int height;
	private int weight;

	public Person() {
		this("유재준" ,170,50); //(String , int, int	) 타입형태의 다른 생성자 호출
	}

	public Person(String name) {
		this(name,190,100);
	}
	public Person(String name,int height) {
		this(name,height,80); //다른 생성자 호출
	}
	public Person(String name, int height, int weight) {
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
	public void showInfo() {
		System.out.println("==신상 정보==");
		System.out.println("이름 : "+ name);
		System.out.println("키 : "+ height);
		System.out.println("몸무게 : "+ weight);
	}
	
}
