	/*import java.util.Scanner;
	public class Ex_20230912 {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("수를 입력하시오 : ");
			int number = scanner.nextInt();
			int sum = 0;
			
			if (number % 3 == 0) 
			{
				System.out.println("3의 배수입니다." + " 입력된 수의 2배 : " + (number*2));
	
			}
			else
			{
				System.out.println("3의 배수가 아닙니다." + " 입력된 수의 2배 : " + (number*3));
			}
	
			if (number % 2 == 0) 
			{
				System.out.println("짝수입니다.");
				
				for(int i = 1; i <= number; i = i + 2)
				{
					sum += i;
				}
				
				System.out.println("홀수만의 덧셈 : " + sum);
			}
			else
			{
				System.out.println("홀수입니다.");
				
				for(int i = 1; i <= number; i++)
				{
					if(i % 3 == 0)
					{
						sum += i;
					}
				}
				
				System.out.println("3의 배수 덧셈 : " + sum);
			}
			
			if (number % 5 == 0) 
			{
				System.out.println("5의 배수입니다.");
			}
			else
			{
				System.out.println("5의 배수가 아닙니다.");
			}
			
			
			
			
		}
	
	}*/

import java.util.Scanner;
public class Ex_20230912 {

	public static void main(String[] args) {
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력한 후 마지막에 0을 입력하세요");
		
		int num = -1, sum = 0, count = 0, doublecount = 0, triplecount = 0;
		int []save = new int[100];
		
		while(num != 0)
		{
			num = scanner.nextInt();
			sum += num;
			
			if(num % 2 == 0) 
			{
				doublecount++;
			}
			
			if(num % 3 == 0)
			{
				triplecount++;
			}	
			
			save[count++] = num;
		}
		
		if((count - 1) == 0)
		{
			System.out.print("입력된 수가 없습니다.");
		}
		else
		{
			for(int i = 0; i < count-1; i++)
			{
				System.out.print(save[i] + " ");
			}
			System.out.println();
			System.out.println("수의 갯수 : " + (count - 1));
			System.out.println("총합 : " + sum );
			System.out.println("평균 값 : " + (double)sum / (count - 1));
			//System.out.println("짝수의 갯수 : " + doublecount);
			//System.out.println("3의 배수의 갯수 : " + triplecount);
		}*/
		Scanner scanner = new Scanner(System.in);
		
		int []arr = new int[5];
		
		int max = 0, min = 0, twomax = 0;
		
		for(int i = 0; i < 5; i++)
		{
			arr[i] = scanner.nextInt();
			
			if(arr[i] > max)
			{
				twomax = max;
				max = arr[i];
			}
			
			if(i == 0 || arr[i] < min)
			{
				min = arr[i];
			}
		}
		
		System.out.println("가장 큰 수는" + max + "입니다.");
		System.out.println("두 번째 큰 수는" + twomax + "입니다.");
		System.out.println("가장 작은 수는" + min + "입니다.");
	}

}
