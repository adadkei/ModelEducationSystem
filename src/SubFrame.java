import javax.swing.JFrame;
import javax.swing.JPanel;

public class SubFrame extends JFrame {

    /**
     * Create the frame.
     * 
     * @name フレームの名前
     */

    public SubFrame(String name) {
        super(name);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 370);
    }

    /**
     * フレームとこれに対応するパネルを生成するメソッド <br>
     * 尚、このメソッドを実行時はフレームとパネル不可視状態
     * 
     * @param jf
     *            追加するフレームを指定
     * @param jp
     *            追加するパネルを指定
     */

    public static void addFrameAndPanel(JFrame jf, JPanel jp) {
        jf.setVisible(false);
        jf.add(jp);
        jp.setVisible(false);
    }

    /**
     * フレームとパネルの可視状態を変更
     * 
     * @param jf
     *            可視状態を変更するフレームを指定
     * @param jp
     *            可視状態を変更するパネルを指定
     * @param bl
     *            可視状態　true false 指定
     */

    public static void changeVisible(JFrame jf, JPanel jp, boolean bl) {
        jf.setVisible(bl);
        jp.setVisible(bl);
    }

}
