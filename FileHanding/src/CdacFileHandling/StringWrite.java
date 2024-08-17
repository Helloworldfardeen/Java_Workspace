package CdacFileHandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StringWrite {
public static void main(String[] args) {
	String msg;
	try {
		Scanner sc = new Scanner(System.in);
	FileWriter fw = new FileWriter("StringWrite.txt");
   System.out.println("Your Message!!");
	msg  = sc.nextLine();
	fw.write(msg);
	System.out.println("Done..");
    fw.close(); 
    FileReader fr = new FileReader("StringWrite.txt");
    BufferedReader br = new  BufferedReader(fr);
    String msgreader= br.readLine();
    System.out.println(msgreader);
    int l = msgreader.length();
    System.out.println("The length of our Message !.."+l);
	}catch(IOException er)
	{
	System.out.println("Input Output Exception!!..");
	}
	catch (Exception e) {
		System.out.println("What should we do now!! ");
	}
	
}

}
