package ch17;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BorderEx extends Frame{
	
	public BorderEx() {
		setTitle("BorderLayout 예제");
		setSize(300,200);
		setVisible(true);
		
		Button b1 = new Button("east");
		Button b2 = new Button("west");
		Button b3 = new Button("south");
		Button b4 = new Button("north");
		Button b5 = new Button("center");
		
		
//		setLayout(new BorderLayout());    
		//Frame 의 기본레이아웃은 BorderLayout이기떄문에 setLayout은 생략가능
		//BorderLayout의 각영역에 컴포넌트를 배치
		add(b1, "East");
		add(b2, "West");
		add(b3, "South");
		add(b4, "North");
		add(b5, "Center"); // 또는 add(b5)   center는 생략가능
		
		//윈도우창 닫기
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}
	
	
	public static void main(String[] args) {
		new BorderEx();
	}
	

}
