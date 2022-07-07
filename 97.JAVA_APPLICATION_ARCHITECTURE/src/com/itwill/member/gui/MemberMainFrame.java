package com.itwill.member.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.itwill.member.dto.Member;
import com.itwill.member.service.MemberService;

import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.Dimension;
import javax.swing.ImageIcon;

public class MemberMainFrame extends JFrame {
	/**********1.MemberService객체선언*******/
	private MemberService memberService;
	/*
	private ProductService productService;
	....
	*/
	/*********************************/
	
	/**********로그인한회원**********/
	private Member loginMember=null;
	/*********************************/
	
	private JPanel contentPane;
	private JTabbedPane memberTabbedPane;
	private JTextField idTF;
	private JPasswordField passwordTF;
	private JTextField nameTF;
	private JTextField addressTF;
	private JLabel messageLB;
	private JComboBox ageCB;
	private JCheckBox marriedCHK;
	private JTextField loginIdTF;
	private JPasswordField loginPasswordTF;
	private JLabel loginMessageLB;
	private JTable memberListTable;
	private JTextField m_idTF;
	private JTextField m_passwordTF;
	private JTextField m_nameTF;
	private JTextField m_addressTF;
	private JTextField m_regdateTF;
	private JComboBox m_ageCB;
	private JCheckBox m_marriedCHK;
	private JButton memberUpdateBtn;
	private JButton memberDeleteBtn;
	private JMenuItem loginMenuItem;
	private JMenuItem joinMenuItem;
	private JMenuItem logoutMenuItem;
	private JPanel productListPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberMainFrame frame = new MemberMainFrame();
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
	public MemberMainFrame() {
		setTitle("회원관리");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 423, 627);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu memberMenu = new JMenu("회원");
		menuBar.add(memberMenu);
		
