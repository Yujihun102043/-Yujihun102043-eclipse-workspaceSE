package layout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JButton;

public class ChattingJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChattingJFrame frame = new ChattingJFrame();
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
	public ChattingJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("랜덤채팅");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setBackground(Color.YELLOW);
		lblNewLabel.setFont(new Font("D2Coding", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("지훈 : 안녕 이따만나\r\n철수 : 나 일있어.");
		textArea.setEditable(false);
		contentPane.add(textArea, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		contentPane.add(panel, BorderLayout.SOUTH);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(23);
		
		JButton btnNewButton = new JButton("전송");
		panel.add(btnNewButton);
	}

}
