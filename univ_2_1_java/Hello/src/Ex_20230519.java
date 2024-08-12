/*class Circle{
	int radius;
	
	public Circle() {}
		
	public Circle(int a) {
		radius = a;
	}
	
	public double getArea() {
		return 3.14 * radius * radius;
	}
}

public class Ex_20230519 {
	public static void main(String[] args) {
		Circle c[] = new Circle[5];
		
		for(int i = 0; i < 5; i++)
		{
			c[i] = new Circle(i);
		}
		
		System.out.println("순서\ta\tb\t합\t평균\t순위");
		
		for(int i = 0; i < c.length; i++)
		{
			System.out.print((int)c[i].getArea() + " ");
		}
	}

}
*/
/*
class Arr{
	int a;
	int b;
	int rank;
	
	public Arr(int x, int y) {
		a = x;
		b = y;
		rank = 1;
	}
	
	public int sumPrint(int a, int b) {
		return a + b;
	}
	
	public double avePrint(int a, int b) {
		return (double)(a + b) / 3;
	}
}

public class Ex_20230519 {
	public static void main(String[] args) {
		Arr arr[] = new Arr[5];
		
		for(int i = 0; i < 5; i++)
		{
			arr[i] = new Arr(i+1, i+5);
		}
		
		System.out.println("순서\ta\tb\t합\t평균\t순위");
		
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				if(arr[i].sumPrint(arr[i].a, arr[i].b) < arr[i].sumPrint(arr[j].a, arr[j].b))
				{
					arr[i].rank++;
				}
			}	
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(i+1 + "\t" + arr[i].a + "\t" + arr[i].b + "\t" + arr[i].sumPrint(arr[i].a, arr[i].b) + "\t" + String.format("%.2f", arr[i].avePrint(arr[i].a, arr[i].b)) + "\t" + arr[i].rank);
		}
	}

}*/
/*
class MethodEx{
	int min = 0;
	int even = 0;
	int odd = 0;
	
	public void incAr(int a[]) {
		for(int i = 0; i < 4; i++)
		{
			a[i] += 1;
		}
	}
	
	public int printMin(int a[]) {
		min = a[0];
		
		for(int i = 0; i < 4; i++)
		{
			if(min > a[i])
			{
				min = a[i];
			}
		}
		
		return min;
	}
	
	public int printOdd(int a[]) {
		odd = 0;
		
		for(int i = 0; i < 4; i++)
		{
			if(a[i] % 2 == 0)
			{
				odd++;
			}
		}
		
		return odd;
	}
	
	public int printEven(int a[]) {
		even = 0;
		
		for(int i = 0; i < 4; i++)
		{
			if(a[i] % 2 != 0)
			{
				even++;
			}
		}
		
		return even;
	}
}

public class Ex_20230519 {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4};
		
		MethodEx metho = new MethodEx();
		
		for(int i = 0; i < 4; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\n메소드 호출후");
		
		metho.incAr(arr);
		
		for(int i = 0; i < 4; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\n\n가장 작은 수 : " + metho.printMin(arr));
		System.out.println("\n짝수의 개수 : " + metho.printOdd(arr));
		System.out.println("\n홀수의 개수 : " + metho.printEven(arr));
	}
}*/