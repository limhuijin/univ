import java.util.Scanner;
public class Ex_20230331_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//8.  크기가5인 정수 배열을 생성한다
		int []arr = new int[5];
		
		//9.   배열의 원소를 키보드로 입력한다.
		System.out.println(arr.length + "개의 정수를 입력하세요.");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = scanner.nextInt();
		}
		
		//10.  배열의 원소를 출력한다.
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		//11. 배열의 원소 중 홀 수만 출력한다
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] % 2 != 0)
			{
				System.out.println(arr[i]);
			}
		}
		
		//12. 배열의 원소 중 짝 수만 출력한다.
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] % 2 == 0)
			{
				System.out.println(arr[i]);
			}
		}
		
		//13. 배열의 원소중 3의 배수만 출력한다.
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] % 3 == 0)
			{
				System.out.println(arr[i]);
			}
		}
	}

}
