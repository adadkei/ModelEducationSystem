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
					//UIのテーマをwindowsにする
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
		
		//初回は所定画面を表示
		showInitPanel();
	}
	
	/**
	 * 受け取った引数のパネルに遷移するメソッド
	 */
	public void panelChange(JPanel jp){
		
		System.out.println(jp+"に遷移しました");
	}
	/**
	 * 初期画面を表示
	 */
	public void showInitPanel(){
		//現在のパネル非表示
		getContentPane().removeAll();
		
		setTitle("課題選択画面");
		getContentPane().add(new FirstPanel());
		setBounds(100, 100, 500, 370);
	}
	/**
	 * 課題１画面を表示
	 */
	public void showTask1Panel(){
		
		//現在のパネル非表示
		getContentPane().removeAll();
		getContentPane().setVisible(false);
		
		setTitle("課題１画面");
		getContentPane().add(new TaskPanel1());
		setBounds(100, 100, 500, 370);
	}
	
}
