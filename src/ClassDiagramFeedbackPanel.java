import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.BorderLayout;

public class ClassDiagramFeedbackPanel extends Panel {
	private JScrollPane scrollPane;
	private JTextArea txtrTT;

	/**
	 * Create the panel.
	 */
	public ClassDiagramFeedbackPanel(String s) {
		super(s);
		setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		add(scrollPane);
		
		txtrTT = new JTextArea();
		txtrTT.setFont(new Font("Meiryo UI", Font.PLAIN, 12));
		txtrTT.setText("\u3053\u3053\u306B\u30D5\u30A3\u30FC\u30C9\u30D0\u30C3\u30AF\u8A18\u8FF0\r\nt\r\nt\r\nt\r\nt\r\nt\r\nt\r\nt\r\nt\r\nt\r\nt\r\nt\r\nt\r\nt\r\nt\r\nt\r\nt\r\nt\r\nt\r\nt");
		scrollPane.setViewportView(txtrTT);

	}
	@Override 
	public String toString(){
		return "ClassDiagramFeedbackPanel";
	}
}
