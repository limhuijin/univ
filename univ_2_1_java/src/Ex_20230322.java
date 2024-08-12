import java.util.Scanner;
//컨트롤 쉬프트 o
public class Ex_20230322 {
	
	public static int sum1Num(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int sum2Num(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	public static int aver(int num1, int num2, int num3) {
		return (num1 + num2 + num3) / 3;
	}
	
	public static void main(String[] args) {
		/* 1
		int sum = 0;
		
		for(int i = 1; i <= 100; i++)
		{
			sum += i;
		}
		
		System.out.println("1부터 100까지의 합 : " + sum);
		*/
		
		/*2
		Scanner scanner = new Scanner(System.in);
		
		int num1 = 0, num2 = 0, num3 = 0, addsum = 0, aversum = 0;
		
		System.out.print("숫자 1을 입력해주세요 : ");
		num1 = scanner.nextInt();
		System.out.print("숫자 2을 입력해주세요 : ");
		num2 = scanner.nextInt();
		System.out.print("숫자 3을 입력해주세요 : ");
		num3 = scanner.nextInt();
		
		System.out.println("정수1 : " + num1 + ", 정수2 : " + num2 + ", 정수3 : " + num3);
		
		addsum = sum2Num(num1, num2, num3);
		aversum = aver(num1, num2, num3);
		System.out.println("세 개의 정수의 합 : " + addsum);
		System.out.println("세 개의 정수의 평균 : " + aversum);*/
		
		/*
		Scanner scanner = new Scanner(System.in);
		
		int num1 = 0, num2 = 0, addsum = 0;
		
		System.out.print("숫자 1을 입력해주세요 : ");
		num1 = scanner.nextInt();
		System.out.print("숫자 2을 입력해주세요 : ");
		num2 = scanner.nextInt();
		
		addsum = sum1Num(num1, num2);
		
		if(addsum % 2 == 0)
		{
			System.out.println(addsum + "은 짝수입니다.");
		}
		else
		{
			System.out.println(addsum + "은 홀수입니다.");
		}*/
		
		
		/*
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 1; i < 10; i++)
		{
			for(int j = 1; j < 10; j++)
			{
				System.out.print(i + "*" + j + "=" + i*j);
				System.out.print("\t");
			}
			
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		*/
		/*
		for(int i = 1; i < 10; i++)
		{
			for(int j = 1; j < 10; j++)
			{
				System.out.print(j + "*" + i + "=" + j*i);
				System.out.print("\t");
			}
			
			System.out.println();
		}*/
		
		/*
		System.out.println();
		System.out.println();
		*/
		
/*
		int num = 0;
		
		System.out.print("원하는 숫자를 입력해주세요 : ");
		num = scanner.nextInt();
		
		for(int i = 1; i < 10; i++)
		{
			System.out.println(num + "*" + i + "=" + num*i); //세로 버전
			
			//System.out.println(num + "*" + i + "=" + num*i); //가로 버전
			//System.out.print("\t"); 
		}
		*/
		/*
		//if 버전
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 5개 입력하세요");
		int sum = 0;
		
		for(int i = 0; i < 5; i++)
		{
			int n = scanner.nextInt();
			if(n <= 0)
			{
				continue;
			}
			else
			{
				if(i < 4) 
				{
					System.out.print(n + " + ");
				}
				else 
				{
					System.out.print(n);
				}
				sum += n;
			}	
		}
		
		System.out.println("의 합은 " + sum);*/
		
		/* 배열 버전
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 5개 입력하세요");
		int[]num = new int[5];
		int sum = 0;
		
		for(int i = 0; i < 5; i++)
		{
			num[i] = scanner.nextInt();
			
			if(num[i] <= 0)
			{
				continue;
			}
			else
			{
				sum += num[i];
			}	
		}
		
		
		for(int j = 0; j < 4; j++)
		{
			System.out.print(num[j] + " + ");
		}
		System.out.print(num[4]);
		System.out.println("의 합은 " + sum);*/
		
		/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit를 입력하면 종료합니다.");
		
		while(true)
		{
			System.out.print(">>");
			String text = scanner.nextLine();
			System.out.println("입력된 문자열은 = " + text);
			
			if(text.equals("exit"))
			{
				break;
			}
		}
		
		System.out.println("종료합니다.");*/
	}
}
