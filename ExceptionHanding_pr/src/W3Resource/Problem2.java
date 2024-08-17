package W3Resource;


// Write a Java program to create a method that takes an integer as a parameter 
// and throws an exception if the number is odd.
public class Problem2 {
	public static void main(String[] args) {
     trynumber(17);
     trynumber(2);
     
	}

	public static void trynumber(int n) {
		try {
			checknnum(n);
			 System.out.println(n + " is even.");

		} catch (IllegalArgumentException e) {
			System.err.println("Error: " + e.getMessage());
		}
	}

	public  static void checknnum(int Number) {
		if (Number % 2 != 0) {
			throw new IllegalArgumentException(Number + " is odd.");
		}

	}
}