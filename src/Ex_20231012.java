import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class FlyingTextEx extends JFrame {
	private JLabel la = new JLabel("Hello");
	Container contentPane = getContentPane();
	private JButton bt = new JButton("기본");
	final int FLYING_UNIT = 10;
	
	FlyingTextEx(){
		setTitle("마우스");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane.setLayout(null);
		contentPane.addKeyListener(new MyKeyListener());
		la.setLocation(50, 50);
		la.setSize(30, 20);
		contentPane.add(la);
		contentPane.requestFocus();
		bt.setSize(100, 100);
		bt.setLocation(200, 100);
		bt.setBackground(Color.BLUE);
		contentPane.add(bt);
	}
	
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
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


public class Ex_20231012 {
	public static void main(String[] args) {
		FlyingTextEx ob = new FlyingTextEx();

	}
}