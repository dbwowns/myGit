package ch18;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;

public class RandomFile2 {
	public static void main(String[] args) {

		OutputStream os = null;
		String file1 = "/Users/test//rand2.txt";
		String str = null;
		try {
			os = new FileOutputStream(file1); 
			System.out.println("입력하세요 : ");
			while(true) {
				int ch =System.in.read();
				if(ch ==10) break;  //맥은 10
				os.write(ch);
			}
			System.out.println("저장되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		try { 
			RandomAccessFile file = new RandomAccessFile(file1, "rw");
			file.seek(9); //UserId : kim 는  k가 딱 9번째이니까 9번인덱스
			file.write("park".getBytes());
			while(file.getFilePointer() < file.length()) {
				str= file.readLine();
				str =  new String(str.getBytes("8859_1"),"utf-8");
			}
			file.close();
			System.out.println("파일이 변경되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
