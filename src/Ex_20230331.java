import java.util.Scanner;
public class Ex_20230331 {

	public static void main(String[] args) {
		/*
		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[7];
		
		for(int i = 0; i < 7; i++)
		{
			arr[i] = scanner.nextInt();
		}
		
		for(int j = 0; j < 7; j++)
		{
			System.out.println(arr[j]);	
		}
		
		System.out.println("인덱스 0, 3의 덧셈 = " + arr[0] + arr[3]);	
		
		*/
		
		/*Scanner scanner = new Scanner(System.in);
		
		int arr[][] = new int[3][4];
		int arrsum[] = new int[7];
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				arr[i][j] = scanner.nextInt();
			}
		}
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				System.out.print(arr[i][j] + "\t");		
				
				arrsum[i] += arr[i][j];
				
				if(j == 0)
				{
					arrsum[3] += arr[i][j];
				}
				else if(j == 1)
				{
					arrsum[4] += arr[i][j];
				}
				else if(j == 2)
				{
					arrsum[5] += arr[i][j];
				}
				else
				{
					arrsum[6] += arr[i][j];
				}				
			}
			
			System.out.println(arrsum[i] + "\t");		
		}
		
		for(int i = 0; i < 4; i++)
		{
			System.out.print(arrsum[i + 3] + "\t");			
		}*/
		
		/*
		Scanner scanner = new Scanner(System.in);
		
		int []arr = new int[5];
		
		int max = 0, min = 0, twomax = 0;
		
		for(int j = 0; j < 5; j++)
		{
			arr[j] = scanner.nextInt();
			
			if(arr[j] > max)
			{
				twomax = max;
				max = arr[j];
			}
			
			if(j == 0 || arr[j] < min)
			{
				min = arr[j];
			}
		}
		
		System.out.println("가장 큰 수는 " + max + "입니다.");
		System.out.println("두 번째 큰 수는 " + twomax + "입니다.");
		System.out.println("가장 작은 수는 " + min + "입니다.");
		*/
		/*
		int arr[] = new int[5];
		
		for(int i = 3; i < 8; i++)
		{
			arr[i - 3] = i;
		}
		
		for(int i = 0; i< 5; i++)
		{
			for(int j = 0; j < 5 - i; j++)
			{
				System.out.print(arr[j]);
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 5; i > 0; i--)
		{
			for(int j = 0; j < 6 - i; j++)
			{
				System.out.print(arr[j]);
			}
			
			System.out.println();
		}*/
		
		/*
		Scanner scanner = new Scanner(System.in);
		
		int a, b;
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		System.out.println("a = " + a + ", b = " + b);
		
		System.out.println("두 수의 합 = " + (a + b));
		
		int num1, num2, num3;
		
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		num3 = scanner.nextInt();
		
		if(num1 % 2 == 0)
		{
			System.out.println(num1 + "은 짝수입니다.");
		}
		else
		{
			System.out.println(num1 + "은 홀수입니다.");
		}
		
		if(num2 % 2 == 0)
		{
			System.out.println(num2 + "은 짝수입니다.");
		}
		else
		{
			System.out.println(num2 + "은 홀수입니다.");
		}
		
		if(num3 % 2 == 0)
		{
			System.out.println(num3 + "은 짝수입니다.");
		}
		else
		{
			System.out.println(num3 + "은 홀수입니다.");
		}
		
		System.out.println("세 수의 합 = " + (num1 + num2 + num1));
		*/
	}

}
