import java.util.Scanner;
public class Ex_20230317_2_2260022 {
	
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num1 = 0, num2 = 0, addsum = 0;
		
		System.out.print("숫자 1을 입력해주세요 : ");
		num1 = scanner.nextInt();
		System.out.print("숫자 2을 입력해주세요 : ");
		num2 = scanner.nextInt();
		
		addsum = sum(num1, num2);
		System.out.print(addsum);
	}
}
