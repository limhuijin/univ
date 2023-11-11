import java.util.Scanner;

class Student{
	
	String name;
	int scoureJava;
	int scoureC;
	int sum;
	double ave;
	
	Student(){
		
	}
	
	public int studentSum(int java, int c) {
		return (java + c);
	}
	
	public double studentAve(int sum) {
		return (double)sum / 2;
	}
	
	public void studentPrint(int num, String name, int scoureJava, int scoureC, int sum, double ave) {
		System.out.println(num + "\t" + name + "\t" + scoureJava + "\t" + scoureC + "\t" + sum + "\t" + ave);
	}
}	

public class Ex_20230510 { 

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student[] no = new Student[3];
		
		for(int i = 0; i < 3; i++)
		{
			no[i] = new Student();
			
			System.out.println(i+1 + "번 학생의 이름을 입력해주세요 : ");
			no[i].name = scanner.next();
			
			System.out.println(i+1 + "번 학생의 java점수를 입력해주세요 : ");
			no[i].scoureJava = scanner.nextInt();
			
			System.out.println(i+1 + "번 학생의 c점수를 입력해주세요 : ");
			no[i].scoureC = scanner.nextInt();
			
			no[i].sum = no[i].studentSum(no[i].scoureJava, no[i].scoureC);
			no[i].ave = no[i].studentAve(no[i].sum);
		}
		
		System.out.println("순서\t이름\t자바\tc\t합\t평균");
		
		for(int i = 0; i < 3; i++)
		{
			no[i].studentPrint(i+1, no[i].name, no[i].scoureJava, no[i].scoureC, no[i].sum, no[i].ave);
		}
	}
}
