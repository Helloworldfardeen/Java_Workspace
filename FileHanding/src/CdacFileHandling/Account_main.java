package CdacFileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Account_main {
	public static void main(String[] args) {
		try {
		Account a1 = new Account("Fardeen", "Private Emp", 10000, 5.0, 100000);
		Account a2 = new Account("Kamran", "Agriculture", 100000, 2.0, 5000000);
		Account a3 = new Account("Sarim", "Goverment Emp", 50000, 10.0, 20000);
		
		FileOutputStream fos = new FileOutputStream("Account.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);
		oos.writeObject(a2);
		oos.writeObject(a3);
		oos.close();
		fos.close();
		System.out.println("file write is over");
		FileInputStream fis = new FileInputStream("Account.txt");
		try (ObjectInputStream ois = new ObjectInputStream(fis)) {
			Account obj;
			while((obj= (Account) ois.readObject())!=null)
			{
				obj.Display();
				obj.computeEmi();
			}
			
		}
		}catch (Exception e) {
			System.out.println("Error");
		}
	}

}
