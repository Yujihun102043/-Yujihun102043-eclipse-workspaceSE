package basic;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/*
 * GUI프로그래밍 방법
 *   1.  컨테이너클래스준비(JFrame)상속
 *   2.  컨테이너클래스(JFrame)객체생성
 *   3.  컨테이너(JFrame)객체의 크기설정
 *   4.  컴포넌트생성(컨테이너(JFrame)의 멤버필드)
 *   5.  컨테이너(JFrame)에 컴포넌트 부치기(add) 
 *   6.  컨테이너객체 보여주기
 */
public class ChildJFrame extends JFrame {
	private JPanel contentPane; // 
	/*
	 * 컴포넌트를 멤버필드로 선언
	 */
	private JButton okBtn; // 버튼 생성
	private JButton cancleBtn; // 버튼 생성
	public ChildJFrame() {
		this.setTitle("나의 첫번째 프레임"); // 제목 
		this.contentPane = new JPanel(); // 
		this.setContentPane(contentPane);
		contentPane.setBackground(Color.black); //컨테이너에 색깔 입히기
		/*
		 * 컴포넌트객체생성
		 */
		okBtn = new JButton("확인");
		cancleBtn = new JButton("취소");
		/*
		 * 컨테이너에 컴포넌트를 붙인다.
		 */
		contentPane.setLayout(null); //
		okBtn.setBounds(40, 40, 80, 40);
		cancleBtn.setBounds(130, 40, 80, 40);
		contentPane.add(okBtn);
		contentPane.add(cancleBtn);
		
		/*
		 * JFrame의크기설정
		 */
		this.setSize(400, 500);
	}
	
	public static void main(String[] args) {
		/*
		 * JFrame객체생성
		 */
		ChildJFrame childJFrame = new ChildJFrame();
		/*
		 * JFrame객체 화면에보여주세요
		 */
		childJFrame.setVisible(true);

	}

}
