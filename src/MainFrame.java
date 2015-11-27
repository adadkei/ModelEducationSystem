import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

	FirstPanel fp = new FirstPanel("課題選択画面");
	TaskPanel1 tp1 = new TaskPanel1("課題画面");
	ClassDiagramFeedbackPanel cd = new ClassDiagramFeedbackPanel("クラス図パネル");
	StatemachineDiagramFeedbackPanel sp = new StatemachineDiagramFeedbackPanel("状態遷移図パネル");
	
	/**
	 * Create the frame.
	 * 
	 * @name フレームの名前
	 */
	public MainFrame(String name) {
		super(name);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 370);
		
		this.add(fp);
		fp.setVisible(true);

	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		MainFrame frame = new MainFrame("UMLモデリング教育支援システム");
		frame.setVisible(true);
	}

}
