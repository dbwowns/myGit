package ch19;

import java.net.URL;

public class UrlInfo {
public static void main(String[] args) {
	try {
		// new URL(url주소);
		URL url = new URL("https://www.ytn.co.kr/_cs/_sn_0117_202301111059505323_005.html");
		System.out.println("프로토콜 : "+url.getProtocol()	);
		System.out.println("포트번호 : " + url.getPort());
		System.out.println("호스트 : "+ url.getHost());
		System.out.println("파일 : " +url.getFile());
		System.out.println("기타 : "+ url.toExternalForm());
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
