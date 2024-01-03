import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

//public class Ex_20231114 {
//	public static void main(String[] args) {
//
//		Scanner scanner = new Scanner(System.in);
//
//		while (true) {
//			System.out.print("나뉨수를 입력하시오 : ");
//			int a = scanner.nextInt();
//			System.out.print("나눗수를 입력하시오 : ");
//			int b = scanner.nextInt();
//
//			try {
//				System.out.print(a + "를 " + "로 나누면 몫은 " + a / b + "입니다.");
//				break;
//			} catch (InputMismatchException e) {
//				System.out.println("문자열은 입력할 수 없습니다. 다시 입력하세요");
//			} catch (ArithmeticException e) {
//				System.out.println("0으로 나눌 수 없습니다. 다시 입력하세요");
//			}
//
//		}
//
//		int[] intarr = new int[5];
//		intarr[0] = 0;
//
//		try {
//			for (int i = 0; i < 5; i++) {
//				intarr[i + 1] = i + 1 + intarr[i];
//				System.out.println("intarr[" + i + "]" + "=" + intarr[i]);
//			}
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("배열의 인덱스 범위를 벗어났습니다.");
//		}
//	}
//}

//class ThreadFinishFlagEx extends JFrame{
//	private RandomThread th;
//	
//	public ThreadFinishFlagEx() {
//		setTitle("ThreadFinishFlagEx");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setSize(300, 200);
//		setVisible(true);
//		
//		Container c = getContentPane();
//		c.setLayout(null);
//		
//		c.addMouseListener(new MouseAdapter() {
//			public void mousePressed(MouseEvent e) {
//				th.finish();
//			}
//		});
//		
//		th = new RandomThread(c);
//		th.start();
//	}
//}
//
//class RandomThread extends Thread {
//	private Container contentPane;
//	private boolean flag = false;
//
//	public RandomThread(Container contentPane) {
//		this.contentPane = contentPane;
//	}
//
//	void finish() {
//		flag = true;
//	}
//
//	public void run() {
//		while(true) {
//			int x = (int)(Math.random() * contentPane.getWidth());
//			int y = (int)(Math.random() * contentPane.getHeight());
//			JLabel label = new JLabel("JAVA");
//			label.setSize(80, 30);
//			label.setLocation(x, y);
//			contentPane.add(label);
//			contentPane.repaint();
//			
//			try {
//				Thread.sleep(300);
//				
//				if(flag == true) {
//					contentPane.removeAll();
//					label = new JLabel("finish");
//					label.setSize(80, 30);
//					label.setLocation(100, 100);
//					label.setForeground(Color.red);
//					contentPane.add(label);
//					contentPane.repaint();
//					return;
//				}
//			}
//			catch (InterruptedException e) {
//				return;
//			}
//		}
//	}
//}

class SharedBoard {
	private int sum = 0;
	
	synchronized public void add() {
		int n = sum;
		Thread.yield();
		n += 10;
		sum = n;
		System.out.println(Thread.currentThread().getName() + " : " + sum);
	}
}

class StudentThread extends Thread{
	private SharedBoard board;
	
	public StudentThread(String name, SharedBoard board) {
		super(name);
		this.board = board;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++)
		{
			board.add();
		}
	}
}

public class Ex_20231114 {
	public static void main(String[] args) {
		SharedBoard board = new SharedBoard();
		Thread th1 = new StudentThread("kitae", board);
		Thread th2 = new StudentThread("hyosoo", board);
		th1.start();
		th2.start();
	}
}