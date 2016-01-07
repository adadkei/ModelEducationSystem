import javax.swing.JFrame;
import javax.swing.JPanel;

public class SubFrame extends JFrame {

    /**
     * Create the frame.
     * 
     * @name �t���[���̖��O
     */

    public SubFrame(String name) {
        super(name);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 370);
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
