import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class AclisTest extends JFrame {
	String[] names = { "%", "CE", "C", "<", "1/x", "x^2", "sqrt", "/", "7", "8", "9", "x", "4", "5", "6", "-", "1", "2",
			"3", "+", "+/-", "0", ".", "=", };

	private JPanel pannelNorth = new JPanel();
	private JPanel pannelCenter = new JPanel();
	private JPanel pannelSouth = new JPanel();

	private JButton[] bt = new JButton[names.length];

	private JLabel labelTxt1 = new JLabel("수식입력");
	private JLabel labelTxt2 = new JLabel("계산 결과");
	private JTextField txtField1 = new JTextField("");
	private JTextField txtField2 = new JTextField("");

	private MyActionListener listener = new MyActionListener();

	String str1 = "";
	String operator = "";
	String result = "";
	double sum = 0;

	AclisTest() {

		for (int i = 0; i < names.length; i++) {
			bt[i] = new JButton(names[i]);
		}

		pannelCenter.add(labelTxt1);
		labelTxt1.setHorizontalAlignment(JLabel.CENTER);
		pannelCenter.add(txtField1);
		txtField1.setHorizontalAlignment(JLabel.CENTER);
		pannelCenter.setLayout(new GridLayout(1, 1));
		pannelSouth.setLayout(new GridLayout(6, 4, 5, 5));

		pannelNorth.add(labelTxt2);
		labelTxt2.setHorizontalAlignment(JLabel.CENTER);
		pannelNorth.add(txtField2);
		txtField2.setHorizontalAlignment(JLabel.CENTER);
		pannelNorth.setLayout(new GridLayout(1, 1));
		pannelNorth.setBackground(Color.YELLOW);

		Container a = getContentPane();
		a.add(pannelNorth, BorderLayout.NORTH);
		a.add(pannelCenter, BorderLayout.CENTER);
		a.add(pannelSouth, BorderLayout.SOUTH);

		for (int i = 0; i < names.length; i++) {
			pannelSouth.add(bt[i]);
		}

		for (int i = 0; i < names.length; i++) {
			bt[i].addActionListener(listener);
		}

		setTitle("계산기 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 450);
		setLocation(800, 400);
		setVisible(true);
	}

	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			for (int i = 0; i < names.length; i++) {
				if (e.getSource() == bt[i]) {
					if(i == 2)
					{
						str1 = "";
						txtField1.setText(str1);
						break;
					}
					if (i == 8 || i == 9 || i == 10 || i == 12 || i == 13 || i == 14 || i == 16 || i == 17 || i == 18 || i == 21) {
						str1 += names[i];
						txtField1.setText(str1);
						break;
					} 
					
					if (i == 7 || i == 11 || i == 15 || i == 19) {
						operator = names[i];
						result = str1;
						str1 = "";
						txtField2.setText(result + " " + operator);
						break;
					}
					
					if (i == 23) {
						switch (operator) {
						case "+":
							sum = Double.parseDouble(result) + Double.parseDouble(str1);
							txtField2.setText(String.valueOf(sum));
							txtField1.setText("");
							break;
						case "-":
							sum = Double.parseDouble(result) - Double.parseDouble(str1);
							txtField2.setText(String.valueOf(sum));
							txtField1.setText("");
							break;
						case "x":
							sum = Double.parseDouble(result) * Double.parseDouble(str1);
							txtField2.setText(String.valueOf(sum));
							txtField1.setText("");
							break;
						case "/":
							sum = Double.parseDouble(result) / Double.parseDouble(str1);
							txtField2.setText(String.valueOf(sum));
							txtField1.setText("");
							break;
						case "%":
							sum = Double.parseDouble(result) % Double.parseDouble(str1);
							txtField2.setText(String.valueOf(sum));
							txtField1.setText("");
							break;
						}
					}
				}
			}
		}
	}
}

public class Ex_20231005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AclisTest ob  = new AclisTest();
	}
}