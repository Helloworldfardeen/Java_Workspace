package w2resource;

import java.io.File;

//Write a Java program to check if a file or directory has read and write permissions.
public class Problem04 {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\Om Computer\\eclipse-workspace\\FileHanding\\src\\");
	    if(f.canRead())
	    {
	    	System.out.println(f.getAbsolutePath()+"Can Read\n");
	    }
	    else
	    {
	    	System.out.println(f.getAbsolutePath()+"Cannot Read\n");
	    }
	    if(f.canWrite())
	    {
	    	System.out.println(f.getAbsolutePath()+"Can Write\n");
	    }
	    else
	    {
	    	System.out.println(f.getAbsolutePath()+"Cannot Write\n");
	    }
	}

}
