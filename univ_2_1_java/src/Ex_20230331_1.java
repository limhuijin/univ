import java.util.Scanner;
public class Ex_20230331_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 1.  크기가 10인 배열을 선언하고 초기화 한다
		int []arr = new int[10];
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = scanner.nextInt();
		}
		
		// 2.  배열의 원소를 출력한다
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();

		//3.  인텍스 3번의 원소가 홀수 인지 짝수 인지 구별한다
		if(arr[3] % 2 == 0)
		{
			System.out.println("인텍스 3번의 원소는 짝수");
		}
		else
		{
			System.out.println("인텍스 3번의 원소는 홀수");
		}
		
		//4.  인텍스 5번이 3의 배수 인지 출력한다.
		if(arr[5] % 3 == 0)
		{
			System.out.println("인텍스 5번의 원소는 3의 배수");
		}
		else
		{
			System.out.println("인텍스 5번의 원소는 3의 배수가 아님");
		}
		
		//5. 키보드로 인덱스를 입력받는다.
	    //입력받은 인덱스의 원소가 양수 인지 음수 인지 출력 한다.
		
		int num = scanner.nextInt();
		
		if(arr[num] > 0)
		{
			System.out.println("양수");
		}
		else if (arr[num] == 0)
		{
			System.out.println(arr[num] + "은 0");
		}
		else
		{
			System.out.println("음수");
		}
		
		//6.  배열의 원소의 모든 합을 구한다.
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
		}
	
		System.out.println("배열의 원소의 모든 합 : " + sum);
		
		//7.  배열의  인텍스 1, 3, 5에 해당 하는 원소에 원래값에  2배를 저장하고 출력한다.
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print("원래 숫자 : " + arr[i]);
			
			if(i == 1 || i == 3 || i == 5)
			{
				arr[i] += arr[i];
			}
			
			System.out.println(" 이후 숫자 : " + arr[i]);
		}
	}

}
