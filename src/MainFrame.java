import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame {

	public String[] PanelNames = { "fp", "tp1", "cp", "sp" };

	// 各Jpanel宣言、これらのインスタンス生成はこのクラスがインスタンス化された時に。
	FirstPanel fp = new FirstPanel(this, PanelNames[0]);
	TaskPanel1 tp1 = new TaskPanel1(this, PanelNames[1]);
	 ClassDiagramFeedbackPanel cp = new ClassDiagramFeedbackPanel(this,
	 PanelNames[2]);
	// StateMachineDiagramFeedbackPanel sp = new
	// StateMachineDiagramFeedbackPanel(this, PanelNames[3]);

	/**
	 * Create the frame.
	 */
	public MainFrame() {

		// 使用するパネルをすべてadd(登録)
		add(fp);
		fp.setVisible(true);
//		add(tp1);
//		tp1.setVisible(false);
//		this.add(cp);
//		cp.setVisible(false);
		// this.add(sp);
		// sp.setVisible(false);

		setTitle("\u30E2\u30C7\u30EA\u30F3\u30B0\u6559\u80B2\u652F\u63F4\u30B7\u30B9\u30C6\u30E0\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 500, 370);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		// // UIのテーマをwindowsにする
		// String winTheme =
		// "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
		// try {
		// UIManager.setLookAndFeel(winTheme);
		// } catch (ClassNotFoundException e) {
		// // TODO Auto-generated catch block
//		 e.printStackTrace();
//		 } catch (InstantiationException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (IllegalAccessException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (UnsupportedLookAndFeelException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		MainFrame frame = new MainFrame();
		frame.setVisible(true);
	}

	/**
	 * 受け取った引数のパネルに遷移するメソッド jpには現在表示しているパネルを strには変えたい先のパネルの名前(配列)を渡す
	 */
	public void panelChange(JPanel jp, String str) {
		System.out.println(jp.getName());
		String name = jp.getName();

		// いま表示しているパネルを非表示にする
		if (name.equals(PanelNames[0])) {
			fp = (FirstPanel) jp;
			fp.setVisible(false);
		}
		 else if (name.equals(PanelNames[1])) {
		 tp1 = (TaskPanel1) jp;
		 tp1.setVisible(false);
		 }
		 else if (name.equals(PanelNames[2])) {
		 cp = (ClassDiagramFeedbackPanel) jp;
		 cp.setVisible(false);
		 }
		// else if (name.equals(PanelNames[3])) {
		// sp = (StateMachineDiagramFeedbackPanel) jp;
		// sp.setVisible(false);
		// }

		// 受け取ったstrにパネルを変更
		if (str.equals(PanelNames[0]))

		{
			fp.setVisible(true);
		} else if (str.equals(PanelNames[1]))

		{
			tp1.setVisible(true);
		} else if (str.equals(PanelNames[2]))

		{
			cp.setVisible(true);
		} else if (str.equals(PanelNames[3]))

		{
			// sp.setVisible(true);
		}
	}
}
