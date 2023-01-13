package ch18;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderWhile {
	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		System.out.print("글자를 입력해주세요	 : ");
		
		try {
			int code  = isr.read();
			System.out.println("code : "+code);
			while(code !=13) {
				char ch = (char)code;
				code = System.in.read();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
