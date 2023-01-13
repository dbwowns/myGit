package ch17;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class PaintExam extends JFrame{

	public PaintExam() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,400);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g); //JFrame의 paint()가 실행
		g.drawString("Hello Java", 10, 60); //drawString("문자열", x좌표 ,y좌표);
		g.drawOval(30, 100, 50, 50);
		g.setColor(Color.blue);
		g.fillOval(100, 100, 50, 50);//fillOval(x,y,w,h)
		g.drawRect(100, 200, 60, 60);
		g.setColor(Color.CYAN);
		g.fillRect(200, 200, 60, 60);
		System.out.println("paint 호출...");
	}
	
	
	public static void main(String[] args) {
		new PaintExam();
	}
}
