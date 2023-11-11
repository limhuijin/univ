import java.util.Scanner;
public class Ex_20230317_8_2260022 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력한 후 마지막에 -1을 입력하세요");
		
		int num = 0, sum = 0, count = 0, doublecount = 0, triplecount = 0;
		
		while(num != -1)
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
			count++;
		}
		
		if((count - 1) == 0)
		{
			System.out.print("입력된 수가 없습니다.");
		}
		else
		{
			System.out.println("수의 갯수 : " + (count - 1));
			System.out.println("평균 값 : " + (double)sum / (count - 1));
			System.out.println("짝수의 갯수 : " + doublecount);
			System.out.println("3의 배수의 갯수 : " + triplecount);
		}
	}

}