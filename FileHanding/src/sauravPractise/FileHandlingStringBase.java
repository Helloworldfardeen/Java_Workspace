package sauravPractise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingStringBase {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("Fardeen.txt");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your messages");
		String msg1;
		String msg2;
		
		fw.write(msg1 = sc.nextLine()+'\n');
		fw.write(msg2 = sc.nextLine()+'\n');
		
		System.out.println("File write is over");
		fw.close();

		FileReader fr = new FileReader("Fardeen.txt");
		BufferedReader br = new BufferedReader(fr);
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		System.out.println(str1+'\n'+str2);
		
	}
	

}
