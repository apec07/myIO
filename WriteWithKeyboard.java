

import java.io.*;

public class WriteWithKeyboard{
	
	public static void main(String arg[])throws IOException{
		
		System.out.println("�п�J���x�s���r�� - ");
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("foo.txt")));
		String str  = new BufferedReader(new InputStreamReader(System.in)).readLine();
		int len = str.length();
		out.write(str,0,len);//�n���J�����פ@��?
		//out.newLine();
		out.close();
		System.out.println("�x�s���� ���|�ɦW��TBD\\foo.txt");
	}
	
}