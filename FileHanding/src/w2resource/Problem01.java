package w2resource;
import java.io.File;

//1. Write a Java program to get a list of 
//all file/directory names in the given directory.

public class Problem01 {
public static void main(String[] args) {
	File f = new File("C:\\Users\\Om Computer\\eclipse-workspace\\FileHanding\\src\\");
	String fList []=f.list();
	for (String name : fList) {
		System.out.println(name);
	}
	//This is used to access data like what type of folder your file contains
}
}
