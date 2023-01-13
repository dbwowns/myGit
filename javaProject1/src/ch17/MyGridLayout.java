package ch17;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyGridLayout extends JFrame{

	public MyGridLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(300,200);
		
		Container c =getContentPane();
		c.setLayout(new GridLayout(4,2));
		c.add(new JLabel("id   : "));
		c.add(new JTextField(20));
		c.add(new JLabel("비밀번호   : "));
		c.add(new JPasswordField(20));
		c.add(new JLabel("이메일   : "));
		c.add(new JTextField(20));
		c.add(new JLabel("hp   : "));
		c.add(new JTextField(20));
	
	}
	
	public static void main(String[] args) {
		new MyGridLayout();
	}
}
