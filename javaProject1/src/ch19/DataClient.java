package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;


public class DataClient {
	public static void main(String[] args) throws Exception{
		// new Socket("ip주소",서버쪽 포트번호);
		Socket s= new Socket("127.0.0.1",6000);
		BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
		//서버에서 보낸 메시지를 받음	ㄴ
		String res = input.readLine();
		System.out.println(res);
		s.close();
		System.exit(0);
	}
}
