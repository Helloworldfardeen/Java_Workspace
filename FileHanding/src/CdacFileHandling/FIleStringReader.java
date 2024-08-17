package CdacFileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FIleStringReader {
	public static void main(String[] args) {
		try {
		FileReader fr =  new FileReader("CdacFileHanding.txt");
		BufferedReader br = new BufferedReader(fr);
          String str1 =  br.readLine();
          String str2 =  br.readLine();
          System.out.println(str1);
          System.out.println(str2);
             
		
		}
		catch (IOException e){
			System.out.println("Input Output Exception");
			e.printStackTrace();
		
	}

	

}
}