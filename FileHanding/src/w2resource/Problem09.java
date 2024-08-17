package w2resource;
import java.io.*;
//Write a Java program to get the file size in bytes, KB, MB.
public class Problem09 {
	public static void main(String[] args) {
		File fpath = new File("F:\\punisher");
		//System.out.println(fname.getPath());
		if(fpath.exists())
		{
			System.out.println(file_size_bytes(fpath));
			System.out.println(file_size_kilo_bytes(fpath));
			System.out.println(file_size_mega_bytes(fpath));
		}
		
		
	}

	private static String file_size_bytes(File fpath) 
	{
		
		return fpath.length()+" Bytes";
	}
	private static String file_size_kilo_bytes(File fpath) 
	{
		
		return (double)fpath.length()/1024+" kilobytes";
	}
	private static String file_size_mega_bytes(File fpath)
	{
	
		return (double)fpath.length()/1024+" kilobytes";
	}
}
