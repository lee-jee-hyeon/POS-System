package Pos;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Pos.MaeChul.graphicPanel;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.awt.event.ActionEvent;

public class BillPrint extends JFrame {


	private String sumString = "";
	private JPanel bills_Panel = new JPanel();
	
	public BillPrint(PosMain posMain) {
		
		setBackground(new Color(255, 255, 255));
		this.setUndecorated(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("chickenicon.png")));
		getContentPane().setBackground(new Color(255, 255, 255));
		setTitle("bills");
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(255, 255, 255));
		panel1.setLayout(null);
		panel1.setBounds(24, 17, 844, 394);
		getContentPane().add(panel1);
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
	
		sumString = posMain.number;
		bills_Panel.setBackground(new Color(255, 255, 255));
		bills_Panel.setLayout(null);
		bills_Panel.setBounds(18, 423, 850, 159);
		getContentPane().add(bills_Panel);
		JButton bt_re = new JButton("BACK");
		bt_re.setFont(new Font("12롯데마트드림Bold", Font.PLAIN, 25));
		bt_re.setBounds(900-150, 0, 100, 50);
		bills_Panel.add(bt_re);
		JLabel lblNewLabel = new JLabel("영수증");
		lblNewLabel.setForeground(new Color(148, 0, 211));
		lblNewLabel.setFont(new Font("12롯데마트드림Bold", Font.BOLD, 40));
		lblNewLabel.setBounds(0, 0, 500, 100);
		panel1.add(lblNewLabel);
		JLabel sumText = new JLabel();
	//	sumText.setForeground(new Color(148, 0, 211));
	//	sumText.setFont(new Font("12롯데마트드림Bold", Font.BOLD, 40));
		//sumText.setBounds(10, 10, 200, 200);
	//	sumText.setText(n + "원");
		bills_Panel.add(sumText);
		
		
		bt_re.setBackground(new Color(250, 235, 215));
		bt_re.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				posMain.setVisible(true);
			}
		});
		bt_re.setFocusable(false);
		

		setSize(400,600);
		Dimension dimen = Toolkit.getDefaultToolkit().getScreenSize(); //화면 사이즈를 넣어줌		 
		Dimension dimen1 = getSize(); //프레임 사이즈 입력
		int xpos = (int)(dimen.getWidth())/2-(int)dimen1.getWidth()/2; //화면사이즈/2 - 프레임사이즈/2 (화면중앙)		
		int ypos = (int)(dimen.getHeight())/2 -(int)dimen1.getHeight()/2;		
		setLocation(xpos, ypos); //화면중앙에 위치
		setVisible(true);
		setResizable(false);
	}


}

	
	
