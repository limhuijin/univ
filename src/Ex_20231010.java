import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
class MouseLis extends JFrame {
	private FlowLayout f = new FlowLayout(5, 30, 30);
	private JButton bt1 = new JButton("Mouse Event Test");
	private JPanel myPanel = new JPanel();
	private MyMouseListener listener = new MyMouseListener();
	private JTextField txt1 = new JTextField(20);
	
	MouseLis(){
		setTitle("버튼연습");
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(myPanel);
		myPanel.setLayout(f);
		myPanel.add(bt1);
		bt1.addMouseListener(listener);
		
		Container a = getContentPane();
		a.add(txt1, BorderLayout.SOUTH);
	}
	class MyMouseListener implements MouseListener{
		public void mouseClicked(MouseEvent arg0) {
			txt1.setText("clicked");
		}
		public void mouseEntered(MouseEvent e) {
			
			JButton btn = (JButton)e.getSource();
			btn.setBackground(Color.RED);
		}
		
		public void mouseExited(MouseEvent e) {
			JButton btn = (JButton)e.getSource();
			btn.setBackground(Color.GREEN);
		}
		public void mousePressed(MouseEvent arg0) {
			txt1.setText("Pressed");
		}
		public void mouseReleased(MouseEvent arg0) {
			txt1.setText("released");
		}
	}

}



public class Ex_20231010 {
	public static void main(String[] args) {
		MouseLis ob = new MouseLis();

	}
}*/

class MouseLisE extends JFrame {
	private JPanel myPanel = new JPanel();
	private JLabel la = new JLabel("Hello");
	private MyMouseListener MyM = new MyMouseListener();
	private JLabel name = new JLabel("x ");
	private JTextField name2 = new JTextField("");
	
	private JLabel name3 = new JLabel("y ");
	private JTextField name4 = new JTextField("");
	private JPanel myPanel2 = new JPanel();
	
	MouseLisE(){
		setTitle("마우스");
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(myPanel);
		myPanel.add(la);
		myPanel.setLayout(null);
		myPanel.addMouseListener(MyM);
		
		myPanel2.add(name);
		myPanel2.add(name2);
		myPanel2.add(name3);
		myPanel2.add(name4);
		myPanel2.setLayout(new GridLayout(1, 4));
		
		la.setLocation(30, 30);
		la.setSize(50, 20);

		Container a = getContentPane();
		a.add(myPanel2, BorderLayout.SOUTH);
	}
	
	class MyMouseListener implements MouseListener{
		public void mouseClicked(MouseEvent e) {
		}
		public void mouseEntered(MouseEvent e) {
		}
		
		public void mouseExited(MouseEvent e) {
		}
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			name2.setText(Integer.toString(x));
			name4.setText(Integer.toString(y));
			la.setLocation(x, y);
		}
		public void mouseReleased(MouseEvent e) {
		}
	}

}



public class Ex_20231010 {
	public static void main(String[] args) {
		MouseLisE ob = new MouseLisE();

	}
}