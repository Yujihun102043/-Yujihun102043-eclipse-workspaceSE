package layout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;

public class FlowLeyoutJFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlowLeyoutJFrame frame = new FlowLeyoutJFrame();
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
	public FlowLeyoutJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.MAGENTA);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton_3 = new JButton("first");
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("second");
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_2 = new JButton("third");
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("fouth");
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("fifth");
		contentPane.add(btnNewButton);
	}

}
