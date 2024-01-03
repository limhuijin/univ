import java.io.*;

public class Ex_20231130 {
	public static void main(String[] args) {
//		FileReader fin = null;
//		try {
//			fin = new FileReader("c:\\windows\\system.ini");
//			int c;
//			while((c = fin.read()) != -1) {
//				System.out.print((char)c);
//			}
//			fin.close();
//		}
//		catch(IOException e) {
//			System.out.println("입출력 오류");
//		}

		String str = new String("");
		int sum = 0;
		
		FileReader fin = null;
		
		try {
			fin = new FileReader("C:\\Users\\USER\\java.txt");
			int c;
			while((c = fin.read()) != -1) {
				str += ((char)c);
			}
			fin.close();
		}
		catch(IOException e) {
			System.out.println("입출력 오류");
		}

		String [] charNum = str.split(", ");
		
		for(int i = 0; i < 5; i++) {
			sum += Integer.parseInt(charNum[i]);
		}

		System.out.println("합 : " + sum);
	}
}
