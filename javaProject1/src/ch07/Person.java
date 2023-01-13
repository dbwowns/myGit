package ch07;

public class Person {
	//멤버변수
	private String name;
	private int age;
	private double heigth;
	private String email ;
	private String add;
	
	//setter : set+변수명
	public void setName(String name) {
		this.name = name; //this=> 멤버변수를 가리킴	
	}
	//getter :get+변수명
	public  String getName() {
		return name;
	}
	
	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}
	public double getHeigth() {
		return heigth;
	}
	
	public void setAge (int age) {
		if(age < 0|| age>150) {
			System.out.println("입력값이 정확하지 않습니다.");
		}else {
			this.age = age;
		}
	}
	public int getAge() {
		return age;
	}
	
	public void print() {
		System.out.println("이름 : " +name+"\n"+"나이 : "+ age +"\n"+ "이메일 : "+email+"\n"+"주소 : "+add);
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
}
