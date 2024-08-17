package w2resource;

import java.io.File;

//Write a Java program to check if the given pathname is a directory or a file.
public class Problem05 {
	public static void main(String[] args) {
		File fobj_Dic = new File("C:\\Users\\Om Computer\\eclipse-workspace\\FileHanding\\");
		if(fobj_Dic.isDirectory())
		{
			System.out.println(fobj_Dic.getAbsolutePath()+" is a directory");
		}
		else
		{
			System.out.println(fobj_Dic.getAbsolutePath() + " is not a directory");
		}
		if(fobj_Dic.isFile())
		{
			System.out.println(fobj_Dic.getAbsolutePath()+" is a file");
		}
		else 
		{
			System.out.println(fobj_Dic.getAbsolutePath()+" is not a file");
		}
	}

}
