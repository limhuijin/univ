import java.util.Scanner;
public class Ex_2_5_2260022 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int time = scanner.nextInt(); 	//정수 입력
		int second = time % 60;			// 60으로 나눈 나머지는 초
		int minute = (time / 60) % 60; 	// 60으로 나눈 몫을 다시 60으로 나눈 나머지는 분
		int hour = ((time / 60)) / 60;	// 60으로 나눈 몫을 다시 60으로 나눈 몫은 시간
		
		System.out.println(time + "초는 ");
		System.out.println(hour + "시간, ");
		System.out.println(minute + "분, ");
		System.out.println(second + "초입니다.");
		
		scanner.close();
	}

}
