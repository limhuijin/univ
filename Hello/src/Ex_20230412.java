import java.util.Scanner;

public class Ex_20230412 {
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		
		int oneNum1 = 0, oneNum2 = 0;
		int doubleNum1 = 0, doubleNum2 = 0;
		/*
		System.out.println("첫번째 행렬의 행의 길이를 입력해주세요 : ");
		oneNum2 = scanner.nextInt();
		System.out.println("첫번째 행렬의 열의 길이를 입력해주세요 : ");
		oneNum1 = scanner.nextInt();

		System.out.println("두번째 행렬의 행의 길이를 입력해주세요 : ");
		doubleNum2 = scanner.nextInt();
		System.out.println("두번째 행렬의 열의 길이를 입력해주세요 : ");
		doubleNum1 = scanner.nextInt();
		*/
		int oneArr[][] = new int[oneNum1][oneNum2];
		int doubleArr[][] = new int[doubleNum1][doubleNum2];
		
		int arr1[][] = {{1, 3, 2},
						{4, 0, 1}};
		int arr2[][] = {{1, 3},
						{0, 1},
						{5, 2}};
				
		int sum1 = 0, sum2 = 0;
		/*
		for(int i = 0; i < oneNum1; i++)
		{
			for(int j = 0; j < oneNum2; j++)
			{
				System.out.println("첫번째 행렬의, " + "행 : " + (j+1) + ", 열 : "+ (i+1) + "을(를) 입력해주세요 : ");
				oneArr[i][j] = scanner.nextInt();
			}
		}
		
		for(int i = 0; i < doubleNum1; i++)
		{
			for(int j = 0; j < doubleNum2; j++)
			{
				System.out.println("두번째 행렬의, " + "행 : " + (j+1) + ", 열 : "+ (i+1) + "을(를) 입력해주세요 : ");
				doubleArr[i][j] = scanner.nextInt();
			}
		}
		
		for(int i = 0; i < oneNum1; i++)
		{
			for(int j = 0; j < oneNum2; j++)
			{
				System.out.print(oneArr[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i < doubleNum1; i++)
		{
			for(int j = 0; j < doubleNum2; j++)
			{
				System.out.print(doubleArr[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i < oneNum1; i++)
		{
			for(int j = 0; j < oneNum2; j++)
			{
				System.out.print(doubleArr[j][0] + " * " + oneArr[i][j]);
				sum[i] += (doubleArr[j][0] * oneArr[i][j]);
				
				if(j != oneNum2 - 1)
				{
					System.out.print("  +  ");
				}
			}
			
			System.out.println(" = " + sum[i]);
		}*/
		
		for(int i = 0; i < 2; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println();
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 2; j++)
			{
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println();
		
		for(int i = 0; i < 2; i++)
		{
			sum1 = 0; 
			sum2 = 0;
			
			for(int j = 0; j < 3; j++)
			{
				sum1 += (arr1[i][j] * arr2[j][0]);	
				sum2 += (arr1[i][j] * arr2[j][1]);		
			}
			
			System.out.println(sum1 + "\t" + sum2);
		}
	}
}
