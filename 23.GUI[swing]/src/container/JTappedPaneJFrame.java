package container;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.ComponentOrientation;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JList;

public class JTappedPaneJFrame extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTappedPaneJFrame frame = new JTappedPaneJFrame();
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
	public JTappedPaneJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 343, 444);
		contentPane = new JPanel();
		contentPane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setIcon(new ImageIcon("C:\\2022-05-JAVA-DEVELOPER\\eclipse-workspaceSE\\23.GUI[swing]\\src\\image\\cart20.png"));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setOpaque(false);
		btnNewButton.setIcon(new ImageIcon("C:\\2022-05-JAVA-DEVELOPER\\eclipse-workspaceSE\\23.GUI[swing]\\src\\image\\user.png"));
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setIcon(new ImageIcon("C:\\2022-05-JAVA-DEVELOPER\\eclipse-workspaceSE\\23.GUI[swing]\\src\\image\\shoppingmall.png"));
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setOpaque(false);
		btnNewButton_2.setIcon(new ImageIcon("C:\\2022-05-JAVA-DEVELOPER\\eclipse-workspaceSE\\23.GUI[swing]\\src\\image\\search_dog50.png"));
		panel.add(btnNewButton_2);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		tabbedPane.addTab("로그인", null, panel_3, null);
		panel_3.setLayout(null);
		
		JButton btnNewButton_3 = new JButton("로그인");
		btnNewButton_3.setBounds(55, 186, 97, 23);
		panel_3.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("취소");
		btnNewButton_4.setBounds(178, 186, 97, 23);
		panel_3.add(btnNewButton_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		tabbedPane.addTab("회원가입", null, panel_1, null);
		panel_1.setLayout(null);
		
		JButton btnNewButton_5 = new JButton("회원가입");
		btnNewButton_5.setBounds(51, 209, 97, 23);
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("취소");
		btnNewButton_6.setBounds(179, 209, 97, 23);
		panel_1.add(btnNewButton_6);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(Color.BLACK);
		panel_2.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("회원리스트", null, panel_2, null);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 64, 258, 172);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(table);
	}
}
