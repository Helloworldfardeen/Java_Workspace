package CdacFileHandling;

import java.io.*;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
//import java.sql.SQLSyntaxErrorException;

public class MyStringWrite {
	public static void main(String[] args) {
		try {
			File n=new File("älok.txt");
			FileWriter fw = new FileWriter(n);
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader (isr);
            System.out.println("Your Message!!");			
			String str = br.readLine();
			fw.write(str);
			fw.close();
			FileReader fr = new FileReader(n);
			int ch = fr.read();
			while(ch!=-1)
			{
				System.out.print((char)ch);
				ch = fr.read();
			}
			
		    	
		}catch (IOException e) {
			System.out.println("Input Output Exception");
			e.printStackTrace();
		}
	}

	
}
