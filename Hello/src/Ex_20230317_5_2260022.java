import java.util.Scanner;
public class Ex_20230317_5_2260022 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0, num = 0;
		
		System.out.print("숫자를 입력해주세요.");
		num = scanner.nextInt();
		
		for(int i = 0; i < num; i++)
		{
			sum += i+1;
		}
		
		System.out.print("총 합은 " + sum + "입니다.");
		
	}
}
