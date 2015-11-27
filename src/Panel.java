import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel extends JPanel {
	MainFrame mf;
	String panelName;
	
	/**
	 * @param m
	 *            frameのインスタンス
	 * @param s
	 *            panelの名前
	 */
	public Panel(MainFrame m, String s) {
		mf = m;
		panelName = s;
		this.setName(panelName);
		this.setLayout(null);
	}

	public Panel(String s) {
		panelName = s;
		this.setName(panelName);
		this.setLayout(null);
	}

	/**
	 * フレームを生成し、それにパネルを追加するメソッド
	 * 
	 * @jp 追加するパネルを指定
	 */
	public void addFrameAndPanel(JFrame jf,JPanel jp) {
		jf.add(jp);
		jp.setVisible(true);
	}
}
