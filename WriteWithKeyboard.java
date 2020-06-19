

import java.io.*;

public class WriteWithKeyboard{
	
	public static void main(String arg[])throws IOException{
		
		System.out.println("請輸入欲儲存的字串 - ");
		File myFile = new File("foo.txt");
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(myFile)));
		String str  = new BufferedReader(new InputStreamReader(System.in)).readLine();
		int len = str.length();
		out.write(str,0,len);//要跟輸入的長度一樣?因此採用動態長度置入
		//out.newLine();
		out.close();

		System.out.println("儲存完畢 路徑檔名為"+myFile.getAbsolutePath());
	}
	
}