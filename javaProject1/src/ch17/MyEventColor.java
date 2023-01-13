package ch17;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyEventColor extends JFrame{

	private JFrame f;
	private Color c;
	private Container con ;
	private JButton b1,b2,b3,b4;
	
	
	public MyEventColor() {
		setTitle("BorderLayout");
		setLayout(new BorderLayout());
		b1 = new JButton("Red");
		b2 = new JButton("Blue");
		b3 = new JButton("Cyan");
		b4 = new JButton("Yellow");
	
		add(b1,"North");
		add(b2,"East");
		add(b3,"South");
		add(b4,"West");
		
		b1.addActionListener(new MyColorAction(this, Color.red));
		b2.addActionListener(new MyColorAction(this, Color.blue));
		b3.addActionListener(new MyColorAction(this, Color.cyan));
		b4.addActionListener(new MyColorAction(this, Color.yellow));
		
		
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public class MyColorAction implements ActionListener{
		private JFrame f;
		private Color c;
		private Container con ;
		
		public MyColorAction(JFrame f, Color c) {
			this.f=f;
			con = f.getContentPane();
			this.c=c;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			con.setBackground(c);
		}
		
	}
	
	public static void main(String[] args) {
		new MyEventColor();
	}
	
}
