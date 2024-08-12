import java.util.Scanner;
public class Ex_20230317_4_2260022 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num1 = 0;
		
		System.out.print("숫자를 입력해주세요 : ");
		num1 = scanner.nextInt();
		
		if(num1 % 2 == 0)
		{
			System.out.print("짝수입니다.");
		}
		else
		{
			System.out.print("홀수입니다.");
		}
	}
}
