import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Cargame extends JFrame{
	JLabel la1 = new JLabel("A");
	JLabel la2 = new JLabel("B");
	JLabel la3 = new JLabel("C");
	JLabel la4 = new JLabel("");
	JLabel la11 = new JLabel("A 위치 : ");
	JLabel la21 = new JLabel("B 위치 : ");
	JLabel la31 = new JLabel("C 위치 : ");
	JButton bt = new JButton("시작");
	
	MyThreadA th1 = new MyThreadA(la1, "A", la11);
	MyThreadA th2 = new MyThreadA(la2, "B", la21);
	MyThreadA th3 = new MyThreadA(la3, "C", la31);
	
	MyActionListener lis = new MyActionListener();

	public Cargame() {
		setTitle("자동차 경주");
		setSize(600, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		la1.setSize(100, 50);
		la2.setSize(100, 50);
		la3.setSize(100, 50);
		la4.setSize(100, 50);
		la11.setSize(100, 50);
		la21.setSize(100, 50);
		la31.setSize(100, 50);
		bt.setSize(60, 40);
		
		la1.setLocation(100, 100);
		la2.setLocation(100, 150);
		la3.setLocation(100, 200);
		la4.setLocation(500, 0);
		la11.setLocation(200, 0);
		la21.setLocation(300, 0);
		la31.setLocation(400, 0);
		bt.setLocation(10, 10);
		
		bt.addActionListener(lis);
		
		c.add(la1);
		c.add(la2);
		c.add(la3);
		c.add(la11);
		c.add(la21);
		c.add(la31);
		c.add(la4);
		c.add(bt);
	}
	

class MyThreadA extends Thread{
	private JLabel label;
	private int ix, iy;
	private String name;
	private JLabel la;
	
	
	public MyThreadA(JLabel label, String name, JLabel la) {
		this.label = label;
		this.name = name;
		this.la = la;
	}
	
	public void run() {
		ix = label.getX();
		iy = label.getY();
		
		for (int i = 0; i < 200; i++)
		{
			la.setText(name + " 위치 : " + Integer.toString(ix));
			
			if (ix < 550)
			{
				ix += 10 * Math.random();
				label.setLocation(ix, iy);
				
				try {
					Thread.sleep(100);
				} catch(InterruptedException e) {
					return;
				}
			}
			else
			{
				String str = la4.getText();
				la4.setText(str + " " + name);
				break;
			}
		}
	}
}
	
	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			bt = (JButton)e.getSource();
			if(bt.getText().equals("시작")) {
				th1.start();
				th2.start();
				th3.start();
				bt.setText("정지");
			}
		}
	}
}


	
public class Ex_20231109 {
	public static void main(String[] args) {
		new Cargame();
	}
}