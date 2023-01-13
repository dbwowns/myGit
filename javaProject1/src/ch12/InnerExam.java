package ch12;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class InnerExam extends Frame{
		public InnerExam() {
			super("내부 클래스 테스트");
			setSize(300,400);//프레임
			setVisible(true);
			
		}
		public static void main(String[] args) {
			InnerExam in = new InnerExam();
			
			//이벤트 처리 : 사용자의 요청에 시스템이 응답
			//이벤트 3대 요소 
			//이벤트  소스 : 이벤트의 대상
			//이벤트 리스너 : 이벤트 관찰자,. 감시자
			//이벤틑 핸들 : 이벤트 처리기
			
	//		in.addWindowListener(new WindowListener() {
				
//				@Override
//				public void windowOpened(WindowEvent e) {
//					// TODO Auto-generated method stub
//					
//				}
//				
//				@Override
//				public void windowIconified(WindowEvent e) {
//					// TODO Auto-generated method stub
//					
//				}
//				
//				@Override
//				public void windowDeiconified(WindowEvent e) {
//					// TODO Auto-generated method stub
//					
//				}
//				
//				@Override
//				public void windowDeactivated(WindowEvent e) {
//					// TODO Auto-generated method stub
//					
//				}
//				
//				@Override
//				public void windowClosing(WindowEvent e) {
//					System.exit(0); //프로그램 종료 코드 
//				}
//				
//				@Override
//				public void windowClosed(WindowEvent e) {
//					// TODO Auto-generated method stub
//					
//				}
//				
//				@Override
//				public void windowActivated(WindowEvent e) {
//					// TODO Auto-generated method stub
//					
//				}
//			});
		in.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0); //프로그램 종료 코드 
			}
		});
		}
		
}
