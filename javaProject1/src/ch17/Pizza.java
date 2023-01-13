package ch17;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Pizza extends JFrame{
	public Pizza() {
		super("피자 메뉴");
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();

		jp1.setBackground(Color.BLACK);
		jp2.setBackground(Color.BLUE);
		jp3.setBackground(Color.CYAN);

		JLabel lable =new JLabel("피자 종류를 선택하세요.");
		jp2.add(lable);

		JButton btn1 = new JButton("치즈");
		JButton btn2 = new JButton("불고기");
		JButton btn3 = new JButton("포테이토");
		JButton btn4 = new JButton("종료");

		//jp3에 버튼추가
		jp3.add(btn1);
		jp3.add(btn2);
		jp3.add(btn3);
		jp3.add(btn4);

		//jp1에 다른패널 추가
		jp1.add(jp2);
		jp1.add(jp3);


		add(jp1,"North");

		ActionListener handler = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("치즈")) {
					JOptionPane.showMessageDialog(null, "치즈피자를 선택하셨습니다. \n가격: 23,000원","치즈피자"
							,JOptionPane.INFORMATION_MESSAGE);
				}else if(e.getActionCommand().equals("불고기")) {
					JOptionPane.showMessageDialog(null, "불고기피자를 선택하셨습니다. \n가격: 24,000원","불고기피자"
							,JOptionPane.WARNING_MESSAGE);
				}else if(e.getActionCommand().equals("포테이토")) {
					JOptionPane.showMessageDialog(null, "포테이토피자를 선택하셨습니다. \n가격: 25,000원","포테이토피자"
							,JOptionPane.DEFAULT_OPTION);

				}else if(e.getActionCommand().equals("종료")) {
					JOptionPane.showMessageDialog(null, "프로그램을 정말 종료하시겠습니까?","종료"
							,JOptionPane.OK_CANCEL_OPTION);
					System.exit(0);
				}
			}
		};
		//버튼에 리스너 부착
		btn1.addActionListener(handler);
		btn2.addActionListener(handler);
		btn3.addActionListener(handler);
		btn4.addActionListener(handler);
	}

	public static void main(String[] args) {
		new Pizza();
	}



}
