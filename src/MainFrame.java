import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

	FirstPanel fp = new FirstPanel("�ۑ�I�����");
	TaskPanel1 tp1 = new TaskPanel1("�ۑ���");
	ClassDiagramFeedbackPanel cd = new ClassDiagramFeedbackPanel("�N���X�}�p�l��");
	StatemachineDiagramFeedbackPanel sp = new StatemachineDiagramFeedbackPanel("��ԑJ�ڐ}�p�l��");
	
	/**
	 * Create the frame.
	 * 
	 * @name �t���[���̖��O
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

		MainFrame frame = new MainFrame("UML���f�����O����x���V�X�e��");
		frame.setVisible(true);
	}

}
