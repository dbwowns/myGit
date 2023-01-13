package ch17;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventEx2 extends JFrame{

		private JButton b1,b2,b3,b4,b5,b6;
		
		public EventEx2() {
			//플로우 레이아웃 변경
			setLayout(new FlowLayout());
			b1 = new JButton("Red");
			b2 = new JButton("Green");
			b3 = new JButton("Blue");
			b4 = new JButton("White");
			b5 = new JButton("Cyan");
			b6 = new JButton("Yellow");
			
			//프레임에 버튼 추가
			add(b1);
			add(b2);
			add(b3);
			add(b4);
			add(b5);
			add(b6);
			
			//버튼클릭시 이벤트 기능 추가
			b1.addActionListener(new MyColorAction(this, Color.red));
			b2.addActionListener(new MyColorAction(this, Color.green));
			b3.addActionListener(new MyColorAction(this, Color.blue));
			b4.addActionListener(new MyColorAction(this, Color.white));
			b5.addActionListener(new MyColorAction(this, Color.cyan));
			b6.addActionListener(new MyColorAction(this, Color.yellow));
			
			setSize(300,400);
			setVisible(true);
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);//현재 창만 닫음
			
		}
	public static void main(String[] args) {
		new EventEx2();
	}
}
