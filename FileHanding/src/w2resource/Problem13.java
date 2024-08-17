package w2resource;
//Write a Java program to read a file line by line and store it in a variable.

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Problem13 {
	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		String strline = "";
		String dataline = "";
		try {
			FileReader fr = new FileReader("first.txt");
			BufferedReader br = new BufferedReader(fr);
			while (strline != null) {
				if (strline == null)
					break;

				dataline += strline;
				strline = br.readLine();
				System.out.println(dataline);
				br.close();
			}

		} catch (FileNotFoundException e) {
			System.err.println("File not found");
		} catch (IOException ez) {
			System.err.println("unable to read the file");
		}

	}
}
