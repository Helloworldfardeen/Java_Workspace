package sauravPractise;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PlayersHandling {

	public static void main(String[] args) throws IOException {
		Players p1 = new Players(18, "Virat", "RCB", 160000000);
		Players p2 = new Players(7, "MSDhoni", "CSK", 110000000);
		Players p3 = new Players(45, "Rohit", "MI", 150000000);
		Players p4 = new Players(47, "Warner", "DC", 120000000);
		
		FileOutputStream fos = new FileOutputStream("Mandar.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(p1);
		oos.writeObject(p2);
		oos.writeObject(p3);
		oos.writeObject(p4);
		
		System.out.println("Object Write is Over");
		fos.close();
		oos.close();
		
	}

	
}
