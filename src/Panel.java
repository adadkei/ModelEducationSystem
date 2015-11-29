import javax.swing.JPanel;

public class Panel extends JPanel {
    MainFrame mf;
    Panel p;
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
     *            frameのインスタンス
     * @param s
     *            panelの名前
     */
    public Panel(MainFrame m, String s) {
        this(s);
        mf = m;
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
