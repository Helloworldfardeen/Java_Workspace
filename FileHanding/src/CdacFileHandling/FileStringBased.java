package CdacFileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileStringBased {
	public static void main(String[] args) {
		try {         
			FileWriter fw = new FileWriter("CdacFileHanding.txt");
			InputStreamReader isr =new InputStreamReader(System.in);
			BufferedReader br= new BufferedReader(isr);
			String str1 = "HEllo bro !\n";
			String str2  ="What are you Doing!!\n";
			System.out.println("Your Message!!!");
			String str3 = br.readLine();
			fw.write(str1);
			fw.write(str2);
			fw.write(str3);
			System.out.println("After this out File Write is over!!!");
			fw.close();
			FileReader fR = new FileReader("CdacFileHanding.txt");
			int ch;
			ch=fR.read();
//			System.out.println((char)re);
			while(ch!=-1)
				
				
			{
//				ch++;
				System.out.print((char)ch);
				ch=fR.read();
			}
		} catch (IOException e) {
			System.out.println("Input Output Exception");
			e.printStackTrace();
		}
		
	}

}
