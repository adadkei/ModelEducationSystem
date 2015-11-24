import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import java.awt.Font;

public class StatemachineDiagramFeedbackPanel extends JPanel {
	private JScrollPane scrollPane;
	private JTextArea txtrTT;

	/**
	 * Create the panel.
	 */
	public StatemachineDiagramFeedbackPanel() {
		setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		txtrTT = new JTextArea();
		txtrTT.setText("\u72B6\u614B\u9077\u79FB\u56F3\u30D5\u30A3\u30FC\u30C9\u30D0\u30C3\u30AF\u3053\u3053\u306B\u8A18\u8FF0\r\nt\r\nt\r\nt\r\nt\r\nt\r\nt\r\nt\r\nt\r\nt\r\nt\r\nt\r\nt\r\n\r\nt\r\nt\r\nt\r\nt\r\n");
		txtrTT.setFont(new Font("Meiryo UI", Font.PLAIN, 12));
		scrollPane.setViewportView(txtrTT);

	}

	@Override 
	public String toString(){
		return "StatemachineDiagramFeedbackPanel";
	}
}
