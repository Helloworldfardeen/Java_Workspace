package cdacCode;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

//Steps....
//read from console
//Creating a object of Socket.....with Using Constructor.
//Taking user Input as a msg.
//write to the socket
//Writing to the Socket AS the OS,PS,s.GETOS()
//reference of ps.Println();
//read from the socket
//READING FROM THE SOCKET 
//IS,s.GETIS,
//user Input 
//write to the console
public class Client1 {
	public static void main(String[] args) throws Exception {
		String name = "LOCALHOST";
		int ip = 9990;
		Socket s = new Socket(name, ip);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your message:");
		String cmsg = sc.nextLine();
		OutputStream os = s.getOutputStream();
		PrintStream ps = new PrintStream(os);
		ps.println(cmsg);
		InputStream is = s.getInputStream();
		Scanner sc1 = new Scanner(is);
		String cmsg1 = sc.nextLine();
		System.out.println("MESSAGE FROM THE SERVER IS :" + cmsg1);
		s.close();
		os.close();

	}

}
