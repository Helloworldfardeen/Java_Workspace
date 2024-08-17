package W3Resource;

//Write a Java program that throws an exception and catch it using a try-catch block.
public class Problem01 {
//	public static void main(String[] args) {
//		try{
//			int a = 10;
//		int b =0;
//		int c = a/b;
//		System.out.println(c);
//		}catch(Exception e)
//		{
//			System.err.println("Undefined Error");
//		}
//		
//	}
		public static void main(String[] args) {
			try {
				int result =divideNumbers(5, 0);//5/0;
				System.out.println("Result: " + result);
			} catch (ArithmeticException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}

		public static int divideNumbers(int dividend, int divisor) {
			if (divisor == 0) {
				throw new ArithmeticException("Cannot divide the given number by zero!");
			}
			return dividend / divisor;
		}
	}


