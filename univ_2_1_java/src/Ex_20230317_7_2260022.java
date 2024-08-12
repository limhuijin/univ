import java.util.Scanner;
public class Ex_20230317_7_2260022 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0, num = 0;
		
		System.out.print("숫자를 입력해주세요.");
		num = scanner.nextInt();
		
		for(int i = 0; i < num; i++)
		{
			if((i + 1) % 3 == 0)
			{
				sum++;
			}
		}
		
		System.out.print("3의 배수의 갯수는 " + sum + "입니다.");
	}
}
