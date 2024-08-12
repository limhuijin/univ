import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
class GridLayoutEx extends JFrame{
	final String[] btn_Title = {"1", "2", "3", "4", "5", "6", "7", "8",
            "9", "*", "0"};
	
	JButton[] btArry = new JButton[11];

	GridLayoutEx(){
		GridLayout grid = new GridLayout(4, 3);
		Container cont = getContentPane();
	
		cont.setLayout(grid);
		
		for (int i = 0; i < btArry.length; i++) {
			 cont.add(btArry[i] = new JButton(btn_Title[i]));
		 }
		
		setTitle("GridLayoutEx Sample");
		setSize(200, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		 
	}	
}

public class Ex_20230926 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new GridLayoutEx();
	}
}*/
/*
class NullContainerEx extends JFrame{
	JLabel la = new JLabel("Hello, Press Buttons!");
	Container cont = getContentPane();
	
	NullContainerEx(){
		cont.setLayout(null);
		
		la.setLocation(130, 50);
		la.setSize(200, 20);
		cont.add(la);
		
		for(int i = 1; i < 10; i++)
		{
			JButton b = new JButton(Integer.toString(i));
			b.setLocation(i*15, i * 15);
			b.setSize(50, 20);
			cont.add(b);
		}
		
		setTitle("Null ContainerEx Sample");
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class Ex_20230926 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new NullContainerEx();
	}
}*/
/*
class TenColor extends JFrame
{
	Color []color = {new Color(255, 0, 0),new Color(255, 128, 0),new Color(255, 255, 0),new Color(0, 255, 0),new Color(0, 255, 255),new Color(0, 0, 255),new Color(255, 0, 127),new Color(153, 76, 0),new Color(255, 204, 204),new Color(224, 224, 224),};
	JButton[] btArry = new JButton[11];
	
	GridLayout grid = new GridLayout(0, 10);
	Container cont = getContentPane();
	
	TenColor(){
		cont.setLayout(grid);
		
		for (int i = 0; i < 10; i++) {
			cont.add(btArry[i] = new JButton());
			btArry[i].setBackground(color[i]);
		}
		
		setTitle("Null ContainerEx Sample");
		setSize(500, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class Ex_20230926 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new TenColor();
	}
}
*/

class TestFrame  extends JFrame{
	JButton[] bt = new JButton[16];
	GridLayout grid = new GridLayout(4, 4, 5, 5);
	JPanel jp1 = new JPanel();
	JPanel jp2 = new JPanel();
	JPanel jp3 = new JPanel();
	
	final String[] btn_Title = {"0", "1", "2", "3", "4", "5", "6", "7", "8","9", "*", "0", "ce", "계산", "+", "-", "x", "/"};
	Container co = getContentPane();
	
	TestFrame(){
		jp1.add(new Button("수식 입력"));
		jp2.setLayout(grid);
		jp3.add(new Button("계산 결과"));
		
		co.add(jp1, BorderLayout.NORTH);
		co.add(jp2);
		co.add(jp3, BorderLayout.SOUTH);
		
		for (int i = 0; i < 16; i++) {
			jp2.add(bt[i] = new JButton(btn_Title[i]));
		}
		
		setTitle("Null ContainerEx Sample");
		setSize(500, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class Ex_20230926 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new TestFrame();
	}
}