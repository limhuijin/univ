import java.util.Scanner;
import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
/*
class MyFrame extends JFrame{
	static int a = 0; 
	
	MyFrame(){
		setTitle((a+1)+ "번째 프레임 만들기");
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		ini();
	}
	
	MyFrame(int a){
		setTitle((a+1)+ "번째 프레임 만들기");
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		setLocation((a / 2) * 1400, (a % 2) * 600);
	}
	
	public void ini() {
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		//int xpos = (int)(screen.getWidth() / 2 - this.getHeight()/2);
		//int ypos = (int)(screen.getHeight() / 2 - this.getWidth()/2);
		int xpos = 700;
		int ypos = 300;
		setLocation(xpos, ypos);
	}
}

public class Ex_20230919 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyFrame [] mf = new MyFrame[5];
		
		for(int i = 0; i < 4; i++)
		{
			mf[i] = new MyFrame(i);
		}
		
		MyFrame.a = 4;
		mf[4] = new MyFrame();
	}

}*/
/*
class ButtonEx extends JFrame{
	private JButton bt1 = new JButton("버튼 1");
	private JPanel pa = new JPanel();
	
	ButtonEx(){
		setTitle("버튼 연습");
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pa.setBackground(Color.green);
		add(pa);
		pa.add(bt1);
		pa.add(new JButton("버튼"));
	}
}

public class Ex_20230919 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ButtonEx ob = new ButtonEx();
		
	}

}*/