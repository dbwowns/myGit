package ch18;

import java.io.RandomAccessFile;

public class RandomFile {
public static void main(String[] args) {
	String str = null;
	try { //"rw" 읽기 쓰기 전용     ,r : 읽기 전용 , w : 쓰기 전용
		RandomAccessFile file = new RandomAccessFile("/Users/test//rand.txt", "rw"); // "" 에 파일경로
		System.out.println(file.getFilePointer());
		//getFilePointer  파일을 어디까지 읽었는지
		file.seek(8); // 8번째 인덱스 부터
		System.out.println(file.getFilePointer());
		file.write("Java".getBytes());
		System.out.println(file.length());//문자길이 (한글은 3바이트 길이값을 가짐)
		System.out.println(file.getFilePointer());
		while(file.getFilePointer() < file.length()) {
			//파일의 내용보다 파일포인터의 위치값이 적으면 반복
			str= file.readLine();
			//String (문자열, 캐릭터셋) 인코딩방식 변환
			//iso-8859-1 , 8859_1   :서유럽 인코딩 방식
			str =  new String(str.getBytes("8859_1"),"utf-8");
		}
		System.out.println(file.length());
		System.out.println(file.getFilePointer());
		file.close();
		System.out.println("파일이 저장되었습니다.");
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
