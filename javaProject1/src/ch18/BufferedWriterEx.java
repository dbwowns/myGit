package ch18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class BufferedWriterEx {
	public static void main(String[] args) {
//		PrintStream ps = System.out;
//		OutputStream os =ps;
//		OutputStreamWriter  osw = new OutputStreamWriter(os);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //위에껄 한줄로 요약한거
		
		try {
			bw.write("환영합니다 \n");
			bw.write("Java");
			bw.newLine(); //개행처리 해주는 메소드
			bw.write("World!");
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