		loginMenuItem = new JMenuItem("로그인");
		loginMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				memberTabbedPane.setSelectedIndex(1);
			}
		});
		memberMenu.add(loginMenuItem);
		
		joinMenuItem = new JMenuItem("가입");
		joinMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				memberTabbedPane.setSelectedIndex(0);
			}
		});
		memberMenu.add(joinMenuItem);
		
		logoutMenuItem = new JMenuItem("로그아웃");
		logoutMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logoutProcess();
			}
		});
		memberMenu.add(logoutMenuItem);
		
		JSeparator separator = new JSeparator();
		memberMenu.add(separator);
		
		JMenuItem exitMenuItem = new JMenuItem("종료");
		exitMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		memberMenu.add(exitMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		memberTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(memberTabbedPane, BorderLayout.CENTER);
		
		JPanel joinPanel = new JPanel();
		memberTabbedPane.addTab("회원가입", null, joinPanel, null);
		joinPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(33, 44, 57, 15);
		joinPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("패쓰워드");
		lblNewLabel_1.setBounds(33, 101, 57, 15);
		joinPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("이름");
		lblNewLabel_2.setBounds(33, 163, 57, 15);
		joinPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("주소");
		lblNewLabel_3.setBounds(33, 224, 57, 15);
		joinPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("나이");
		lblNewLabel_4.setBounds(33, 278, 57, 15);
		joinPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("결혼");
		lblNewLabel_5.setBounds(33, 331, 57, 15);
		joinPanel.add(lblNewLabel_5);
		
		idTF = new JTextField();
		idTF.setBounds(126, 41, 116, 21);
		joinPanel.add(idTF);
		idTF.setColumns(10);
		
		passwordTF = new JPasswordField();
		passwordTF.setBounds(126, 98, 116, 21);
		joinPanel.add(passwordTF);
		
		nameTF = new JTextField();
		nameTF.setBounds(126, 160, 116, 21);
		joinPanel.add(nameTF);
		nameTF.setColumns(10);
		
		addressTF = new JTextField();
		addressTF.setBounds(126, 221, 116, 21);
		joinPanel.add(addressTF);
		addressTF.setColumns(10);
		
		ageCB = new JComboBox();
		ageCB.setModel(new DefaultComboBoxModel(new String[] {"20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45"}));
		ageCB.setBounds(125, 274, 117, 23);
		joinPanel.add(ageCB);
		
		marriedCHK = new JCheckBox("");
		marriedCHK.setBounds(126, 327, 115, 23);
		joinPanel.add(marriedCHK);
		
		JButton joinBtn = new JButton("가입");
		joinBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/********회원가입*************/
				try {
					//TextField로부터데이타얻기
					String id=idTF.getText();
					String password=passwordTF.getText();
					String name=nameTF.getText();
					String address=addressTF.getText();
					
					if(id.equals("")|| password.equals("")||name.equals("")|| address.equals("")) {
						messageLB.setText("* 내용을 입력하세요");
						return;
					}
					String ageStr=(String)ageCB.getSelectedItem();
					int age=Integer.parseInt(ageStr);
					String marriedStr="";
					if(marriedCHK.isSelected()) {
						marriedStr="T";
					}else {
						marriedStr="F";
					}
					Member newMember=new Member(id, password, name, address, age, marriedStr, null);
					System.out.println("1.MemberMainFrame ");
					boolean isSuccess=
							memberService.addMember(newMember);
					if(isSuccess) {
						//성공(로그인패널을 보여준다.)
						memberTabbedPane.setSelectedIndex(1);
					}else {
						//실패(다이알로그를 뛰운다.)
						JOptionPane.showMessageDialog(null, "아이디가 중복되었습니다.");
						idTF.requestFocus();
						idTF.setSelectionStart(0);
						idTF.setSelectionEnd(id.length());
						
						
					}
					
					
				} catch (Exception e1) {
						
				}
				/******************************/
			}
		});
		joinBtn.setBounds(33, 404, 97, 23);
		joinPanel.add(joinBtn);
		
		JButton cancleBtn = new JButton("취소");
		cancleBtn.setBounds(160, 404, 97, 23);
		joinPanel.add(cancleBtn);
		
		messageLB = new JLabel("");
		messageLB.setForeground(Color.RED);
		messageLB.setBounds(126, 72, 175, 15);
		joinPanel.add(messageLB);
		
		JLabel lblNewLabel_6 = new JLabel("*");
		lblNewLabel_6.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setBounds(255, 44, 15, 15);
		joinPanel.add(lblNewLabel_6);
		
		JPanel loginPanel = new JPanel();
		memberTabbedPane.addTab("로그인", null, loginPanel, null);
		loginPanel.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("아이디");
		lblNewLabel_7.setBounds(18, 85, 57, 15);
		loginPanel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("패쓰워드");
		lblNewLabel_8.setBounds(18, 150, 57, 15);
		loginPanel.add(lblNewLabel_8);
		
		loginIdTF = new JTextField();
		loginIdTF.setBounds(138, 82, 116, 21);
		loginPanel.add(loginIdTF);
		loginIdTF.setColumns(10);
		
		loginPasswordTF = new JPasswordField();
		loginPasswordTF.setBounds(138, 147, 116, 21);
		loginPanel.add(loginPasswordTF);
		
		JButton loginBtn = new JButton("로그인");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*************회원로그인**************/
				try {
					String id=loginIdTF.getText();
					String password=loginPasswordTF.getText();
					
					int result=
							memberService.login(id, password);
					if(result==0) {
						loginProcess(id);
					}else if(result==1) {
						//실패 아이디존재안함
						loginMessageLB.setText("아이디존재안함");
						loginIdTF.requestFocus();
						
					}else if(result==2) {
						loginMessageLB.setText("패쓰워드 불일치");
						//실패 패쓰워드불일치
						loginPasswordTF.requestFocus();
					}
					
				}catch (Exception e1) {
					// TODO: handle exception
				}	
				/***********************************/
			}
		});
		loginBtn.setBounds(18, 233, 97, 23);
		loginPanel.add(loginBtn);
		
		JButton cancleBtn2 = new JButton("취소");
		cancleBtn2.setBounds(169, 233, 97, 23);
		loginPanel.add(cancleBtn2);
		
		loginMessageLB = new JLabel("");
		loginMessageLB.setBounds(18, 196, 252, 15);
		loginPanel.add(loginMessageLB);
		
		JPanel listPanel = new JPanel();
		listPanel.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				/*********테이블보여질때호출***********/
				try {
					
					memberListDisplay();
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		memberTabbedPane.addTab("회원리스트", null, listPanel, null);
		listPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 23, 370, 194);
		listPanel.add(scrollPane);
		
		memberListTable = new JTable();
		
		memberListTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/***********************************************************/
				try {
					/*
					 * 1. 테이블클릭시 선택된 멤버데이타를 TextField에보여준다
					 * 2. 수정과 삭제버튼활성화
					 */
					int selectedRow = memberListTable.getSelectedRow();
					String selectMemberId=(String)memberListTable.getValueAt(selectedRow, 0);
					Member findMember=memberService.findById(selectMemberId);
					m_idTF.setText(findMember.getM_id());
					m_nameTF.setText(findMember.getM_name());
					m_passwordTF.setText(findMember.getM_password());
					m_addressTF.setText(findMember.getM_address());
					String ageStr = findMember.getM_age()+"";
					m_ageCB.setSelectedItem(ageStr);
					String selectMarried = findMember.getM_married();
					if(selectMarried.equals("T")) {
						m_marriedCHK.setSelected(true);
					}else {
						m_marriedCHK.setSelected(false);
						
					}
					m_regdateTF.setText(findMember.getM_regdate().toLocaleString().substring(0,10));
					memberUpdateBtn.setEnabled(true);
					memberDeleteBtn.setEnabled(true);
					
				}catch (Exception e1) {
					e1.printStackTrace();
				}
				/***********************************************************/
			}
		});
		memberListTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"\uC544\uC774\uB514", "\uD328\uC4F0\uC6CC\uB4DC", "\uC774\uB984", "\uC8FC\uC18C", "\uB098\uC774", "\uACB0\uD63C", "\uAC00\uC785\uC77C"
			}
		));
		scrollPane.setViewportView(memberListTable);
		
		JButton memberListBtn = new JButton("회원리스트");
		memberListBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/***************회원리스트보여주기메쏘드호출시작********************/
				try {
					memberListDisplay();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				/***************회원리스트보여주기메쏘드호출 끝********************/
			}
		});
		memberListBtn.setBounds(132, 230, 129, 23);
		listPanel.add(memberListBtn);
		
		JLabel lblNewLabel_9 = new JLabel("아이디");
		lblNewLabel_9.setBounds(40, 278, 57, 15);
		listPanel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("패쓰워드");
		lblNewLabel_10.setBounds(40, 303, 57, 15);
		listPanel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("이름");
		lblNewLabel_11.setBounds(40, 328, 57, 15);
		listPanel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("주소");
		lblNewLabel_12.setBounds(40, 361, 57, 15);
		listPanel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("나이");
		lblNewLabel_13.setBounds(40, 396, 57, 15);
		listPanel.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("결혼");
		lblNewLabel_14.setBounds(40, 428, 57, 15);
		listPanel.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("가입일");
		lblNewLabel_15.setBounds(42, 461, 57, 15);
		listPanel.add(lblNewLabel_15);
		
		m_idTF = new JTextField();
		m_idTF.setEditable(false);
		m_idTF.setBounds(155, 275, 116, 21);
		listPanel.add(m_idTF);
		m_idTF.setColumns(10);
		
		m_passwordTF = new JTextField();
		m_passwordTF.setEditable(false);
		m_passwordTF.setBounds(155, 300, 116, 21);
		listPanel.add(m_passwordTF);
		m_passwordTF.setColumns(10);
		
		m_nameTF = new JTextField();
		m_nameTF.setEditable(false);
		m_nameTF.setBounds(155, 325, 116, 21);
		listPanel.add(m_nameTF);
		m_nameTF.setColumns(10);
		
		m_addressTF = new JTextField();
		m_addressTF.setEditable(false);
		m_addressTF.setBounds(156, 356, 116, 21);
		listPanel.add(m_addressTF);
		m_addressTF.setColumns(10);
		
		m_ageCB = new JComboBox();
		m_ageCB.setModel(new DefaultComboBoxModel(new String[] {"20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45"}));
		m_ageCB.setBounds(155, 387, 46, 23);
		listPanel.add(m_ageCB);
		
		m_marriedCHK = new JCheckBox("");
		m_marriedCHK.setEnabled(false);
		m_marriedCHK.setBounds(156, 424, 115, 23);
		listPanel.add(m_marriedCHK);
		
		m_regdateTF = new JTextField();
		m_regdateTF.setEditable(false);
		m_regdateTF.setBounds(162, 453, 116, 21);
		listPanel.add(m_regdateTF);
		m_regdateTF.setColumns(10);
		
		memberUpdateBtn = new JButton("수정");
		memberUpdateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		memberUpdateBtn.setEnabled(false);
		memberUpdateBtn.setBounds(62, 504, 97, 23);
		listPanel.add(memberUpdateBtn);
		
		memberDeleteBtn = new JButton("삭제");
		memberDeleteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**************회원삭제************/
				try {
					String m_id = m_idTF.getText();
					memberService.deleteById(m_id);
					memberListDisplay();
					//회원상세보기내용초기화
					
					m_idTF.setText("");
					m_passwordTF.setText("");
					m_nameTF.setText("");
					m_addressTF.setText("");
					m_ageCB.setSelectedIndex(-1);
					m_marriedCHK.setSelected(false);
					memberDeleteBtn.setEnabled(false);
					memberUpdateBtn.setEnabled(false);
					
					
				}catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());
				}
				/***********************************/
			}
		});
		memberDeleteBtn.setEnabled(false);
		memberDeleteBtn.setBounds(185, 503, 97, 23);
		listPanel.add(memberDeleteBtn);
		
		JPanel productListBasicPanel = new JPanel();
		memberTabbedPane.addTab("상품리스트", null, productListBasicPanel, null);
		productListBasicPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		productListBasicPanel.add(scrollPane_1, BorderLayout.CENTER);
		
		productListPanel = new JPanel();
		productListPanel.setPreferredSize(new Dimension(10, 800));
		productListPanel.setBackground(Color.PINK);
		scrollPane_1.setViewportView(productListPanel);
		/*******************************************/
		JPanel productItemPanel = new JPanel();
		productItemPanel.setPreferredSize(new Dimension(350, 130));
		productListPanel.add(productItemPanel);
		productItemPanel.setLayout(null);
		
		JLabel lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setIcon(new ImageIcon(MemberMainFrame.class.getResource("/javax/swing/plaf/metal/icons/Error.gif")));
		lblNewLabel_16.setBounds(12, 10, 92, 82);
		productItemPanel.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("좋은상품");
		lblNewLabel_17.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_17.setBounds(102, 10, 92, 15);
		productItemPanel.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("<html>New labeNew <br>labelNew labelNew labelNew labelNew labelNew labelNew labelNew label</html> ");
		lblNewLabel_18.setBounds(75, 35, 263, 57);
		productItemPanel.add(lblNewLabel_18);
		/*****************************************************/
		/********2.MemberService객체생성**********/
		memberService=new MemberService();
		//productService=new ProductService();
		
		/******처음프레임생성될때UI초기화****************/
		logoutProcess();
		productListDisplay();
		
	}//생성자끝
	/**************************************************************/
	public void productListDisplay() {
		productListPanel.removeAll();
		for(int i=0;i<7;i++) {
			JPanel productItemPanel = new JPanel();
			productItemPanel.setPreferredSize(new Dimension(350, 130));
			productListPanel.add(productItemPanel);
			productItemPanel.setLayout(null);
			
			JLabel lblNewLabel_16 = new JLabel("");
			lblNewLabel_16.setIcon(new ImageIcon(MemberMainFrame.class.getResource("/javax/swing/plaf/metal/icons/Error.gif")));
			lblNewLabel_16.setBounds(12, 10, 92, 82);
			productItemPanel.add(lblNewLabel_16);
			
			JLabel lblNewLabel_17 = new JLabel("좋은상품"+i);
			lblNewLabel_17.setFont(new Font("굴림", Font.BOLD, 15));
			lblNewLabel_17.setBounds(102, 10, 92, 15);
			productItemPanel.add(lblNewLabel_17);
			
			JLabel lblNewLabel_18 = new JLabel("<html>New labeNew <br>labelNew labelNew labelNew labelNew labelNew labelNew labelNew label"+i+"</html> ");
			lblNewLabel_18.setBounds(75, 35, 263, 57);
			productItemPanel.add(lblNewLabel_18);
			
			
		}
		
	}
	
	
	/*******************회원리스트보여주기메쏘드정의**************/
	public void memberListDisplay() throws Exception{
		List<Member> memberList = memberService.findAll();
		Vector memberListVector=new Vector();
		
		 for (Member member : memberList) {
			Vector rowVector=new Vector();
			rowVector.add(member.getM_id());
			rowVector.add(member.getM_password());
			rowVector.add(member.getM_name());
			rowVector.add(member.getM_address());
			rowVector.add(member.getM_age());
			rowVector.add(member.getM_married());
			rowVector.add(member.getM_regdate());
			
			
			memberListVector.add(rowVector);
		 }
		
		
		Vector columnVector=new Vector();
		columnVector.add("아이디");
		columnVector.add("패쓰워드");
		columnVector.add("이름");
		columnVector.add("주소");
		columnVector.add("나이");
		columnVector.add("결혼");
		columnVector.add("가입일");
		
		
		DefaultTableModel defaultTableModel=
				new DefaultTableModel(memberListVector, columnVector);
		memberListTable.setModel(defaultTableModel);
		
	}
	
	/*******************로그인성공시호출할메쏘드******************/
	public void loginProcess(String id)throws Exception {
		/*
		 * 1.로그인멤버객체 저장
		 * 2.MemberMainFrame타이틀변경
		 * 3.로그인,회원가입 tab 불활성화
		 * 4.로그아웃메뉴아이템 활성화
		 * 5.회원리스트탭 활성화
		 */
		Member loginSuccessMember=memberService.findById(id);
		loginMember = loginSuccessMember;
		setTitle(loginMember.getM_name());
	
		
		loginMenuItem.setEnabled(false);
		joinMenuItem.setEnabled(false);
		logoutMenuItem.setEnabled(true);
		
		
		memberTabbedPane.setEnabledAt(0, false);
		memberTabbedPane.setEnabledAt(1, false);
		memberTabbedPane.setEnabledAt(2, true);
		memberTabbedPane.setSelectedIndex(2);
	}
	/*******************로그아웃시호출할메쏘드******************/
	public void logoutProcess() {
		/*
		 * 1.로그인멤버객체 삭제
		 * 2.MemberMainFrame타이틀변경
		 * 3.로그인,회원가입 tab 활성화
		 * 4.로그아웃메뉴아이템 불활성화
		 * 5.회원리스트탭 불활성화
		 */
		this.loginMember=null;
		setTitle("");
		
		loginMenuItem.setEnabled(true);
		joinMenuItem.setEnabled(true);
		logoutMenuItem.setEnabled(false);
		
		memberTabbedPane.setEnabledAt(0, true);
		memberTabbedPane.setEnabledAt(1, true);
		memberTabbedPane.setEnabledAt(2, false);
		memberTabbedPane.setSelectedIndex(1);
		
	}
}//클래스끝
