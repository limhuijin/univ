import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//class MouseListenerAllEx extends JFrame {
//	private JLabel la = new JLabel("no Mouse Event");
//	JPanel contentPane = new JPanel();
//	
//	MouseListenerAllEx(){
//		setTitle("마우스 예제");
//		setSize(300, 200);
//		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setContentPane(contentPane);
//		
//		contentPane.addMouseListener(new MyMouseListener());
//		contentPane.addMouseMotionListener(new MyMouseListener());
//		contentPane.add(la);
//	}
//	
//	
//	class MyMouseListener implements MouseListener, MouseMotionListener{
//		
//		public void mousePressed(MouseEvent e) {
//			la.setText("MousePressed (" + e.getX() + ", " + e.getY() + ")");
//		}
//		public void mouseReleased(MouseEvent e) {
//			la.setText("mouseReleased (" + e.getX() + ", " + e.getY() + ")");
//		}	
//		public void mouseClicked(MouseEvent e) {
//		}
//		public void mouseEntered(MouseEvent e) {
//			JPanel p = (JPanel)e.getSource();
//			p.setBackground(Color.cyan);
//		}
//		
//		public void mouseExited(MouseEvent e) {
//			JPanel p = (JPanel)e.getSource();
//			p.setBackground(Color.yellow);
//		}
//		public void mouseDragged(MouseEvent e) {
//			la.setText("mouseDragged (" + e.getX() + ", " + e.getY() + ")");
//		}
//		
//		public void mouseMoved(MouseEvent e) {
//			la.setText("mouseMoved (" + e.getX() + ", " + e.getY() + ")");
//		}
//	}
//}
//
//class ClickAndDoubleClockEx extends JFrame {
//	Container c = getContentPane();
//	
//	ClickAndDoubleClockEx(){
//		setTitle("마우스 예제");
//		setSize(300, 200);
//		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		c.addMouseListener(new MyMouseListener());
//	}
//	
//	
//	class MyMouseListener extends MouseAdapter{	
//		public void mouseClicked(MouseEvent e) {
//			if(e.getClickCount() == 2)
//			{
//				int r = (int)(Math.random()*256);
//				int g = (int)(Math.random()*256);
//				int b = (int)(Math.random()*256);
//				
//				Component c = (Component)e.getSource();
//				c.setBackground(new Color(r, g, b));
//			}
//		}
//	}
//}

class FlyingTextExx extends JFrame {
	private JLabel la = new JLabel("Hello");
	Container contentPane = getContentPane();
	private JButton bt = new JButton("기본");
	private JButton bt1 = new JButton("new start");
	private JLabel la1 = new JLabel("label 좌표");
	private JLabel la2 = new JLabel("x : ");
	private JTextField text1 = new JTextField("");
	private JLabel la3 = new JLabel("y : ");
	private JTextField text2 = new JTextField("");
	private JTextField text3 = new JTextField("");
	final int FLYING_UNIT = 10;
	int num = 0;
	
	FlyingTextExx(){
		setTitle("마우스");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane.setLayout(null);
		contentPane.addKeyListener(new MyKeyListener());
		contentPane.requestFocus();
		
		la.setLocation(50, 50);
		la.setSize(30, 20);
		contentPane.add(la);
		
		bt.setSize(100, 100);
		bt.setLocation(200, 100);
		bt.setBackground(Color.BLUE);
		contentPane.add(bt);
		
		bt1.addMouseListener(new MyMouseListener());

		contentPane.setLayout(new FlowLayout());
		contentPane.add(bt1);
		contentPane.add(la1);
		contentPane.add(la2);
		contentPane.add(text1);
		contentPane.add(la3);
		contentPane.add(text2);
		contentPane.add(text3);
	}
	
	class MyMouseListener implements MouseListener{
		public void mouseClicked(MouseEvent e) {
			contentPane.requestFocus();
			
			int y = (int)(Math.random()*contentPane.getHeight());
			int x = (int)(Math.random()*contentPane.getWidth());
			int y1 = (int)(Math.random()*contentPane.getHeight());
			int x1 = (int)(Math.random()*contentPane.getWidth());

			bt.setLocation(x, y);
			la.setLocation(x1, y1);
			num = 0;

			text1.setText(Integer.toString(la.getX()));
			text2.setText(Integer.toString(la.getY()));
			text3.setText(Integer.toString(num));
		}
		public void mouseEntered(MouseEvent e) {
		}
		public void mouseExited(MouseEvent e) {
		}
		public void mousePressed(MouseEvent e) {
		}
		public void mouseReleased(MouseEvent e) {
		}
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			num++;
			switch(keyCode) {
			case KeyEvent.VK_UP:
				if(la.getY()-FLYING_UNIT > 0)
				{
					la.setLocation(la.getX(), la.getY()-FLYING_UNIT);
				}
				else
				{
					la.setLocation(la.getX(), contentPane.getHeight());
				}
				break;
			case KeyEvent.VK_DOWN:
				if(la.getY() + FLYING_UNIT + la.getHeight() < contentPane.getHeight())
				{
					la.setLocation(la.getX(), la.getY()+FLYING_UNIT);
				}
				else
				{
					la.setLocation(la.getX(), 10);
				}
				break;
			case KeyEvent.VK_LEFT:
				if(la.getX()-FLYING_UNIT > 0)
				{
					la.setLocation(la.getX()-FLYING_UNIT, la.getY());
				}
				else
				{
					la.setLocation(contentPane.getWidth(), la.getY());
				}
				break;
			case KeyEvent.VK_RIGHT:
				if(la.getX() + FLYING_UNIT + la.getWidth() < contentPane.getWidth() + 70)
				{
					la.setLocation(la.getX()+FLYING_UNIT, la.getY());
				}
				else
				{
					la.setLocation(10, la.getY());
				}
				break;
			}
			
			hit();
			text1.setText(Integer.toString(la.getX()));
			text2.setText(Integer.toString(la.getY()));
			text3.setText(Integer.toString(num));
		}
		
		public void hit()
		{
			int laX1 = la.getX();
			int laY1 = la.getY();
			int laX2 = la.getX() + la.getWidth();
			int laY2 = la.getY() + la.getHeight();
			
			int btX1 = bt.getX();
			int btY1 = bt.getY();
			int btX2 = bt.getX() + bt.getWidth();
			int btY2 = bt.getY() + bt.getHeight();
			
			if((btX2 > laX1) && (btX1 < laX2) && (btY2 > laY1) && (btY1 < laY2))
			{
				bt.setText("충돌");
				bt.setBackground(Color.RED);
			}
			else
			{
				bt.setText("기본");
				bt.setBackground(Color.BLUE);
			}
		}
	}

}

public class Ex_20231019 {
	public static void main(String[] args) {
		//MouseListenerAllEx ob = new MouseListenerAllEx();
		//ClickAndDoubleClockEx ob1 = new ClickAndDoubleClockEx();
		FlyingTextExx ob2 = new FlyingTextExx();
	}
}