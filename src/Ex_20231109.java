import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Cargame extends JFrame{
	JLabel laA = new JLabel("A");
	JLabel laB = new JLabel("B");
	JLabel laC = new JLabel("C");
	JLabel laRank = new JLabel("");
	JLabel laALocate = new JLabel("A 위치 : ");
	JLabel laBLocate = new JLabel("B 위치 : ");
	JLabel laCLocate = new JLabel("C 위치 : ");
	JButton btStart = new JButton("시작");
	
	MyThreadA th1 = new MyThreadA(laA, "A", laALocate);
	MyThreadA th2 = new MyThreadA(laB, "B", laBLocate);
	MyThreadA th3 = new MyThreadA(laC, "C", laCLocate);
	
	MyActionListener lis = new MyActionListener();

	public Cargame() {
		setTitle("자동차 경주");
		setSize(600, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		laA.setSize(100, 50);
		laB.setSize(100, 50);
		laC.setSize(100, 50);
		laRank.setSize(100, 50);
		laALocate.setSize(100, 50);
		laBLocate.setSize(100, 50);
		laCLocate.setSize(100, 50);
		btStart.setSize(60, 40);
		
		laA.setLocation(100, 100);
		laB.setLocation(100, 150);
		laC.setLocation(100, 200);
		laRank.setLocation(500, 0);
		laALocate.setLocation(200, 0);
		laBLocate.setLocation(300, 0);
		laCLocate.setLocation(400, 0);
		btStart.setLocation(10, 10);
		
		btStart.addActionListener(lis);
		
		c.add(laA);
		c.add(laB);
		c.add(laC);
		c.add(laALocate);
		c.add(laBLocate);
		c.add(laCLocate);
		c.add(laRank);
		c.add(btStart);
	}
	

	class MyThreadA extends Thread{
		private JLabel label;
		private int ix, iy;
		private String name;
		private JLabel laLocate;
		
		
		public MyThreadA(JLabel label, String name, JLabel laLocate) {
			this.label = label;
			this.name = name;
			this.laLocate = laLocate;
		}
		
		public void run() {
			ix = label.getX();
			iy = label.getY();
			
			for (int i = 0; i < 200; i++)
			{
				laLocate.setText(name + " 위치 : " + Integer.toString(ix));
				
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
					String str = laRank.getText();
					laRank.setText(str + " " + name);
					break;
				}
			}
		}
	}
	
	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			btStart = (JButton)e.getSource();
			if(btStart.getText().equals("시작")) {
				th1.start();
				th2.start();
				th3.start();
			}
		}
	}
}


	
public class Ex_20231109 {
	public static void main(String[] args) {
		new Cargame();
	}
}