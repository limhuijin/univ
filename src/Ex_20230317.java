
public class Ex_20230317 {

	public static void main(String[] args) {
		
		int sum = 0;

		for(int i = 0; i < 10; i++)
		{
			System.out.print(i + 1);
			
			if(i != 9)
			{
				System.out.print('+');
			}
			else
			{
				System.out.print('=');
			}
			
			sum += i + 1;
		}

		System.out.print(sum);
	}

}

