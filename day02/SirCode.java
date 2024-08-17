package day02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class SirCode {
	
    
	public static void main(String[] args) {
		// create a new file or check for its existence
		File persistnumbers = new File("numberrecord.txt");
		try {
			if (persistnumbers.createNewFile()) {
//					System.out.println("file created");
			} else {
//					System.out.println("file already exists");
			}
			while (true) {
				Random rand = new Random();
				// this method generates a random number between 1 and 187.
				int randomnumber = rand.nextInt(187) + 1;
//					System.out.println("the randomly generated number is: "+randomnumber);
				// check for presence of the random number in the file
				boolean numberpresent = false;
				Scanner myReader = new Scanner(persistnumbers);
				while (myReader.hasNextLine()) {
					String linedata = myReader.nextLine();
					if (Integer.toString(randomnumber).equals(linedata)) {
						System.out.println("number already present in the file");
						numberpresent = true;
						break;
					}
				}
				if (numberpresent) {
					continue;
				}
				Scanner scan = new Scanner(System.in);
				System.out.println("Is the " + randomnumber + "+ present in the class? (y/n): ");
				String prompt = scan.next();
				if (prompt.equalsIgnoreCase("y")) {
					// persist the random number in the file
					FileWriter fw = new FileWriter(persistnumbers, true);
					fw.write(Integer.toString(randomnumber));
					fw.write("\n");
					fw.close();
					System.out.println("The number is: " + randomnumber);
					break;
				} else if (prompt.equalsIgnoreCase("n")) {
					continue;
				} else {
					System.err.println("Invalid response.  Please answer with a y/n.");
				    continue;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
