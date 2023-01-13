package ch18;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//InputStream : 1바이트 단위로 읽음
//InputStreamReader : 문자 단위(2byte)로 읽음
public class InputStreamReaderEx1 {
	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		try {
			System.out.println("한글자를 입력하세요 : ");
			int code = isr.read();//글자의 코드값
			System.out.println("code : "+code);
			char ch = (char)code; //문자처리
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
