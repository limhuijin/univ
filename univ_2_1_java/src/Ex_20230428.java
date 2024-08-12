class meso{
	int su1, su2, su3, sum, sumX, odd, max;
	double ave;
	
	meso(){
	}
	
	public void printPrint(int num) {
		
		printSum();
		printSumX(sum);
		printOdd(sum);
		printMax();
		System.out.println(num + "\t" + su1 + "\t" + su2 + "\t" + su3 + "\t" + sum + "\t" + sumX + "\t" + odd + "\t\t" + max);
	}
	
	public void printSum() {
		
		sum = su1 + su2 + su3;
		
	}
	
	public void printSumX(int num) {
		
		sumX = 0;
		
		for(int i = 0; i <= num; i++)
		{
			sumX += i;
		}
		
	}
	
	public void printOdd(int num) {
		
		odd = 0;
		
		for(int i = 1; i <= su2; i++)
		{
			if(i % 2 == 1)
			{
				odd += i;
			}
		}
	}
	
	public void printMax() {
		
		if(su1 > su2)
		{
			max = su1;
		}
		else
		{
			max = su2;
		}
		
	}
	
}	

public class Ex_20230428 {

	public static void main(String[] args) {
		meso[] obj = new meso[5];
		
		System.out.println("순서\t변수1\t변수2\t변수3\t합\t0부터의합\t변수 2의 홀수의 개수\t변수 1, 2중 큰 수");
		
		for(int i = 0; i < 5; i++)
		{
			obj[i] = new meso();
	
			obj[i].su1 = 10 + (i*10);
			obj[i].su2 = 20 + (i*10);
			obj[i].su3 = 30 + (i*10);
			
			obj[i].printPrint(i+1);
		}

	}

}
