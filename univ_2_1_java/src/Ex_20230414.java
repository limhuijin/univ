public class Ex_20230414 {
	public static void main(String args[])
	{
		int arrA[][] = {{1, 2, 3}, 
					   {4, 5, 6}, 
					   {7, 8, 9}};
		
		char arrB[][] = {{'x', 'y'}, 
						 {'z', 'w'}};
		
		int arrC[][] = {{1, 1, 1, 1},
						{-3, 5, -2, 7}};
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				System.out.print(arrA[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				System.out.print(arrA[j][i] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\n");
		
		for(int i = 0; i < 2; i++)
		{
			for(int j = 0; j < 2; j++)
			{
				System.out.print(arrB[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		
		for(int i = 0; i < 2; i++)
		{
			for(int j = 0; j < 2; j++)
			{
				System.out.print(arrB[j][i] + " ");
			}
			System.out.println();
		}

		System.out.println("\n");
		
		for(int i = 0; i < 2; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				System.out.print(arrC[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println();
		
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 2; j++)
			{
				System.out.print(arrC[j][i] + "\t");
			}
			System.out.println();
		}
	}
}
