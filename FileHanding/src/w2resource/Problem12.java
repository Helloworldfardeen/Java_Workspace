package w2resource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Write a Java program to read a plain text file.
public class Problem12 {
public static void main(String[] args) throws Throwable {
	StringBuilder sb  = new StringBuilder();
	String strline = "";
	FileReader fr = new FileReader("first.txt");
	BufferedReader br = new BufferedReader(fr);
	while(strline!= null)
	{
		sb.append(strline);
		sb.append(System.lineSeparator());
		strline= br.readLine();
		System.out.println(strline);
	}
	
}
}
