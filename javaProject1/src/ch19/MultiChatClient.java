package ch19;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import ch15.TryEx;

public class MultiChatClient {
	static String nickName = null; 
	static JTextArea ta;
	static JTextField tf;
	static DataOutputStream out;


	public static void main(String[] args) {
		nickName = JOptionPane.showInputDialog("대화명을 입력하세요");
		new ClientScreen(nickName);

		Socket socket;
		try {
			String serverIP = "localhost";
			socket = new Socket(serverIP , 7777);
			Thread  receiveThread = new ClientReceiver(socket);
			receiveThread.start();
			Thread sender = new ClientSendar(socket, nickName);
			sender.start();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	//메시지 전송용 스레드 클래스
	static class ClientSendar extends Thread {
		Socket socket;
		String name;

		public ClientSendar(Socket socket, String name) {
			this.socket = socket;
			try {
				out = new DataOutputStream(socket.getOutputStream());
				this.name=name;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public void run() {
			Scanner scanner = new Scanner(System.in);
			try {
				if (out != null) {
					out.writeUTF(name); 
				}
				while(out != null) {
					out.writeUTF("["+name+"]"+scanner.nextLine());;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	//메시지 수신용 스레드 클래스
	static class ClientReceiver extends Thread{
		Socket socket;
		DataInputStream in ;

		public ClientReceiver(Socket socket) {
			this.socket=socket;
			try {
				in = new DataInputStream(socket.getInputStream());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		@Override
		public void run() {
			while(in != null) {
				try {
					String s=  in.readUTF();
					System.out.println(s);
					ta.append(s+"\n");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	static class ClientScreen extends JFrame implements ActionListener{
		public ClientScreen(String nick) {
			setSize(300,500);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setVisible(true);
			setTitle(nick+"의 채팅방 클라이언트!");
			ta= new JTextArea(25,40); 
			tf = new JTextField(25);
			tf.addActionListener(this);
			JPanel panel = new JPanel();

			panel.setLayout(new BorderLayout()); //패널레이아웃 변경
			panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT); //패널의 배치방향 설정(좌에서 우로)
			JLabel label_name = new JLabel(nick+ "님");
			panel.add(label_name,BorderLayout.WEST);
			panel.add(tf,BorderLayout.CENTER);

			JScrollPane jspanel = new JScrollPane();
			panel.add(jspanel,BorderLayout.NORTH);
			jspanel.setViewportView(ta);
			add(panel, BorderLayout.SOUTH);

		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == tf) { //텍스트필드에서 엔터키 입력
				try {
					//텍스트필드에 입력한 문자열을 보냄
					out.writeUTF("["+nickName+"]"+tf.getText());
					tf.setText("");
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
	}
}
