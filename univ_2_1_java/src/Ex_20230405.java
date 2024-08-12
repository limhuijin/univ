import java.util.Scanner;

public class Ex_20230405 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int count = 0, printCount = 1, rankCount = -1;
		
		System.out.println("입력할 학생의 수를 입력해주세요 : ");
		count = scanner.nextInt();
		
		int arrSub[][] = new int[3][count]; //0번 국어, 1번 수학, 2번 영어
		String name[] = new String[count];
		int arrSum[] = new int[count]; 	
		int arrAver[] = new int[count];
		int rank[] = new int [count]; //0번 국어, 1번 수학, 2번 영어, 3번 전체
		
		for(int j = 0; j < count; j++)
		{
			System.out.println("이름(한글)을 입력해주세요 : ");
			name[j] = scanner.next();
			System.out.println("국어(정수)의 점수를 입력해주세요 : ");
			arrSub[0][j] = scanner.nextInt();
			System.out.println("수학(정수)의 점수를 입력해주세요 : ");
			arrSub[1][j] = scanner.nextInt();
			System.out.println("영어(정수)의 점수를 입력해주세요 : ");
			arrSub[2][j] = scanner.nextInt();
			
			arrSum[j] += (arrSub[0][j] + arrSub[1][j] + arrSub[2][j]);
			arrAver[j] = (arrSum[j] / count);
		}
		
		System.out.println("보고 싶은 순위를 입력해주세요 국어[1] 수학[2] 영어[3] 전체[4]: ");
		rankCount = scanner.nextInt();
		System.out.println();
		
		for(int i = 0; i < count; i++)
		{
			rank[i] = 1;
			for(int j = 0; j < count; j++)
			{
				if(rankCount == 1)
				{
					if(arrSub[0][i] < arrSub[0][j])
					{
						rank[i]++;
					}
				}
				else if(rankCount == 2)
				{
					if(arrSub[1][i] < arrSub[1][j])
					{
						rank[i]++;
					}
				}
				else if(rankCount == 3)
				{
					if(arrSub[2][i] < arrSub[2][j])
					{
						rank[i]++;
					}
				}
				else if(rankCount == 4)
				{
					if(arrAver[i] < arrAver[j])
					{
						rank[i]++;
					}
				}
			}
		}
		
		System.out.println("이름\t국어\t수학\t영어\t합\t평균\t순위");

		for(int j = 0; j < count; j++)
		{
			for(int i = 0; i < count; i++)
			{	
				if(printCount == rank[i]) {
					System.out.println(name[i] + "\t"+ arrSub[0][i] + "\t" + arrSub[1][i] + "\t" + arrSub[2][i] + "\t" + arrSum[i] + "\t" + arrAver[i] + "\t" + rank[i]);
				
					printCount++;
				}
			}
		}
		
		/*
		Scanner scanner = new Scanner(System.in);
		
		int num1, num2, num3, num4;
		int temp = 0;
		
	
		System.out.println("정수 1번을 입력해주세요 : ");
		num1 = scanner.nextInt();
		System.out.println("정수 2번을 입력해주세요 : ");
		num2 = scanner.nextInt();
		System.out.println("정수 3번을 입력해주세요 : ");
		num3 = scanner.nextInt();
		System.out.println("정수 4번을 입력해주세요 : ");
		num4 = scanner.nextInt();

		for(int i = 0; i < 6; i++)
		{
			if(num1 < num2)
			{
				temp = num1;
				num1 = num2;
				num2 = temp;
			}
			else if(num2 < num3)
			{
				temp = num2;
				num2 = num3;
				num3 = temp;
			}
			else if(num3 < num4)
			{
				temp = num3;
				num3 = num4;
				num4 = temp;
			}
		}
		
		System.out.println("내림차순 : " + num1 + " > " +  num2 + " > " + num3 + " > " + num4);
		
		for(int i = 0; i < 6; i++)
		{
			if(num1 > num2)
			{
				temp = num1;
				num1 = num2;
				num2 = temp;
			}
			else if(num2 > num3)
			{
				temp = num2;
				num2 = num3;
				num3 = temp;
			}
			else if(num3 > num4)
			{
				temp = num3;
				num3 = num4;
				num4 = temp;
			}
		}
		
		System.out.println("오름차순 : " + num1 + " > " +  num2 + " > " + num3 + " > " + num4);*/
	}

}
