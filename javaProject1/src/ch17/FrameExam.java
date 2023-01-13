package ch17;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameExam {
public static void main(String[] args) {
	
	Frame f = new Frame("프레임 테스트"); // 프레임 생성
	f.setSize(200,300);
	f.setVisible(true);//프레임 화면에 표시
	
	
	f.addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	});
	
	
	
//	f.addWindowListener(new WindowListener() {
//		
//		@Override
//		public void windowOpened(WindowEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//		
//		@Override
//		public void windowIconified(WindowEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//		
//		@Override
//		public void windowDeiconified(WindowEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//		
//		@Override
//		public void windowDeactivated(WindowEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//		
//		@Override
//		public void windowClosing(WindowEvent e) {
//			//프로그램 종료 , 정상종료 : 0 ;  비정상종료 :-1 ; 
//			System.exit(0);
//		}
//		
//		@Override
//		public void windowClosed(WindowEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//		
//		@Override
//		public void windowActivated(WindowEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//	});
	
	
}
}
