import java.util.Scanner;

public class Ex_20230407 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int arr1[][] = {{1, 2, 3}, 
						{4, 5, 6}, 
						{7, 8, 9}};
		int arr2[][] = {{9, 8, 7}, 
						{6, 5, 4}, 
						{3, 2, 1}};
		int horSum[] = new int[3];
		int verSum[] = new int[3];
		
		int hor = -1, ver = -1;
		int count = -1;
		
		System.out.println("행을 보고 싶으시면 1, 열을 보고 싶으시면 2, 합 평균을 보고 싶으시다면 3을 입력해주세요 : ");
		count = scanner.nextInt();
		
		if(count == 1)
		{
			System.out.println("보고 싶으신 행의 숫자를 입력해주세요 : ");
			hor = scanner.nextInt();
			
			for(int i = 0; i < 3; i++)
			{
				System.out.println(arr1[i][hor - 1] + " + " + arr2[i][hor - 1] + " = " + (arr1[i][hor - 1] + arr2[i][hor - 1]));
			}
		}
		else if (count == 2)
		{
			System.out.println("보고 싶으신 열의 숫자를 입력해주세요 : ");
			ver  = scanner.nextInt();
			
			for(int i = 0; i < 3; i++)
			{
				System.out.print(arr1[ver-1][i] + " + " + arr2[ver-1][i] + " = " + (arr1[ver-1][i] + arr2[ver-1][i]) + "\t");
			}
		}
		else if(count == 3)
		{
			for(int i = 0; i < 3; i++)
			{
				for(int j = 0; j < 3; j++)
				{
					horSum[i] += arr1[i][j] + arr2[i][j];
					verSum[i] += arr1[j][i] + arr2[j][i];
					
					System.out.print(arr1[i][j] + "\t");				
				}
				
				System.out.print("\t");	
				
				for(int j = 0; j < 3; j++)
				{
					System.out.print(arr2[i][j] + "\t");
				}
				
				System.out.println("\t" + (horSum[i] / 3));
			}
			
			System.out.println();
			
			for(int i = 0; i < 3; i++)
			{			
				for(int j = 0; j < 3; j++)
				{
					System.out.print(arr2[i][j] + "\t");
				}
				
				System.out.println();
			}
			
			System.out.println();
			
			for(int i = 0; i < 3; i++)
			{
				System.out.print((verSum[i] / 3) + "\t");
			}
			
		}
	}
}
