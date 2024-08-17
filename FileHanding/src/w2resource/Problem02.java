package w2resource;

import java.io.File;
import java.io.FilenameFilter;

//Write a Java program to get specific files with extensions from a specified folder
public class Problem02 {
	public static void main(String[] args) {
     File fname= new File("C:\\Users\\Om Computer\\eclipse-workspace\\FileHanding\\src\\");
	 String list []=fname.list(new FilenameFilter() {
		
		@Override
		public boolean accept(File dir, String name) {      //to access a specific type of file 
			if(name.toLowerCase().endsWith(".txt"))
			{
				return true;
			}
			else
			return false;
		}
	 });

	 for(String name : list) {
		System.out.println(name);
		
	}
	

}
}