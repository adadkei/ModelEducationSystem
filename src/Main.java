import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import javax.swing.JLabel;

public class Main extends JFrame{

	private JFrame frame;
	private JPanel panel;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		/*
		 * �ȉ��N���X�͖{�N���X�����̉����ꂽ�u�Ԃɏ����������
		 */
//		FirstPanel fp = new FirstPanel();
//		TaskPanel1 tp1 = new TaskPanel1();
//		ClassDiagramFeedbackPanel cp = new ClassDiagramFeedbackPanel();
//		StatemachineDiagramFeedbackPanel sp = new StatemachineDiagramFeedbackPanel();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);//�����Ńt���[����\�����Ă���
//					fp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setFont(new Font("Meiryo UI", Font.PLAIN, 12));
		frame.setTitle("\u30E2\u30C7\u30EA\u30F3\u30B0\u6559\u80B2\u652F\u63F4\u30B7\u30B9\u30C6\u30E0");
		frame.setBounds(100, 100, 505, 355);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.add(tp1);tp1.setVisible(false);
//		this.add(cp);cp.setVisible(false);
//		this.add(sp);sp.setVisible(false);
	}
	/**
	 * �󂯎���������̃p�l���ɑJ�ڂ��郁�\�b�h
	 */
	public void panelChange(JPanel jp){
		
		System.out.println(jp+"�ɑJ�ڂ��܂���");
	}

	
}
