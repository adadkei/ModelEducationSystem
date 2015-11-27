import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JButton;

import java.awt.Component;
import java.awt.Font;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;

public class FirstPanel extends Panel {
	private JButton task1button;
	private JButton task2button;
	
	/**
	 * Create the panel.
	 */
	public FirstPanel(String s) {
		super(s);

		TaskPanel1 tp1 = new TaskPanel1("課題1画面");
		task1button = new JButton("\u8AB2\u984C\uFF11");
		task1button.setFont(new Font("Meiryo UI", Font.PLAIN, 15));
		task1button.setBounds(65, 117, 121, 69);
		task1button.addActionListener(new ActionListener() {// 課題１ボタンを押すと、そのパネルに遷移するイベント
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		this.add(task1button);

		task2button = new JButton("\u8AB2\u984C\uFF12");
		task2button.setFont(new Font("Meiryo UI", Font.PLAIN, 15));
		task2button.setBounds(252, 117, 121, 69);
		add(task2button);

	}

}
