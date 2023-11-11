import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
class FlowLayoutEx extends JFrame{
	private JButton bt1 = new JButton("add");
	private JButton bt2 = new JButton("sub");
	private JButton bt3 = new JButton("mul");
	private JButton bt4 = new JButton("div");
	private JButton bt5 = new JButton("Calculate");
	
	FlowLayoutEx(){
		setTitle("FlowLayout Sample");
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		bt1.setPreferredSize(new Dimension(150, 20));
		c.add(bt1);
		c.add(bt2);
		c.add(bt3);
		c.add(bt4);
		c.add(bt5);
		
	}
}

public class Ex_20230921 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new FlowLayoutEx();
	}

}*/
/*
class BorderLayoutEx extends JFrame{
	private JButton bt1 = new JButton("add");
	private JButton bt2 = new JButton("sub1");
	private JButton bt6 = new JButton("sub2");
	private JButton bt3 = new JButton("mul");
	private JButton bt4 = new JButton("div");
	private JButton bt5 = new JButton("Calculate");
	private JPanel panel = new JPanel();
	
	BorderLayoutEx(){
		setTitle("BorderLayout Sample");
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout(30, 40));
		
		c.add(bt1, BorderLayout.NORTH);
		c.add(bt3, BorderLayout.EAST);
		c.add(bt4, BorderLayout.WEST);
		c.add(bt5, BorderLayout.CENTER);
		
		panel.add(bt2);
		panel.add(bt6);
		c.add(panel, BorderLayout.SOUTH);
	}
}

public class Ex_20230921 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new BorderLayoutEx();
	}

}*/