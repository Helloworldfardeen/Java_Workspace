package com.youtubeCode;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientSoc {
public static void main(String[] args) throws Exception{
	String ip = "LocalHost";
	int port = 9940;
	Socket S = new Socket(ip,port);
	String msg = "Fardeen Khan";
	OutputStreamWriter  osw = new OutputStreamWriter(S.getOutputStream());
	PrintWriter out = new PrintWriter(osw);
//	OutputStream os = S.getOutputStream();
//	PrintStream ps = new PrintStream(os);
//	ps.println(msg);
//	InputStream is = S.getInputStream();
	System.out.println("MESSAGE FROM THE SERVER IS :" + msg);
//	osw.println(msg);
//	osw.flush();
	
	
	
}
}
