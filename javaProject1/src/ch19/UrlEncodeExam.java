package ch19;

import java.net.URLDecoder;
import java.net.URLEncoder;

public class UrlEncodeExam {
	public static void main(String[] args) {
		try {
			String str = "유재준";
			
			//URLEncoder.encode(인코딩할 문자열, 인코딩 형식)  ==> 암호화
			System.out.println(URLEncoder.encode(str, "utf-8"));
			System.out.println();
			
			//URLDecoder.decode(디코딩할 문자열, 디코딩 형식)  ==> 복호화
			System.out.println(URLDecoder.decode("%EC%9C%A0%EC%9E%AC%EC%A4%80","utf-8"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
