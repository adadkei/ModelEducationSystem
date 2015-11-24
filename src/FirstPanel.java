import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JButton;

import java.awt.Component;
import java.awt.Font;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;

public class FirstPanel extends JPanel {
	private JButton task1button;
	private JButton task2button;

	/**
	 * Create the panel.
	 */
	public FirstPanel() {
		setLayout(null);
		
		task1button = new JButton("\u8AB2\u984C\uFF11");
		task1button.setFont(new Font("Meiryo UI", Font.PLAIN, 15));
		task1button.setBounds(65, 117, 121, 69);
		add(task1button);
		//�C�x���g�o�^
		task1button.addActionListener(new addTask1ButtonListener());
		
		task2button = new JButton("\u8AB2\u984C\uFF12");
		task2button.setFont(new Font("Meiryo UI", Font.PLAIN, 15));
		task2button.setBounds(252, 117, 121, 69);
		add(task2button);

	}
	
	/**
	 * �ۑ�P�J�ڃ{�^���̃C�x���g
	 */
	public class addTask1ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			//MainFrame���擾
			MainFrame mf = (MainFrame)SwingUtilities.getWindowAncestor((Component)e.getSource());
			
			//Taskpanel1��ʂ�\��
			mf.showTask1Panel();	
		}
	}

	@Override 
	public String toString(){
		return "FirstPanel";
	}
}
