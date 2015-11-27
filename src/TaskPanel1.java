import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import java.awt.Color;

public class TaskPanel1 extends JPanel {
	private JLabel label;
	private final JScrollPane scrollPane = new JScrollPane();
	private JTextArea txtrAaaaaaaaaaaaaAaaaaaAa;
	private JButton classButton;
	private JButton stateButton;
	MainFrame mf;
	String str;

	/**
	 * Create the panel.
	 */
	public TaskPanel1(MainFrame m,String s) {
		
		mf = m;
		str = s;
		this.setName("fp");
		this.setLayout(null);
		
		label = new JLabel("\u554F\uFF11.~~~~~");
		label.setBounds(12, 10, 387, 22);
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setFont(new Font("Meiryo UI", Font.PLAIN, 15));
		add(label);
		scrollPane.setBounds(22, 52, 387, 207);
		add(scrollPane);
		
		txtrAaaaaaaaaaaaaAaaaaaAa = new JTextArea();
		txtrAaaaaaaaaaaaaAaaaaaAa.setText("\u3053\u3053\u306B\u554F\u984C\u6587\u3092\u8A18\u8FF0\u3057\u3088\u3046\u304B\u3068\u601D\u3063\u3066\u3044\u307E\u3059\u3002\r\nhoge\r\nhoge\r\nhoge\r\nhoge\r\nhoge\r\nhoge\r\nhoge\r\nhoeg\r\nhoge\r\nhoee");
		txtrAaaaaaaaaaaaaAaaaaaAa.setFont(new Font("Meiryo UI", Font.PLAIN, 12));
		scrollPane.setViewportView(txtrAaaaaaaaaaaaaAaaaaaAa);
		
		classButton = new JButton("\u30AF\u30E9\u30B9\u56F3\u30D5\u30A3\u30FC\u30C9\u30D0\u30C3\u30AF");
		classButton.setBackground(Color.WHITE);
		classButton.setFont(new Font("Meiryo UI", Font.PLAIN, 13));
		classButton.setBounds(47, 269, 148, 21);
		classButton.addActionListener(new ActionListener() {//課題１ボタンを押すと、そのパネルに遷移するイベント	
			public void actionPerformed(ActionEvent e) {
				pc(mf.PanelNames[2]);
			}
		});
		this.add(classButton);
		
		stateButton = new JButton("\u72B6\u614B\u9077\u79FB\u56F3\u30D5\u30A3\u30FC\u30C9\u30D0\u30C3\u30AF");
		stateButton.setBackground(Color.WHITE);
		stateButton.setFont(new Font("Meiryo UI", Font.PLAIN, 13));
		stateButton.setBounds(228, 269, 171, 21);
		stateButton.addActionListener(new ActionListener() {//課題１ボタンを押すと、そのパネルに遷移するイベント	
			public void actionPerformed(ActionEvent e) {
				pc(mf.PanelNames[3]);
			}
		});
		add(stateButton);

	}
	public void pc(String str){
		mf.panelChange((JPanel)this, str);
	}
	@Override 
	public String toString(){
		return "TaskPanel1";
	}
}
