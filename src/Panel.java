import javax.swing.JPanel;

public class Panel extends JPanel {
    MainFrame mf;
    Panel p;
    String panelName;
    boolean isVisible = false;

    /**
     * 
     * @param s
     *            �p�l���̖��O�w��
     */
    public Panel(String s) {
        panelName = s;
        this.setName(panelName);
        this.setLayout(null);
    }

    /**
     * @param m
     *            frame�̃C���X�^���X
     * @param s
     *            panel�̖��O
     */
    public Panel(MainFrame m, String s) {
        this(s);
        mf = m;
    }
    //
    // /**
    // * @param m
    // * frame�̃C���X�^���X
    // * @param s
    // * panel�̖��O
    // * @param p
    // * panel�@�̃C���X�^���X
    // */
    // public Panel(MainFrame m, Panel p, String s) {
    // this(m, s);
    // this.p = p;
    // }
}
