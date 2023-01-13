package ch18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamEx {
	public static void main(String[] args) {
		try {
			DataOutputStream dataout = new DataOutputStream(new FileOutputStream(""));//파일 경로
			dataout.writeInt(123);//숫자형식의 자료를 파일에 저장
			dataout.writeChar('A'); //문자 형식의 자료를 파일에 저장
			dataout.writeDouble(3.5); // 실수형식
			dataout.close();
			System.out.println("저장되었습니다.");
			DataInputStream datain = new DataInputStream(new FileInputStream("")); //위에 썻던 파일경로
			System.out.println(datain.readInt());
			System.out.println(datain.readChar());
			System.out.println(datain.readDouble());
			datain.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
