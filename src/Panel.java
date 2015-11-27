import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel extends JPanel {
	MainFrame mf;
	String panelName;
	
	/**
	 * @param m
	 *            frame�̃C���X�^���X
	 * @param s
	 *            panel�̖��O
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
	 * �t���[���𐶐����A����Ƀp�l����ǉ����郁�\�b�h
	 * 
	 * @jp �ǉ�����p�l�����w��
	 */
	public void addFrameAndPanel(JFrame jf,JPanel jp) {
		jf.add(jp);
		jp.setVisible(true);
	}
}
