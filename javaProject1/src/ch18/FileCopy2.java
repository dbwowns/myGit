package ch18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStream;

public class FileCopy2 {

	public static void main(String[] args) {
		OutputStream os = null;
		
		String str = "";
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		String file1 ="/Users/test//abc.txt"; 
		String file2 ="/Users/test//abcCopy.txt"; 

		try {
			os = new FileOutputStream(file1); //"" 안에 파일경로를써야함
			System.out.println("입력하세요 : ");
			while(true) {
				int ch =System.in.read();
				if(ch ==10) break;
				os.write(ch);
			}
			System.out.println();
			System.out.println("파일이 저장되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		

		try {
			br = new BufferedReader(new FileReader(new File(file1)));
			bw = new BufferedWriter(new FileWriter(new File(file2)));

			while(true) {
				str =br.readLine(); 
				if(str == null) break;
				bw.write(str+"\r\n"); 
			}
			System.out.println("파일 복사가 완료되었습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null) br.close(); 
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(bw != null) bw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}

