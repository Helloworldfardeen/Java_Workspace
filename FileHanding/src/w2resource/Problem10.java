package w2resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;
//work under progess
//Write a Java program to read the contents of a file into a byte array.
public class Problem10 {
	// Reading contents from a file into byte array.
	public static void main(String[] args) {
		String str = "F:\\movies";
		InputStream fins = null;
		try {
			fins = new FileInputStream(str);
			byte FileContrent[] = new byte[2 * 1024];
			int read_count = 0;
			while ((read_count = fins.read(FileContrent)) > 0) {
				System.out.println(new String(FileContrent, 0, read_count - 1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} catch (IOError e) {
			e.printStackTrace();
		} finally {
			try {
				if (fins != null)
					fins.close();
			} catch (Exception ex) {

			}

		}

	}

}
