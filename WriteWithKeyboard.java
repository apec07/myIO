

import java.io.*;

public class WriteWithKeyboard{
	
	public static void main(String arg[])throws IOException{
		
		System.out.println("�п�J���x�s���r�� - ");
		File myFile = new File("foo.txt");
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(myFile)));
		String str  = new BufferedReader(new InputStreamReader(System.in)).readLine();
		int len = str.length();
		out.write(str,0,len);//�n���J�����פ@��?�]���ĥΰʺA���׸m�J
		//out.newLine();
		out.close();

		System.out.println("�x�s���� ���|�ɦW��"+myFile.getAbsolutePath());
	}
	
}