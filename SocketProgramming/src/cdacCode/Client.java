package cdacCode;

import java.io.IOException;
import java.io.ObjectStreamClass;
import java.io.ObjectStreamField;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s =  new Socket("localHost", 9999);
		Scanner sc = new Scanner(System.in);
		// read from client
		System.out.println("Enter the message!!");
		String cmsg = sc.nextLine();
		OutputStream os = s.getOutputStream();
		PrintStream ps = new PrintStream(os);
		// write the socket

		ps.println(cmsg);

		System.out.println("client send message to socket");

		s.close();
		os.close();
		ps.close();
	}

}
