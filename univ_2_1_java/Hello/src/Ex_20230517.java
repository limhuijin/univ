/*class Circle{
	int radius;
	String name;
	
	public Circle() {
		radius = 1;
		name = "";
	}
	
	public Circle(int r, String n){
		radius = r;
		name = n;
	}
	
	public double getArea(){
		return 3.14 * radius * radius;
	}
}

public class Ex_20230517 {
	public static void main(String[] args) {
		Circle pizza = new Circle(10, "자바피자");
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle donut = new Circle();
		donut.name = "도넛피자";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	}

}*/
/*
class Book{
	String title;
	String author;
	
	public Book(String t) {
		title = "t";
		author = "작자미상";
	}
	
	public Book(String t, String a){
		title = t;
		author = a;
	}
}

public class Ex_20230517 {
	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자", "생텍쥐페리");
		Book loveStory = new Book("춘향전");
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
	}

}*/
/*
import java.util.Scanner;

class Rectangle{
	
	int vur;
	int hor;
	int area;
	int count;
	
	public Rectangle(){
		
	}
	
	public Rectangle(int a){
		vur = a;
	}

	public Rectangle(int a, int b){	
		vur = a;
		hor = b;
	}
	
	public void area() {
		area = vur * hor;
	}

	
	public void areaPrint(int num) {
		System.out.println(num + "\t" + vur + "\t" + hor + "\t" + area + "\t" + count);
	}
}	

public class Ex_20230517 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Rectangle[] rec = new Rectangle[3];
		
		for(int i = 0; i < 3; i++)
		{
			rec[i] = new Rectangle();
			
			rec[i].count = 1;
			
			System.out.println((i+1) + "번째 가로 넓이를 입력해주세요 : ");
			rec[i].hor = scanner.nextInt();
			
			System.out.println((i+1) + "번째 세로 넓이를 입력해주세요 : ");
			rec[i].vur = scanner.nextInt();
			
			rec[i].area();
		}
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				if(rec[j].area > rec[i].area)
				{
					rec[i].count++;
				}
			}	
		}
		
		System.out.println("순서\t가로\t세로\t넓이\t순위");
		for(int i = 0; i < 3; i++)
		{
			rec[i].areaPrint(i+1);
		}
	}
}*/
/*
import java.util.Scanner;

class Sum{
	
	int a;
	int ar[] = new int[3];
	int hap;
	double ave;
	int max;
	int min;
	int index;
	
	
	public Sum(){
		index = 0;
	}

	public int hapPrint(int ar[]) {
		return ar[0] + ar[1] + ar[2];
	}
	
	public double avePrint(int ar[]) {
		return (double)(ar[0] + ar[1] + ar[2]) / 3;
	}
	
	public int maxPrint(int ar[]) {
		max = ar[0];
		
		for(int i = 0; i < 3; i++)
		{
			if(ar[i] > max)
			{
				max = ar[i];
			}
		}
		
		return max;
	}
	
	public int minPrint(int ar[]) {
		min = ar[0];
		
		for(int i = 0; i < 3; i++)
		{
			if(ar[i] < min)
			{
				min = ar[i];
			}
		}
		
		return min;
	}
	
	public void sumPrint(int num, int ar[]) {
		System.out.println(num + "\t" + a + "\t" + ar[0] + "\t" + ar[1] + "\t" + ar[2] + "\t" + hapPrint(ar)+ "\t" + avePrint(ar)+ "\t" + maxPrint(ar)+ "\t" + minPrint(ar));
	}
}	

public class Ex_20230517 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Sum[] sum = new Sum[3];
		int ar[][] = new int[3][3];
		int count = 1;
		
		for(int i = 0; i < 3; i++){
			sum[i] = new Sum();
		}
		
		System.out.println("순서\ta\ta[0]\ta[1]\ta[2]\t합\t평균\tmax\tmin");
		
		for(int j = 0; j < 3; j++)
		{
			for(int i = 0; i < 3; i++) {
				ar[j][i] = count++;
			}
		}	
		
		for(int i = 0; i < 3; i++)
		{
			sum[i].a = i+2;
			sum[i].sumPrint(i+1, ar[i]);
		}
		
	}
}*/