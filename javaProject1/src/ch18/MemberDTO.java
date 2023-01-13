package ch18;

import java.io.Serializable;

//

public class MemberDTO implements Serializable{
	
		private String userid;
		private String name;
		private int age;
		private String email;
		private String passwd;
		
	public MemberDTO() {
	}

	public MemberDTO(String userid, String name, int age, String email, String passwd) {
		super();
		this.userid = userid;
		this.name = name;
		this.age = age;
		this.email = email;
		this.passwd = passwd;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	@Override
	public String toString() {
		return "MemberDTO [userid=" + userid + ", name=" + name + ", age=" + age + ", email=" + email + ", passwd="
				+ passwd + "]";
	}
	
	
}
