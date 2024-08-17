package cdacCode;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
public static void main(String[] args) throws IOException {
	ServerSocket ss = new ServerSocket(9999);
	Socket s =ss.accept();
	System.out.println("Socket Programming");
	//read From Socket
	InputStream is = s.getInputStream();
	Scanner sc= new Scanner(is);
	//write to the console
	System.out.println("Enter the message");
	String cmsg = sc.nextLine();
	 System.out.println("message sent by client is "+ cmsg);
	
	 ss.close();
     s.close();
     is.close();
	


}
}
