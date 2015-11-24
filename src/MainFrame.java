import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//UI�̃e�[�}��windows�ɂ���
					String winTheme = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
					UIManager.setLookAndFeel(winTheme);
					
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setResizable(false);
		setTitle("\u30E2\u30C7\u30EA\u30F3\u30B0\u6559\u80B2\u652F\u63F4\u30B7\u30B9\u30C6\u30E0\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//����͏����ʂ�\��
		showInitPanel();
	}
	
	/**
	 * �󂯎���������̃p�l���ɑJ�ڂ��郁�\�b�h
	 */
	public void panelChange(JPanel jp){
		
		System.out.println(jp+"�ɑJ�ڂ��܂���");
	}
	/**
	 * ������ʂ�\��
	 */
	public void showInitPanel(){
		//���݂̃p�l����\��
		getContentPane().removeAll();
		
		setTitle("�ۑ�I�����");
		getContentPane().add(new FirstPanel());
		setBounds(100, 100, 500, 370);
	}
	/**
	 * �ۑ�P��ʂ�\��
	 */
	public void showTask1Panel(){
		
		//���݂̃p�l����\��
		getContentPane().removeAll();
		getContentPane().setVisible(false);
		
		setTitle("�ۑ�P���");
		getContentPane().add(new TaskPanel1());
		setBounds(100, 100, 500, 370);
	}
	
}
