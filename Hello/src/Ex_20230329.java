import java.util.Scanner;
public class Ex_20230329 {

	public static void main(String[] args) {
		/*
		Scanner scanner = new Scanner(System.in);
		
		int []arr = new int[7];
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = scanner.nextInt();
		}
		
		System.out.println("원소 7개");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}

		System.out.println("\n홀수");
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] % 2 != 0)
			{
				System.out.print(arr[i] + " ");
			}
		}
		
		System.out.println("\n짝수");
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] % 2 == 0)
			{
				System.out.print(arr[i] + " ");
			}
		}

		System.out.println("\n3의 배수");
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] % 3 == 0)
			{
				System.out.print(arr[i] + " ");
			}
		}*/
		/*
		Scanner scanner = new Scanner(System.in);
		
		int []arr = new int[10];
		int num = 0, sum = 0;
		

		System.out.println("\n2번 배열의 원소 출력");
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = i+3;
		}
			
		System.out.println("\n3번 3번이 짤, 홀인지");
		if(arr[2] % 2 == 0)
		{
			System.out.println(arr[2] + "는(은) 짝수입니다.");
		}
		else
		{
			System.out.println(arr[2] + "는(은) 홀수입니다.");
		}
		

		System.out.println("\n4번 5번이 3의 배수인가");
		if(arr[4] % 3 == 0)
		{
			System.out.println(arr[2] + "는(은) 짝수입니다.");
		}
		else
		{
			System.out.println(arr[2] + "는(은) 홀수입니다.");
		}
		
		System.out.println("\n5번 키보드로 인덱스 입력 후 양수, 음수");
		num = scanner.nextInt();
		
		if(num > 0)
		{
			System.out.println(num + "는(은) 양수입니다.");
		}
		else if(num == 0)
		{
			System.out.println(num + "는(은) 0 입니다.");
		}
		else
		{
			System.out.println(num + "는(은) 음수입니다.");
		}
		
		System.out.println("\n6번 모든 원소의 합");
		for(int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
		}
		
		System.out.println("\n7번 1, 3, 5 두배 저장");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print("원래 숫자 : " + arr[i]);
			
			if(i == 0 || i == 2 || i == 4)
			{
				arr[i] += arr[i];
			}
			
			System.out.println(" 이후 숫자 : " + arr[i]);
		}*/
		
		/*
		Scanner scanner = new Scanner(System.in);
		
		int []arr = new int[5];
		int sum = 0;
		
		System.out.println(arr.length + "개의 정수를 입력하세요.");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] += scanner.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
		}
		
		System.out.println("평균은 " + (float)sum / arr.length);
		*/
		/*
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
		System.out.println("가장 작은 수는" + min + "입니다.");*/
	}

}
