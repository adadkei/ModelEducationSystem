import javax.swing.JPanel;

public class Panel extends JPanel {
    MainFrame currentMf;
    MainFrame nextMf;
    MainFrame nextMf2;
    Panel currentPanel;
    Panel nextPanel;
    Panel nextPanel2;

    String panelName;
    boolean isVisible = false;

    /**
     * 
     * @param s
     *            パネルの名前指定
     */
    public Panel(String s) {
        panelName = s;
        this.setName(panelName);
        this.setLayout(null);
    }

    /**
     * @param m
     *            現在のframeのインスタンス
     * @param s
     *            panelの名前
     */
    public Panel(MainFrame m, String s) {
        this(s);
        currentMf = m;
    }

    /**
     * 次のフレームとパネルを取得
     */
    public void getNextFramePanel(MainFrame m, Panel p) {
        nextMf = m;
        nextPanel = p;
    }

    /**
     * 次のフレームとパネルに変えるメソッド
     */
    public void changeFramePanel(MainFrame m, Panel p) {
        m.setVisible(true);
        p.setVisible(true);
    }

    //
    // /**
    // * @param m
    // * frameのインスタンス
    // * @param s
    // * panelの名前
    // * @param p
    // * panel　のインスタンス
    // */
    // public Panel(MainFrame m, Panel p, String s) {
    // this(m, s);
    // this.p = p;
    // }
}
