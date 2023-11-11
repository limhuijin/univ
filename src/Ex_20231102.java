import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

/*
class paintJPanelEx extends JFrame {
	private MyPanel panel = new MyPanel();
	paintJPanelEx() {
		setTitle("JPanel의 paintComponent() 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(panel);
		setSize(250, 220);
		setVisible(true);
	}
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.drawRect(10, 10, 50, 50);
			g.drawRect(50, 50, 50, 50);
			g.setColor(Color.MAGENTA);
			g.drawRect(90, 90, 50, 50);
		}
	}
}
public class Java_231102{
	public static void main(String[] args) {
		new paintJPanelEx();
	}
}
*/

/*
class GraphicsColorFontEx extends JFrame {
	private MyPanel panel = new MyPanel();

	GraphicsColorFontEx() {
		setTitle("Color, Font 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(350, 470);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.drawString("I Love Java~~", 30, 30);
			g.setColor(new Color(255, 0, 0));
			g.setFont(new Font("Arial", Font.ITALIC, 30));
			g.drawString("How much?", 30, 60);
			g.setColor(new Color(0x00ff00ff));
			for (int i = 1; i <= 5; i++) {
				g.setFont(new Font("JokerMan", Font.ITALIC, i * 10));
				g.drawString("This much!!", 30, 60 + i * 60);
			}
		}
	}
}

public class Java_231102 {
	public static void main(String[] args) {
		new GraphicsColorFontEx();
	}
}
*/

/*
public class Java_231102 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(5);
		v.add(4);
		v.add(-1);
		
		v.add(2, 100); // 4와 -1사이에 정수 100 삽입
		System.out.println("벡터 내의 요소 객체 수: " + v.size());
		System.out.println("벡터의 현재 용량: " + v.capacity());
		
		//모든 요소 정수 출력하기
		for (int i = 0; i<v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);
		}
		//벡터 속의 모든 정수 더하기
		int sum = 0;
		for (int i =0; i<v.size(); i++) {
			int n = v.elementAt(i);
			sum += n;
		}
		System.out.println("벡터에 있는 정수 합: " + sum);
	}
}
*/

/*
class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}
}

public class Java_231102 {
	public static void main(String[] args) {
		// Point 객체를 요소로만 가지는 벡터 생성
		Vector<Point> v = new Vector<Point>();

		// 3개의 Point 객체 삽입
		v.add(new Point(2, 3));
		v.add(new Point(-5, 20));
		v.add(new Point(30, -8));

		v.remove(1); // 인덱스 1의 Point(-5, 20)객체 삭제

		// 벡터에 있는 Point 객체 모두 검색하여 출력
		for (int i = 0; i < v.size(); i++) {
			Point p = v.get(i); // 벡터에서 i번째 point 객체 얻어내기
			System.out.println(p); // p.toString()을 이용하여 p 출력
		}
	}
}
*/

class GraphicsDrawLineMouseEx extends JFrame {
	private MyPanel panel = new MyPanel();

	GraphicsDrawLineMouseEx() {
		setTitle("drawing Line by Mouse 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300, 300);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		private Vector<Point> vStart = new Vector<Point>();
		private Vector<Point> vEnd = new Vector<Point>();

		public MyPanel() {
			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					Point startP = e.getPoint();
					vStart.add(startP);
				}

				public void mouseReleased(MouseEvent e) {
					Point endP = e.getPoint();
					vEnd.add(endP);
					repaint();
				}
			});
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			for (int i = 0; i < vStart.size(); i++) {
				Point s = vStart.elementAt(i);
				Point e = vEnd.elementAt(i);
				g.drawLine((int) s.getX(), (int) s.getY(), (int) e.getX(), (int) e.getY());
			}
		}
	}

}

public class Ex_20231102 {
	public static void main(String[] args) {
		new GraphicsDrawLineMouseEx();
	}
}
