

import java.io.*;

public class ReadFromKeyboard {

	public static void main (String[] b) throws IOException {
	
		String str ;
		System.out.println("�п�J���e - ");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str=br.readLine();
		System.out.println("�p���J�����e�p�U-----------------");
		System.out.println(str);
	
	}

}