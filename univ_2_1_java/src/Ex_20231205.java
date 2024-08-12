import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex_20231205 {

	public static void main(String[] args) {

//		InputStreamReader in = null;
//		FileInputStream fin = null;
//		
//		try {
//			fin = new FileInputStream("C:\\Users\\USER\\Desktop\\임희진 - 자료\\대학\\수업\\2-2\\자바\\hangul.txt");
//			in = new InputStreamReader(fin, "UTF-8");
//			//in = new InputStreamReader(fin, "US-A");
//		
//			int c;
//			
//			System.out.println("인코딩 문자 집합은 " + in.getEncoding());
//			while((c = in.read()) != -1) {
//				System.out.println((char)c);
//			}
//			fin.close();
//			in.close();
//		}
//		catch(IOException e) {
//			System.out.println("입출력 오류");
//		}

//		Scanner sc = new Scanner(System.in);
//		FileWriter fout = null;
//		
//		try {
//			fout = new FileWriter("C:\\Users\\USER\\Desktop\\임희진 - 자료\\대학\\수업\\2-2\\자바\\hangul.txt");
//			int c;
//			
//			while(true) {
//				String line = sc.nextLine();
//				if(line.length() == 0) {
//					break;
//				}
//				
//				fout.write(line, 0, line.length());
//				fout.write("\r\n", 0, 2);
//			}
//			fout.close();
//		}
//		catch(IOException e) {
//			System.out.println("입출력 오류");
//		}
		
//		FileReader fin = null;
//		
//		try {
//			fin = new FileReader("C:\\Users\\USER\\Desktop\\임희진 - 자료\\대학\\수업\\2-2\\자바\\hangul.txt");
//			int c;
//			BufferedOutputStream out = new BufferedOutputStream(System.out, 5);
//			
//			while((c = fin.read()) != -1) {
//				out.write(c);
//			}
//			new Scanner(System.in).nextLine();
//			out.flush();
//			fin.close();
//			out.close();
//		}
//		catch(IOException e) {
//			System.out.println("입출력 오류");
//		}
		
		Scanner sc = new Scanner(System.in);
		FileWriter fout = null;
		FileReader fin = null;
		
		int c;
		String str = new String();
		int sum = 0;
		int evenSum = 0;
		int count = 0;
		
		try {
			fout = new FileWriter("C:\\Users\\USER\\Desktop\\임희진 - 자료\\대학\\수업\\2-2\\자바\\hangul.txt");
			
			while(true) {
				String line = sc.nextLine();
					
				fout.write(line, 0, line.length());
				fout.write("\r\n", 0, 2);
				break;
			}

			fout.close();
			fin = new FileReader("C:\\Users\\USER\\Desktop\\임희진 - 자료\\대학\\수업\\2-2\\자바\\hangul.txt");
			while((c = fin.read()) != -1) {
				str += ((char)c);
			}

			String s = str.trim();
		    String charNum[] = s.split(" ");
			
		    for(int i = 0; i < charNum.length; i++)
			{		
		    	System.out.println(charNum[i]);
				if(Integer.parseInt(charNum[i]) % 2 == 1) {
					evenSum += Integer.parseInt(charNum[i]);
					count++;
				}
				
				sum += Integer.parseInt(charNum[i]);
			}
			
			System.out.println("정수 배열의 합 : " + sum);
			System.out.println("정수 배열의 홀수합 : " + evenSum);
			System.out.println("정수 배열의 홀수의 갯수 : " + count);
		    
			fin.close();
		}
		catch(IOException e) {
			System.out.println("입출력 오류");
		}
		
		
	}
}
