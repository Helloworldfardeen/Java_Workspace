package w2resource;

import java.io.File;

//Write a Java program to check if a file or directory specified by 
//pathname exists or not
public class Problem03 {
	public static void main(String[] args) {
		File my_file_dic = new File("C:\\Users\\Om Computer\\eclipse-workspace\\FileHanding\\src\\");
		if(my_file_dic.exists())
		{
			System.out.println("Yes File is Exist...in your Dicractory");
		}
		else {
			System.err.println("Error !!!!");
		}
	}

}
