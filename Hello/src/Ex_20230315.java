import java.util.Scanner;
public class Ex_20230315 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		/*
		System.out.print("점수를 입력해주세요 : ");
		
		int score = scanner.nextInt();
		
		if(score >= 80)
		{
			System.out.println("합격입니다!");
		}
		else
		{
			System.out.println("불합격입니다!");
		}
		
		scanner.close();*/
		/*
		System.out.print("수를 입력해주세요 : ");
		
		int score = scanner.nextInt();
		
		if(score % 3 == 0)
		{
			System.out.println(score + "는(은) 3의 배수입니다.");
		}
		else
		{
			System.out.println(score + "는(은) 3의 배수가 아닙니다.");
		}
		
		if(score % 5 == 0)
		{
			System.out.println(score + "는(은) 5의 배수입니다.");
		}
		else
		{
			System.out.println(score + "는(은) 5의 배수가 아닙니다.");
		}*/
		/*
		char grade;
		
		System.out.print("점수를 입력해주세요 : ");
		
		int score = scanner.nextInt();
		
		if(score >= 90)
		{
			grade = 'A';
		}
		else if(score >= 80)
		{
			grade = 'B';
		}
		else if(score >= 70)
		{
			grade = 'C';
		}
		else if(score >= 60)
		{
			grade = 'D';
		}
		else
		{
			grade = 'F';
		}
		
		System.out.println("당신의 점수는 " + score + "이고\n당신의 등급은 " + grade + "입니다.");
		*/
		
		/*
		System.out.print("점수를 입력해주세요 : ");
		int score = scanner.nextInt();
		System.out.print("학년를 입력해주세요 : ");
		int grade = scanner.nextInt();
		
		if((score >= 60 && grade != 4) || (score >= 70 && grade == 4))
		{
			System.out.println("합격입니다.");
		}
		else
		{
			System.out.println("불합격입니다.");
		}*/
		
		for(int i = 0; i < 10; i++)
		{
			System.out.print(i + " ");
		}
		
		scanner.close();
	}

}
