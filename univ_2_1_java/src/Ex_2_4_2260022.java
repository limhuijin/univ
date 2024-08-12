import java.util.Scanner;
public class Ex_2_4_2260022 {
	public static void main(String[] args) {
		System.out.print("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next(); // 문자열 읽기
		System.out.println("이름은 " + name + ", ");

		String city = scanner.next(); // 문자열 읽기
		System.out.println("도시는 " + city + ", ");

		int age = scanner.nextInt(); // 정수 읽기
		System.out.println("나이는 " + age + ", ");

		double weight = scanner.nextDouble(); // 실수 읽기
		System.out.println("체중은 " + weight + ", ");

		boolean isSingle = scanner.nextBoolean(); // 논리값 읽기
		System.out.println("독신 여부는 " + isSingle + "입니다.");
		scanner.close(); //scanner 객체 닫기
	}

}
