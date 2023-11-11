/*class Person{
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getWeight() {
		return weight;
	}
}

class Student extends Person{
	public void set() {
		age = 30;
		name = "홍길동";
		height = 175;
		setWeight(99);
	}
}

public class Ex_20230602 {
	public static void main(String[] args) {
		Student s = new Student();
		s.set();
	}
}*/
/*
class A {
	public A() {
		System.out.println("생성자A");
	}
}

class B extends A{
	public B() {
		System.out.println("생성자B");
	}
}

class C extends B{
	public C() {
		System.out.println("생성자C");
	}
}

public class Ex_20230602 {
	public static void main(String[] args) {
		C c = new C();
	}
}
*/
/*
class A {
	public A() {
		System.out.println("생성자A");
	}
	
	public A(int x) {
		System.out.println("매개변수생성자A" + x);
	}
}

class B extends A{
	public B() {
		System.out.println("생성자B");
	}

	public B(int x) {
		super(x);
		System.out.println("매개변수생성자B" + x);
	}
}

public class Ex_20230602 {
	public static void main(String[] args) {
		B b = new B(5);
	}
}*/

class Shape{
	public Shape next;
	public Shape() {
		next = null;
	}
	
	public void draw() {
		System.out.println("Shape");
	}
}

class Rect extends Shape{
	public void draw() {
		System.out.println("Rect");
	}
}

class Line extends Shape{
	public void draw() {
		System.out.println("Line");
	}
}

class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}

public class Ex_20230602 {
	static void paint(Shape p) {
		p.draw();
	}
	
	public static void main(String[] args) {
		Line line = new Line();
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}
}