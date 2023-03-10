package ch17;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuEx extends JFrame{

	private JMenuItem mie = new JMenuItem("Exit");

	public MenuEx() {
		super("Menu 예제"	);
		creatMenu();
		setSize(300,200);
		setVisible(true);
		
	}
	
	 void creatMenu() {
		 JMenuBar mb = new JMenuBar(); // 메뉴바 생성
		 JMenu jm = new JMenu("File"); //메뉴생성
		 jm.add(new JMenuItem("Open"));//메뉴에 메뉴아이템 추가
		 jm.add(new JMenuItem("Save"));
		 jm.add(new JMenuItem("Print"));
		 jm.addSeparator();//메뉴 분리선 추가
		 jm.add(mie);
		 mb.add(jm); //메뉴바에 메뉴 추가
		 mb.add(new JMenu("Edit"));
		 mb.add(new JMenu("Project"));
		 mb.add(new JMenu("Run"));
		 setJMenuBar(mb); //프레임에 매뉴바 추가(메뉴바는 프레임에만 붙일 수 있다.)
		 
		 mie.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					System.exit(0);
			}
		});
	 }

	public static void main(String[] args) {
		new MenuEx();
	}
}
