package ch18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopy {
	public static void main(String[] args) {
		//복사본 <==  (OutputStream객체 사용)  [프로그램] <==   (InputStream객체 사용)    원본
		String str = "";

		BufferedReader reader = null;
		BufferedWriter writer = null;

		String file1 ="/Users/test//aab.txt";  //파일경로 들어가야함   원본파일
		String file2 ="/Users/test//b.txt"; //파일경로 들어가야함   복사본파일

		try {
			reader = new BufferedReader(new FileReader(new File(file1)));
			writer = new BufferedWriter(new FileWriter(new File(file2)));

			while(true) {
				str =reader.readLine(); //한 라인을 읽음
				if(str == null) break; //내용이 없으면 종료
				writer.write(str+"\r\n"); //파일을 기록할 때는 \r\n을 다써주어야 줄바꿈 처리가 된다.
				//\r  : carriage return (캐리지 리턴)
			}
			System.out.println("파일 복사가 완료되었습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(reader != null) reader.close(); //리소스를 개별적으로 닫아주는게 좋다.
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(writer != null) writer.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}
}
