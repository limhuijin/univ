import java.util.Scanner;
/*
public class Ex_20230914 {
	
	public static int sum_arr(int []arr)
	{
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
		}
		
		return sum;
	}
	
	public static void sumEvne(int []arr)
	{
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] % 2 == 0)
			{
				sum += arr[i];
			}
		}
		
		System.out.println(sum);
	}
	public static void sumIndex(int []arr)
	{
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			if(i % 2 == 1)
			{
				sum += arr[i];
			}
		}
		
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		int []arr = new int[5];
		
		
		for(int i = 0; i < 5; i++)
		{
			arr[i] = scanner.nextInt();
		}
		
		for(int j = 0; j < 5; j++)
		{
			System.out.println(j + "번째 수 : " + arr[j]);
		}
		
		System.out.println("배열 원소의 합 : " + sum_arr(arr));
		
		sumEvne(arr);
		sumIndex(arr);
	}

}*/


class Ex {
	int a;
	
	void prt() {
		System.out.println("prt");
	}
}

public class Ex_20230914 {
	public static void main(String[] args) {
		Ex ob1 = new Ex();
		Ex ob2 = new Ex();
		Ex ob3 = new Ex();
		
		ob1.a = 10;
		ob1.prt();
		ob2.a = 20;
		ob2.prt();
		ob3.a = 30;
		ob3.prt();
		
	}
}

