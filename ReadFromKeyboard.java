

import java.io.*;

public class ReadFromKeyboard {

	public static void main (String[] b) throws IOException {
	
		String str ;
		System.out.println("請輸入內容 - ");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str=br.readLine();
		System.out.println("妳剛輸入的內容如下-----------------");
		System.out.println(str);
	
	}

}