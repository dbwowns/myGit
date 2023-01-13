package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {
	public static void main(String[] args) throws Exception{
		ServerSocket serverSocket =null;
		try {
			serverSocket =new ServerSocket(5555);
			System.out.println("서비스 시작");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("서비스를 시작할 수 없습니다.");
			System.exit(1); //비정상종료
		}
		Socket clientSocket =null;
		try {
			//클라이언트의 접속을 기다리다가 접속하면 소켓연결
			clientSocket = serverSocket.accept();
			System.out.println("클라이언트의 ip : " + clientSocket.getInetAddress().getHostAddress());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		//발신용 스트림
		PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
		//수신용 스트림
		BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		String receive ="";
		String send ="Welcome";
		
		writer.println(send);
		Scanner sc = new Scanner(System.in);
		while(true) {
			receive =reader.readLine();
			if (receive == null || receive.equals("quit")) {
				break;
			}
			System.out.println("[client]" +receive);
			System.out.println("서버님 입력하세요 (종료 :quit)");
			send =sc.nextLine();
			writer.println(send); //메시지 보내기
			
			if(send.equals("quit")) break;
		}
		sc.close();
		writer.close();
		reader.close();
		clientSocket.close();
		serverSocket.close();
	}
}
