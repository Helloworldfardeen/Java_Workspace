package w2resource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Write a Java program to read file content line by line.
public class Problem11 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\Om Computer\\eclipse-workspace\\FileHanding\\first.txt");
		BufferedReader br = new BufferedReader(fr);
		String strLine = "";
		
		while((strLine=br.readLine())!=null)
	{
		System.out.println(strLine);
	}

}
}