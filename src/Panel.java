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
     *            �p�l���̖��O�w��
     */
    public Panel(String s) {
        panelName = s;
        this.setName(panelName);
        this.setLayout(null);
    }

    /**
     * @param m
     *            ���݂�frame�̃C���X�^���X
     * @param s
     *            panel�̖��O
     */
    public Panel(MainFrame m, String s) {
        this(s);
        currentMf = m;
    }

    /**
     * ���̃t���[���ƃp�l�����擾
     */
    public void getNextFramePanel(MainFrame m, Panel p) {
        nextMf = m;
        nextPanel = p;
    }

    /**
     * ���̃t���[���ƃp�l���ɕς��郁�\�b�h
     */
    public void changeFramePanel(MainFrame m, Panel p) {
        m.setVisible(true);
        p.setVisible(true);
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
