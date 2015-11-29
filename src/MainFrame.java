import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

    /**
     * Create the frame.
     * 
     * @name フレームの名前
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

        // 各フレーム生成
        MainFrame firstFrame = new MainFrame("UMLモデリング教育支援システム");
        MainFrame taskFrame = new MainFrame("課題画面");
        MainFrame classFrame = new MainFrame("クラス図フィードバック画面");
        MainFrame stateFrame = new MainFrame("状態遷移図フィードバック画面");

        // 各パネル生成
        FirstPanel fp = new FirstPanel(firstFrame, "課題選択画面");
        TaskPanel1 tp1 = new TaskPanel1(stateFrame, "課題画面");
        ClassDiagramFeedbackPanel cd = new ClassDiagramFeedbackPanel(stateFrame, "クラス図パネル");
        StatemachineDiagramFeedbackPanel sp = new StatemachineDiagramFeedbackPanel(stateFrame,
                "状態遷移図パネル");

        // 最初のフレームとパネルを生成
        firstFrame.setVisible(true);
        firstFrame.add(fp);
        fp.setVisible(true);

        // 他の各、フレームとそれに対応するパネルを追加
        addFrameAndPanel(taskFrame, tp1);
        addFrameAndPanel(classFrame, cd);
        addFrameAndPanel(stateFrame, sp);

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
