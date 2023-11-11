import java.awt.Color;
import java.awt.*;
import javax.swing.*;

/*
//스레드 기본개념
class MyThread extends Thread{
	public void run() {
		for (int i = 0; i>= 10; i--) {
			System.out.print(i + " ");
		}
	}
}
class MyRunnable implements Runnable { //인터페이스를 이용한 스레드
	public void run() {
		for (int i = 10; i>= 0; i--) {
			System.out.print(i + " ");
		}
	}
}

public class Java_231107 {

	public static void main(String[] args) {
		Thread t = new MyThread();
		t.start(); // 이건 Thread 안에 있는 run이 자동으로 시작된다(메소드 아님)
		
		Thread t1 = new Thread(new MyRunnable()); 
		t1.start();
	}
}
*/

/*class MyRunnable implements Runnable{
	String myName;
	public MyRunnable(String myName) {
		this.myName = myName;
	}
	
	public void run() {
		for (int i = 10; i >= 0; i--) {
			System.out.println(myName + i + " ");
		}
	}
}

public class Ex_20231107 {
	public static void main(String[] args) {
		MyRunnable th1 = new MyRunnable("A");
		MyRunnable th2 = new MyRunnable("B");
		
		Thread t1 = new Thread(th1);
				Thread t2 = new Thread(th2);
		
		t1.start();
		t2.start();
	}
}
*/
/*class ThreadTimer extends JFrame {
	JLabel laA = new JLabel();
	TimerThread th = new TimerThread(laA);
	int num = 0;

	ThreadTimer(int num) {
		this.num = num;
		setTitle("타이머");
		setSize(300, 170);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		laA.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(laA);
		th.start();
	}

	class TimerThread extends Thread {
		private JLabel laB;

		public TimerThread(JLabel la) {
			laB = la;
		}

		public void run() {
			int n = 0;
			while (true) {
				laB.setText(Integer.toString(n));
				n++;
				try {
					Thread.sleep(num);
				} catch (InterruptedException e) {
					return;
				}
			}
		}
	}
}

public class Ex_20231107 {
	public static void main(String[] args) {
		ThreadTimer th1 = new ThreadTimer(5000);
		ThreadTimer th2 = new ThreadTimer(1000);
		ThreadTimer th3 = new ThreadTimer(500);
		ThreadTimer th4 = new ThreadTimer(100);
	}
}*/

class FlickeringLabel extends JFrame implements Runnable {
	private long delay;

	public FlickeringLabel(String text, long delay) {
		super(text);
		this.delay = delay;
		Thread th = new Thread(this);
		th.start();
	}

	public void run() {
		int n = 0;
		while (true) {
			if (n == 0) {
				setBackground(Color.yellow);
			} else {
				setBackground(Color.green);
			}
			if (n == 0) {
				n = 1;
			}
			else {
				n = 0;
			}

			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}

class FlickeringLabelEx extends JFrame{
	public FlickeringLabelEx() {
		setTitle("예제");
		setSize(300,150);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		FlickeringLabel fLabel = new FlickeringLabel("깜박", 500);
		JLabel label = new JLabel("안깜박");
		FlickeringLabel fLabel2 = new FlickeringLabel("여기도 깜박", 300);
		
		c.add(fLabel);
		c.add(label);
		c.add(fLabel2);
	}
}

	
public class Ex_20231107 {
	public static void main(String[] args) {
		new FlickeringLabelEx();
	}
}