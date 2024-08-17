package CdacFileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileObjectWrite {
public static void main(String[] args) {
	Student s1 = new Student(1, "fardeen", 96, "A");
	Student s2 = new Student(2, "Arjun", 69, "B");
	Student s3 = new Student(3, "Alok", 82, "A");
	try{
	FileOutputStream fos = new FileOutputStream("record.txt");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(s1);
	oos.writeObject(s2);
	oos.writeObject(s3);
	System.out.println("Object Write is Over");
	oos.close();
	fos.close();
	}catch(IOException e)
	{
		System.err.println("File not found");
	}
}
}
