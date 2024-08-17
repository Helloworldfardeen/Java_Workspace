package cdacCode;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//creating Object of SS with Same IP.
//From the Client class we have to Accept using Accept Function.
//now Print the Connection you Got
//read from the socket
//IS,s.GETIS();
//Scan the value using SCANNER input Class.
//write to the console
//print the msg
//read from console
//using Scanner again
//write to the socket
//OS,S.GETOS(),PS
public class Server1 {
public static void main(String[] args) throws Exception {
	int ip = 9990;
	ServerSocket ss= new ServerSocket(ip);
	Socket s = ss.accept();
	
	System.out.println("CONNECTION YOU GOT");
 	
	InputStream is = s.getInputStream();
 	Scanner sc = new Scanner(is);
    
 	System.out.println("Enter the Message!!!");
 	String Cmg = sc.nextLine();
 	
 	System.out.println("message from clinet is "+Cmg);
 	Scanner sc1 = new Scanner(System.in);
 	
 	System.out.println("enter the message for client");
    
 	String Cmg1 = sc.nextLine(); 	
    
 	OutputStream os = s.getOutputStream();
    PrintStream ps = new PrintStream(os);
    
    ps.println(Cmg1);
    ss.close();
	s.close();
	is.close();

}
}
