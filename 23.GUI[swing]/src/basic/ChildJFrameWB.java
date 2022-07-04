package basic;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChildJFrameWB extends JFrame {
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChildJFrameWB frame = new ChildJFrameWB();
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
	public ChildJFrameWB() {
		setTitle("나의첫번째WB프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.MAGENTA);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton okBtn = new JButton("확인");
		okBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("확인버튼을 눌렀네요!!!");
			}
		});
		okBtn.setBounds(28, 42, 97, 23);
		contentPane.add(okBtn);
		
		JButton cancleBtn = new JButton("취소");
		cancleBtn.setBounds(157, 42, 97, 23);
		contentPane.add(cancleBtn);
	}
}
