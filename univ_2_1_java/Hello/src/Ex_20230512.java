import java.util.Scanner;
/*
public class Ex_20230512 {

	public static int sum2(int a, int b)
	{
		return (a + b);
	}
	
	public static int sum3(int a, int b, int c)
	{
		return (a + b + c);
	}
	
	public static int sum4(int a, int b, int c, int d)
	{
		return (a + b + c + d);
	}
	
	public static int max(int a, int b)
	{
		if(a > b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	
	public static void half(int a)
	{
		if(a % 2 == 0)
		{
			System.out.println(a + "는 짝수입니다.");
		}
		else
		{
			System.out.println(a + "는 홀수입니다.");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = 5, b = 10, c = 15, d = 20;
		
		System.out.println("두 수의 합은 " + sum2(a, b));
		System.out.println("세 수의 합은 " + sum3(a, b, c));
		System.out.println("네 수의 합은 " + sum4(a, b, c, d));
		System.out.println("두 수 중 더 큰 수는 " + max(a, b));
		half(a);
	}

	
}*/
/*
class Rectangle{
	
	int vur;
	int hor;
	int area;
	int count;
	
	Rectangle(){
		
	}
	
	public void area() {
		area = vur * hor;
	}

	
	public void areaPrint(int num) {
		System.out.println(num + "\t" + vur + "\t" + hor + "\t" + area + "\t" + count);
	}
}	

public class Ex_20230512 {

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