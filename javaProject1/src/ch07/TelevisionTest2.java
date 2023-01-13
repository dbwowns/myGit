package ch07;

public class TelevisionTest2 {
	public static void main(String[] args) {
		Television myTv = new Television(); //객체생성 => 메모리에 로딩됨
		System.out.println(myTv); //메모리의 주소값 (해쉬코드)
		myTv.channel = 8;
		myTv.volume = 10;
		myTv.onOff = true;
		System.out.println("나의 텔레비전 채널은 "+ myTv.channel +"이고 볼륨은 "+myTv.volume +"이다");
		
		
		Television yourTv = new Television(); //객체생성
		System.out.println(yourTv);
		yourTv.channel = 4;
		yourTv.volume =3;
		yourTv.onOff = true;
		System.out.println("너의 텔레비전 채널은 "+ yourTv.channel +"이고 볼륨은 "+yourTv.volume +"이다");
	}
}
