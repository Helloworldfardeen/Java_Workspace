package day02;

import java.io.File;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

public class RandomNumG {
	public static void main(String[] args){
	try {
	File Cfile = new File("record.txt");
	Cfile.createNewFile();
	FileWriter Fw = new FileWriter(Cfile);
	int n=0;
   while ( n<10) {
	Random Gnum =  new Random();
	int input = Gnum.nextInt(200)+1;
	System.out.println(input);
//	Scanner myReader = new Scanner(Cfile);//to read the file using Scanner Class..
//	String lineData = myReader.nextLine();// it will read data 
//	System.out.println(lineData);
	Fw.write("(" +(Integer.toString(input)+")"));
    System.out.println("file created");
    n++;
   }
   Fw.close();
	}
	catch(Exception e)
	{
	 System.err.println("SomeThing Went Wrong");	
	}
	
	}

}
