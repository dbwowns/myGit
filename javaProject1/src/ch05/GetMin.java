package ch05;

public class GetMin {
public static void main(String[] args) {
	
	int s[]	 = {12,3,14,15,2,24,1,4};
	int mini;
	mini = s[0];  // mini =12 
	
	for(int i=1; i<s.length; i++) {
		if(s[i] < mini) { //3 <12 
			mini = s[i]; //mini =3 변경 	
		}
	}
	System.out.println("최소값은 : " + mini);
}
}
