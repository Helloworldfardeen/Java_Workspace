package CdacFileHandling;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class FileObjectRead {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
			FileInputStream fis = new FileInputStream("record.txt");
            ObjectInputStream ois =new ObjectInputStream(fis);
            try {
            	
            
            Student s1;
//            Student s2;
//            Student s3;
            while((s1=(Student) ois.readObject())!=null) {
            	System.out.println( s1.toString());
            	s1.display();
            }
            }catch(EOFException eof)
            {
            	System.err.println("EOF");
            }
            
		
		
	}

}

