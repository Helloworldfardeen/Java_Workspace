package Question;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int input = scan.nextInt();
		System.out.println("---------using__Iteration + Recursion---------");
         fib_display(input);
		System.out.println("---------using_Only_Iteration---------");
		iteration(input);
		System.out.println("---------using_Only_Recursion---------");
	    only_rec_fib(input);
	
	
	}
	
	
	
	
    private static void only_rec_fib(int input) {
		}




	private static void fib_display(int input)
    {
    	for (int i = 0; i < input; i++) {

			System.out.print(rec_Fibon(i));
			if (i == input - 1)
				System.out.print("......ends\n");
			else
				System.out.print(",");
		}
    }
	private static int rec_Fibon(int n) {
		if (n <= 1) {
			return n;
		}
		return rec_Fibon(n - 1) + rec_Fibon(n - 2);
	}

	private static void iteration(int n) {
		int fNum = 0;
		int sNum = 1;
		int result = 0;
		for (int i = 1; i < n; i++) {
			System.out.print(result);
			result = fNum + sNum;
			fNum = sNum;
			sNum = result;
			if (i == n - 1)
				System.out.print("......ends\n");
			else
				System.out.print(",");

		}
	}
}
