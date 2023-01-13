package ch18;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileWrite {
	public static void main(String[] args) {
		//프로그램 ==> 파일(출력스트림 필요)
		OutputStream os = null;
		try {
			os = new FileOutputStream("/Users/test//aab.txt"); //"" 안에 파일경로를써야함
			System.out.println("입력하세요 : ");
			while(true) {
				int ch =System.in.read();
				if(ch ==10) break;
				os.write(ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
