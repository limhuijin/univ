class Buffer {
	private int data;
	private boolean empty = true;
	public synchronized int get() throws InterruptedException{
		while (empty) {
			System.out.println("물건 없어요");
			wait();
		}
		empty = true;
		notifyAll();
		return data;
	}
	
	public synchronized void put(int d) throws InterruptedException{
		while (!empty) {
			System.out.println("재고 없어요");
			wait();
		}
		empty = false;
		data = d;
		System.out.println("생산자 : " + data + "번 케익 생산");
		notifyAll();
	}
}

class Producer implements Runnable{
	private Buffer buffer;
	private int data;
	
	public Producer(Buffer buffer) {
		this.buffer = buffer;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++)
		{
			data = i;
			
			try {
				buffer.put(data);
			}
			catch (InterruptedException e1) {
			}
			
			try {
				Thread.sleep((int)Math.random() * 500);
			}
			catch (InterruptedException e) {
			}
		}
	}
}

class Consumer implements Runnable {
	private Buffer buffer;
	private int data;
	
	public Consumer(Buffer buffer) {
		this.buffer = buffer;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++)
		{
			try {
				data = buffer.get();
				System.out.println("소비자 : " + data + "번 케익 소비");
			}
			catch (InterruptedException e1) {
			}
			
			try {
				Thread.sleep((int)Math.random() * 200);
			}
			catch (InterruptedException e) {
			}
		}
	}
}

public class Ex_20231114_1 {
	public static void main(String [] args) {
		Buffer b = new Buffer();
		Producer t1 = new Producer(b);
		Consumer t2 = new Consumer(b);
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		th1.start();
		th2.start();
	}
}
