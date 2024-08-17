package w2resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//. Write a Java program to read input from the Java console.
public class Problem08 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input Your Name:");
		String str = br.readLine();
		System.out.println(" Your Name:"+str);
		
	}

}
