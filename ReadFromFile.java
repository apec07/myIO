import java.io.*;

public class ReadFromFile {
	

	public static void main(String args[]) throws IOException {
			
			System.out.println("Test");	
			FileReader fr = new FileReader("text.txt");
			int c;
			while((c=fr.read())!=-1){
				System.out.print((char)c);		
			}
			fr.close();
	}
}