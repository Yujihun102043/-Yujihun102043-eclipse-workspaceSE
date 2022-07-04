package layout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JPanelJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JPanelJFrame frame = new JPanelJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JPanelJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 493);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel northPanel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) northPanel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		northPanel.setBackground(Color.RED);
		contentPane.add(northPanel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\2022-05-JAVA-DEVELOPER\\eclipse-workspaceSE\\23.GUI[swing]\\src\\image\\big_dog20.png"));
		northPanel.add(lblNewLabel);
		
		textField = new JTextField();
		northPanel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("검색");
		btnNewButton.setIcon(new ImageIcon("C:\\2022-05-JAVA-DEVELOPER\\eclipse-workspaceSE\\23.GUI[swing]\\src\\image\\search_image20.png"));
		northPanel.add(btnNewButton);
		
		JPanel southPanel = new JPanel();
		southPanel.setBackground(Color.YELLOW);
		contentPane.add(southPanel, BorderLayout.SOUTH);
		southPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton_1 = new JButton("회원가입");
		southPanel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("로그인");
		southPanel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("회원리스트");
		southPanel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("회원삭제");
		southPanel.add(btnNewButton_4);
		
		JPanel centelPanel = new JPanel();
		centelPanel.setBackground(Color.GREEN);
		contentPane.add(centelPanel, BorderLayout.CENTER);
		centelPanel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("아이디");
		lblNewLabel_2.setBounds(94, 76, 57, 15);
		centelPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("패스워드");
		lblNewLabel_3.setBounds(94, 131, 57, 15);
		centelPanel.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(177, 73, 116, 21);
		centelPanel.add(textField_1);
		textField_1.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(177, 128, 116, 21);
		centelPanel.add(passwordField);
		
		JButton btnNewButton_5 = new JButton("로그인");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.setBounds(94, 191, 97, 23);
		centelPanel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("취소");
		btnNewButton_6.setBounds(203, 191, 97, 23);
		centelPanel.add(btnNewButton_6);
		
		JPanel westPanel = new JPanel();
		westPanel.setBackground(Color.ORANGE);
		contentPane.add(westPanel, BorderLayout.WEST);
		westPanel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("회원리스트");
		westPanel.add(lblNewLabel_1, BorderLayout.NORTH);
		
		JList list = new JList();
		list.setFont(new Font("D2Coding", Font.PLAIN, 18));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"김경호", "이소라", "이효리", "신명숙", "김은희", "김윤씨", "김봉화", "최경녀"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		westPanel.add(list, BorderLayout.CENTER);
		
		JPanel eastPanel = new JPanel();
		eastPanel.setBackground(Color.PINK);
		contentPane.add(eastPanel, BorderLayout.EAST);
	}
}
