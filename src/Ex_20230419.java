import java.util.Iterator;
import java.util.Scanner;

public class Ex_20230419 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1 = 0, num2 = 0;
		int add = 0;
		
		System.out.println("숫자 1번을 입력해 주세요 : ");
		num1 = scanner.nextInt();
		System.out.println("숫자 2번을 입력해 주세요 : ");
		num2 = scanner.nextInt();
		
		System.out.print("공약수 : ");
		
		for(int i = 1; i < 100; i++)
		{
			if(num1 % i == 0 && num2 % i == 0)
			{
				System.out.print(i + ", ");
				add = i;
			}
		}	

		System.out.print("최대 공약수 : " + add);
	}

}
