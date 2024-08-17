package com.youtubeCode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSoc {

	public static void main(String[] args) throws Exception {
		System.out.println("Server is Started");
		ServerSocket ss= new ServerSocket(9940);
		
		System.out.println("Server is waiting for Client Request");
		Socket S =ss.accept();
		
		System.out.println("Client Connected");
		BufferedReader  br = new BufferedReader(new InputStreamReader(S.getInputStream()));
		String str = br.readLine();
		
	}

}
