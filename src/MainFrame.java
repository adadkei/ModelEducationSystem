import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

    /**
     * Create the frame.
     * 
     * @name �t���[���̖��O
     */

    public MainFrame(String name) {
        super(name);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 370);
    }

    /**
     * Launch the application.
     */
    public static void main(String[] args) {

        // �e�t���[������
        MainFrame firstFrame = new MainFrame("UML���f�����O����x���V�X�e��");
        MainFrame taskFrame = new MainFrame("�ۑ���");
        MainFrame classFrame = new MainFrame("�N���X�}�t�B�[�h�o�b�N���");
        MainFrame stateFrame = new MainFrame("��ԑJ�ڐ}�t�B�[�h�o�b�N���");

        // �e�p�l������
        FirstPanel fp = new FirstPanel(firstFrame, "�ۑ�I�����");
        TaskPanel1 tp1 = new TaskPanel1(stateFrame, "�ۑ���");
        ClassDiagramFeedbackPanel cd = new ClassDiagramFeedbackPanel(stateFrame, "�N���X�}�p�l��");
        StatemachineDiagramFeedbackPanel sp = new StatemachineDiagramFeedbackPanel(stateFrame,
                "��ԑJ�ڐ}�p�l��");

        // �ŏ��̃t���[���ƃp�l���𐶐�
        firstFrame.setVisible(true);
        firstFrame.add(fp);
        fp.setVisible(true);

        // ���̊e�A�t���[���Ƃ���ɑΉ�����p�l����ǉ�
        addFrameAndPanel(taskFrame, tp1);
        addFrameAndPanel(classFrame, cd);
        addFrameAndPanel(stateFrame, sp);

    }

    /**
     * �t���[���Ƃ���ɑΉ�����p�l���𐶐����郁�\�b�h <br>
     * ���A���̃��\�b�h�����s���̓t���[���ƃp�l���s�����
     * 
     * @param jf
     *            �ǉ�����t���[�����w��
     * @param jp
     *            �ǉ�����p�l�����w��
     */

    public static void addFrameAndPanel(JFrame jf, JPanel jp) {
        jf.setVisible(false);
        jf.add(jp);
        jp.setVisible(false);
    }

    /**
     * �t���[���ƃp�l���̉���Ԃ�ύX
     * 
     * @param jf
     *            ����Ԃ�ύX����t���[�����w��
     * @param jp
     *            ����Ԃ�ύX����p�l�����w��
     * @param bl
     *            ����ԁ@true false �w��
     */

    public static void changeVisible(JFrame jf, JPanel jp, boolean bl) {
        jf.setVisible(bl);
        jp.setVisible(bl);
    }

}
