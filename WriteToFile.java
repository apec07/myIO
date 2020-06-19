
import java.io.*;

public class WriteToFile {
	

	public static void main(String args[]) throws IOException {
			
			System.out.println("Test");	
			String str = "This is my IO test\n";
			FileWriter fw = new FileWriter("text.txt",true);
			
			fw.write(str);
			fw.flush();
			fw.close();
			System.out.println("Finish");	
	}
}
