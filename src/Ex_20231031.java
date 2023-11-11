import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


class JComponentEx extends JFrame {
	
	JButton b1 = new JButton("Magenta/Yellow Button");
	JButton b2 = new JButton("Disabled Button");
	JButton b3 = new JButton("getX(), getY()");
	JPanel pa = new JPanel();
	MyAction lis = new MyAction();
	
	JComponentEx(){
		setTitle("공통 메소드 예제");
		setSize(260, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.add(pa);
		
		b1.setBackground(Color.YELLOW);
		b1.setForeground(Color.magenta);
		b1.setFont(new Font("Arial", Font.ITALIC, 20));
		b2.setEnabled(false);
		b3.addActionListener(lis);
		
		pa.add(b1);
		pa.add(b2);
		pa.add(b3);
	}
	
	class MyAction implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			JComponentEx frame = (JComponentEx)b.getTopLevelAncestor();
			frame.setTitle(b.getX() + ", " + b.getY());
	}
	}
}


class buttonIcon extends JFrame {
	
	JLabel la1 = new JLabel("집 가고 싶다");
	ImageIcon im = new ImageIcon("imeges/home.png");
	JLabel la2 = new JLabel(im);
	ImageIcon normallcon = new ImageIcon("imeges/home.png");
	JLabel la3 = new JLabel("집 보내줘요", normallcon, SwingConstants.CENTER);
	
	buttonIcon(){
		setTitle("이미지 버튼 예제");
		setSize(250, 150);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(la1);
		c.add(la2);
	}
}
class LabelEx1 extends JFrame {

	ImageIcon no = new ImageIcon("imeges/home.png");
	ImageIcon ro = new ImageIcon("imeges/증명사진.jpg");
	ImageIcon pr = new ImageIcon("imeges/home.png");
	JButton b1 = new JButton("call ~", no);
	
	LabelEx1(){
		setTitle("레이블 예제");
		setSize(400, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		b1.setPressedIcon(pr);
		b1.setRolloverIcon(ro);
		c.add(b1);
	}
}

class CheckBoxItem extends JFrame {

	private JCheckBox [] fruits = new JCheckBox[3];
	private String [] names = {"사과", "배", "체리"};
	private JLabel sumlabel = new JLabel("현재 0원 입니다.");
	private JLabel la = new JLabel("사과 100원, 배 500원, 체리 20000원");
	
	CheckBoxItem(){
		setTitle("체크박스와 아이템 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(la);
		
		MyItemListener listener = new MyItemListener();
		for(int i = 0; i < fruits.length; i++)
		{
			fruits[i] = new JCheckBox(names[i]);
			fruits[i].setBorderPainted(true);
			c.add(fruits[i]);
			fruits[i].addItemListener(listener);
		}
		
		c.add(sumlabel);
		setSize(250, 200);
		setVisible(true);
	}
	
	class MyItemListener implements ItemListener{
		private int sum = 0;
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				if(e.getItem() == fruits[0])
				{
					sum += 100;
				}
				else if(e.getItem() == fruits[1])
				{
					sum += 500;
				}
				else 
				{
					sum += 20000;
				}
			}
			else
			{
				if(e.getItem() == fruits[0])
				{
					sum -= 100;
				}
				else if(e.getItem() == fruits[1])
				{
					sum -= 500;
				}
				else 
				{
					sum -= 20000;
				}
			}
			
			sumlabel.setText("현재 " + sum + "원 입니다.");
		}
	}
}

class SliderChangeEx extends JFrame {

	private JLabel colorLabel = new JLabel("	SLIDER EXAMPLE	  ");
	private JSlider [] sl = new JSlider[3];
	
	public SliderChangeEx(){
		setTitle("슬라이더와 체인지이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		for(int i = 0; i < sl.length; i++)
		{
			sl[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 128);
			sl[i].setPaintLabels(true);
			sl[i].setPaintTicks(true);
			sl[i].setPaintTrack(true);
			sl[i].setMajorTickSpacing(50);
			sl[i].setMinorTickSpacing(10);
			
			sl[i].addChangeListener(new MyChangeListener());
			c.add(sl[i]);
		}
		
		sl[0].setForeground(Color.red);
		sl[1].setForeground(Color.green);
		sl[2].setForeground(Color.blue);
		
		int r = sl[0].getValue();
		int g = sl[1].getValue();
		int b = sl[2].getValue();
		colorLabel.setOpaque(true);
		colorLabel.setBackground(new Color(r, g ,b));
		
		c.add(colorLabel);
		setSize(300, 230);
		setVisible(true);
	}
	
	class MyChangeListener implements ChangeListener{
		public void stateChanged(ChangeEvent e) {
			int r = sl[0].getValue();
			int g = sl[1].getValue();
			int b = sl[2].getValue();
			colorLabel.setBackground(new Color(r, g ,b));
	}
}
}	
public class Ex_20231031 {
	public static void main(String[] args) {
		//JComponentEx ob = new JComponentEx();
		//buttonIcon ob1 = new buttonIcon();
		//LabelEx1 ob2 = new LabelEx1();
		//CheckBoxItem ob3 = new CheckBoxItem();
		SliderChangeEx ob4 = new SliderChangeEx();
	}
}