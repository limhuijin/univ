import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class mTok extends JFrame {
	Container contentPane = getContentPane();
	private JPanel myPanel = new JPanel();
	private JButton bt1 = new JButton("변환");
	private JLabel myLabel = new JLabel("거리(마일, 킬로)을 입력 : ");
	private JTextField inputText = new JTextField("");
	private JTextField outputText = new JTextField("");
	private MyActionListener lis = new MyActionListener();
	
	mTok(){
		setTitle("마일계산기");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		add(myPanel);
		myPanel.setLayout(null);
		myPanel.add(myLabel);
		myLabel.setSize(150, 20);
		myLabel.setLocation(30, 30);
		
		myPanel.add(inputText);
		inputText.setSize(180, 20);
		inputText.setLocation(180, 30);
		
		myPanel.add(bt1);
		bt1.setSize(80, 20);
		bt1.setLocation(100, 80);
		bt1.addActionListener(lis);

		myPanel.add(outputText);
		outputText.setSize(180, 20);
		outputText.setLocation(30, 120);
	}
	
	
	class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if (inputText.getText() != " ") {	
				String st = inputText.getText();
				int inputTe = Integer.parseInt(st);
				double reTe = inputTe*1.6;
				String renum = String.format("%.3f", reTe);
				outputText.setText(inputTe + " 마일은 " + renum + "킬로 입니다.");
			}
		}
	}
}


public class Ex_20231017 {
	public static void main(String[] args) {
		mTok ob = new mTok();

	}
}