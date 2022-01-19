package Pos;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URL;
import javax.swing.JPanel;

public class PosLogin extends JFrame {

	private JTextField tfid;
	private JPasswordField tfpwd;
	private JButton bt_1 = new JButton("");
	private JButton bt_2 = new JButton("");
	private JButton bt_3 = new JButton("");
	private JButton bt_4 = new JButton("");
	private JButton bt_5 = new JButton("");
	private JButton bt_6 = new JButton("");
	private JButton bt_7 = new JButton("");
	private JButton bt_8 = new JButton("");
	private JButton bt_9 = new JButton("");
	private JButton bt_0 = new JButton("");
	private JButton bt_back = new JButton("");
	private JButton bt_exit = new JButton("");
	private JButton bt_ok = new JButton("");
	private String str="";
	private JLabel lbTitle = new JLabel("LOG-IN kumoh brunch");
	private PosMain ps;
	private JLabel Timage;
	private ImageIcon img;
	private URL imageURL;
	private final JPanel panel2 = new JPanel();

	public PosLogin(){
		super("POS");
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("chickenicon.png")));
		getContentPane().setBackground(new Color(68, 84, 106));
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
		}
		
		login_bt();//�α��� â
		ok_exit_bt();//Ȯ��,����
		num_bt();//���ڹ�ư
		background();//���
	}
	public void wrong_dialog(String str){
		JLabel label = new JLabel(str);
		label.setFont(new Font("12�Ե���Ʈ�帲Bold", Font.PLAIN , 16));
		JOptionPane.showMessageDialog(null,label,"��й�ȣ ����",JOptionPane.PLAIN_MESSAGE);
		tfid.setText("jihyun");
		tfpwd.setText("");
	}
	public void correct_dialog(String str){
		JLabel label = new JLabel(str);
		label.setFont(new Font("12�Ե���Ʈ�帲Bold", Font.PLAIN, 15));
		JOptionPane.showMessageDialog(null,label,"�α��� ����",JOptionPane.PLAIN_MESSAGE);
	}
	public void login_bt(){

		getContentPane().setFont(new Font("12�Ե���Ʈ�帲Bold", Font.PLAIN, 12));
		setTitle("POS kumoh brunch");
		getContentPane().setLayout(null);
	}
	{}
	public void ok_exit_bt(){
		bt_ok.setIcon(new ImageIcon(getClass().getClassLoader().getResource("ok_login.jpg")));
		bt_ok.setBounds(280, 204, 90, 66);
		panel2.setBackground(new Color(254, 255, 255));
		panel2.add(bt_ok);
		bt_ok.setFont(new Font("12�Ե���Ʈ�帲Bold", Font.BOLD, 20));
		bt_ok.setBackground(new Color(250, 235, 215));

		bt_ok.setForeground(new Color(0, 0, 0));
		bt_ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Account db = new Account();
				@SuppressWarnings("deprecation")
				String pwd = tfpwd.getText(); 
				
				if(!pwd.equals(db.getPassword())){
					wrong_dialog("��й�ȣ�� �ٽ� �Է��ϼ���.");
					str="";
				}
				else{//����
					correct_dialog("kumoh brunch OPEN ! ");	
					if(ps==null){//��ü�� �����Ǳ� �� �α��ν�
						try {
							ps = new PosMain(PosLogin.this);
							tfpwd.setText("");
							str="";
						} catch (IOException e1) {
						}
					}
					else{//��ü �����Ǿ �α��ν�
						ps.setVisible(true);
						tfpwd.setText("");
						str="";
					}
					setVisible(false);
				}
			}
		});
		bt_exit.setIcon(new ImageIcon(getClass().getClassLoader().getResource("logout_img.png")));
		bt_exit.setBounds(430, 204, 90, 66);
		panel2.add(bt_exit);
		bt_exit.setFont(new Font("12�Ե���Ʈ�帲Bold", Font.BOLD, 20));
		bt_exit.setForeground(new Color(0, 0, 0));
		bt_exit.setBackground(new Color(250, 235, 215));
		bt_exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel label = new JLabel("���� �Ͻðڽ��ϱ�?");
				label.setFont(new Font("12�Ե���Ʈ�帲Bold", Font.PLAIN, 15));
				int result = JOptionPane.showConfirmDialog(null,label,"����",
								JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
				if(result==JOptionPane.OK_OPTION){
					System.exit(0);
				}
			}
		});
	}//
	public void num_bt(){
		bt_1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("1.png")));
		bt_1.setBounds(29, 22, 55, 55);
		panel2.add(bt_1);
		bt_1.setForeground(new Color(255, 254, 255));
		bt_1.setBackground(new Color(243, 239, 239));
		bt_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str += "1";
				tfpwd.setText(str);
			}
		});

		bt_2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("2.png")));
		bt_2.setBounds(104, 22, 55, 55);
		panel2.add(bt_2);
		bt_2.setForeground(new Color(255, 105, 180));
		bt_2.setBackground(new Color(243, 239, 239));
		bt_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str += "2";
				tfpwd.setText(str);
			}
		});
		
		bt_3.setIcon(new ImageIcon(getClass().getClassLoader().getResource("3.png")));
		bt_3.setBounds(179, 22, 55, 55);
		panel2.add(bt_3);
		bt_3.setForeground(new Color(255, 105, 180));
		bt_3.setBackground(new Color(243, 239, 239));
		bt_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str += "3";
				tfpwd.setText(str);
			}
		});
		bt_4.setIcon(new ImageIcon(getClass().getClassLoader().getResource("4.png")));
		bt_4.setBounds(29, 92, 55, 55);
		panel2.add(bt_4);
		bt_4.setForeground(new Color(255, 105, 180));
		bt_4.setBackground(new Color(243, 239, 239));
		bt_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str += "4";
				tfpwd.setText(str);
			}
		});
		bt_5.setIcon(new ImageIcon(getClass().getClassLoader().getResource("5.png")));
		bt_5.setBounds(104, 92, 55, 55);
		panel2.add(bt_5);
		bt_5.setForeground(new Color(255, 105, 180));
		bt_5.setBackground(new Color(243, 239, 239));
		bt_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str += "5";
				tfpwd.setText(str);
			}
		});
		bt_6.setIcon(new ImageIcon(getClass().getClassLoader().getResource("6.png")));
		bt_6.setBounds(179, 92, 55, 55);
		panel2.add(bt_6);
		bt_6.setForeground(new Color(255, 105, 180));
		bt_6.setBackground(new Color(243, 239, 239));
		bt_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str += "6";
				tfpwd.setText(str);
			}
		});
		bt_7.setIcon(new ImageIcon(getClass().getClassLoader().getResource("7.png")));
		bt_7.setBounds(29, 162, 55, 55);
		panel2.add(bt_7);
		bt_7.setForeground(new Color(255, 105, 180));
		bt_7.setBackground(new Color(243, 239, 239));
		bt_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str += "7";
				tfpwd.setText(str);
			}
		});
		bt_8.setIcon(new ImageIcon(getClass().getClassLoader().getResource("8.png")));
		bt_8.setBounds(104, 162, 55, 55);
		panel2.add(bt_8);
		bt_8.setForeground(new Color(255, 105, 180));
		bt_8.setBackground(new Color(243, 239, 239));
		bt_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str += "8";
				tfpwd.setText(str);
			}
		});
		bt_9.setIcon(new ImageIcon(getClass().getClassLoader().getResource("9.png")));
		bt_9.setBounds(179, 162, 55, 55);
		panel2.add(bt_9);
		bt_9.setForeground(new Color(255, 105, 180));
		bt_9.setBackground(new Color(243, 239, 239));
		bt_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str += "9";
				tfpwd.setText(str);
			}
		});
		bt_0.setIcon(new ImageIcon(getClass().getClassLoader().getResource("0.png")));
		bt_0.setBounds(104, 232, 55, 55);
		panel2.add(bt_0);
		bt_0.setForeground(new Color(255, 105, 180));
		bt_0.setBackground(new Color(243, 239, 239));
		bt_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				str += "0";
				tfpwd.setText(str);
			}
		});
		bt_back.setIcon(new ImageIcon(getClass().getClassLoader().getResource("back.png")));
		bt_back.setBounds(179, 232, 55, 55);
		panel2.add(bt_back);
		bt_back.setForeground(new Color(255, 105, 180));
		bt_back.setBackground(new Color(243, 239, 239));

		bt_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(str.length()-1!=-1)
				{str = str.substring(0,str.length()-1);
				tfpwd.setText(str);
				}
			}
		});
	}
	public void focus(){
		bt_1.setFocusable(false);
		bt_2.setFocusable(false);
		bt_3.setFocusable(false);
		tfid.setFocusable(false);
		bt_4.setFocusable(false);
		bt_5.setFocusable(false);
		bt_6.setFocusable(false);
		bt_7.setFocusable(false);
		bt_8.setFocusable(false);
		bt_9.setFocusable(false);
		bt_0.setFocusable(false);
		bt_exit.setFocusable(false);
		bt_ok.setFocusable(false);
		tfpwd.setFocusable(true);
		bt_back.setFocusable(false);
	}
	public void background(){

		
		imageURL = getClass().getClassLoader().getResource("logo.png");
		img = new ImageIcon(imageURL);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setLayout(null);
		panel.setBounds(63, 34, 550, 108);
		getContentPane().add(panel);
		Timage = new JLabel(img);
		Timage.setBounds(0, 0, 158, 108);
		panel.add(Timage);
		Timage.setBackground(Color.WHITE);
		lbTitle.setForeground(new Color(64, 73, 172));
		lbTitle.setBounds(152, 0, 398, 108);
		panel.add(lbTitle);
		lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitle.setFont(new Font("12�Ե���Ʈ�帲Bold", Font.BOLD, 30));
		
		panel2.setLayout(null);
		panel2.setBounds(60, 172, 553, 303);
		getContentPane().add(panel2);
		JLabel lbid = new JLabel("ID");
		lbid.setForeground(new Color(0, 0, 0));
		lbid.setBounds(279, 10, 109, 41);
		panel2.add(lbid);
		lbid.setFont(new Font("12�Ե���Ʈ�帲Bold", Font.BOLD, 35));
		
				JLabel lbpwd = new JLabel("PW");
				lbpwd.setForeground(new Color(0, 0, 0));
				lbpwd.setBounds(279, 110, 156, 41);
				panel2.add(lbpwd);
				lbpwd.setFont(new Font("12�Ե���Ʈ�帲Bold", Font.BOLD, 35));
				
						tfid = new JTextField();
						tfid.setForeground(new Color(255, 105, 180));
						tfid.setBounds(280, 60, 240, 40);
						panel2.add(tfid);
						tfid.setFont(new Font("12�Ե���Ʈ�帲Bold", Font.BOLD | Font.ITALIC, 20));
						tfid.setBackground(new Color(250, 235, 215));
						tfid.setEditable(false);
						tfid.setText("jihyun");
						tfid.setColumns(10);
						
								tfpwd = new JPasswordField();
								tfpwd.setForeground(new Color(255, 105, 180));
								tfpwd.setBounds(280, 160, 240, 40);
								panel2.add(tfpwd);
								tfpwd.setFont(new Font("12�Ե���Ʈ�帲Bold", Font.PLAIN, 23));
								tfpwd.setBackground(new Color(250, 235, 215));
		setSize(670,540);
		Dimension dimen = Toolkit.getDefaultToolkit().getScreenSize(); //ȭ�� ����� �־���		 
		Dimension dimen1 = getSize(); //������ ������ �Է�
		int xpos = (int)(dimen.getWidth())/2-(int)dimen1.getWidth()/2; //ȭ�������/2 - �����ӻ�����/2 (ȭ���߾�)		
		int ypos = (int)(dimen.getHeight())/2 -(int)dimen1.getHeight()/2;		
		this.setUndecorated(true);
		setLocation(xpos, ypos); //ȭ���߾ӿ� ��ġ
		setVisible(true);
		setResizable(false);
		focus();
	}
}