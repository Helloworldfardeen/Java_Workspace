package w2resource;

import java.io.File;
import java.util.Date;

//Write a Java program to determine the last modified date of a file.
public class Problem07 {
	public static void main(String[] args) {
		File fname = new File("C:\\Users\\Om Computer\\eclipse-workspace\\FileHanding\\src\\");
		Date d = new Date(fname.lastModified());
		System.out.println("The Last Modified Date :");
		System.out.println(d);
		
		
		
	}

}
