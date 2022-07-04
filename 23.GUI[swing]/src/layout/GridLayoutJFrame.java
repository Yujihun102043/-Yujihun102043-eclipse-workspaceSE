package layout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;

public class GridLayoutJFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GridLayoutJFrame frame = new GridLayoutJFrame();
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
	public GridLayoutJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 310, 345);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("0");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 16));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setForeground(Color.BLACK);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 4, 5, 5));
		
		JButton btnNewButton_2 = new JButton("1");
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_5 = new JButton("2");
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_13 = new JButton("3");
		panel.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("+");
		panel.add(btnNewButton_14);
		
		JButton btnNewButton_9 = new JButton("4");
		panel.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("5");
		panel.add(btnNewButton_10);
		
		JButton btnNewButton_7 = new JButton("6");
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_1 = new JButton("-");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("7");
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("8");
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_6 = new JButton("9");
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_8 = new JButton("*");
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_11 = new JButton("0");
		panel.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("c");
		panel.add(btnNewButton_12);
		
		JButton btnNewButton_15 = new JButton(".");
		panel.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("/");
		panel.add(btnNewButton_16);
		
		JButton btnNewButton = new JButton("=");
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
	}

}
