package day02;
//under construction.....
import java.util.Scanner;
//divide and conqueror;
//first fide sqare of the digit so make the function for that...
//after the make the fuction to check is ti happy number are not using while looop ..
public class Assginment1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int start, end, test;
//		System.out.println("Enter the Starting from to end");
//		start = scan.nextInt();
//		end = scan.nextInt();
//		happyNumbers(start, end);
//		System.out.println(seperateDigit(123));
//		digitSum(123);
//		Hp(7);
		tstHp(7001);
	}

	public static void tstHp(int num) {
		int cnt = 1;
		int temp = 0;
		while (cnt <= 10) {
			if (digitSum(num) != 1) {
				int fi;
				temp = digitSum(num);
				System.out.println(temp);
				System.out.println("The Value Of the Count" + cnt);
			}
			num=temp;
			temp=0;
			cnt++;
		}
	}

	public static void Hp(int num) {

		if (digitSum(num) == 1) {
			System.out.println("The Number is Happy1");

		} else {
			int temp = digitSum(num);
			System.out.println(temp);
//	digitSum(temp); 
			System.out.println("The Number is Happy2");

			int temp2 = digitSum(temp);
			System.out.println(temp2);
			System.out.println("The Number is Happy3");

			int temp3 = digitSum(temp2);
			System.out.println(temp3);
			System.out.println("The Number is Happy4");

			int temp4 = digitSum(temp3);
			System.out.println(temp4);

			System.out.println("The Number is Happy5");

			int temp5 = digitSum(temp4);
			System.out.println(temp5);
			System.out.println("The Number is Happy6");

			int temp6 = digitSum(temp5);
			System.out.println(temp6);
			System.out.println("The Number is Happy7");

			int temp7 = digitSum(temp6);
			System.out.println(temp7);
			System.out.println("The Number is Happy8");

			int temp8 = digitSum(temp7);
			System.out.println(temp8);
			System.out.println("The Number is Happy9");

			int temp9 = digitSum(temp8);
			System.out.println(temp9);
			System.out.println("The Number is Happy10");

		}
	}

	public static int digitSum(int num) {
		int rem = 0;
		int SqSum = 0;
		int result = num;
		while (result != 0) {
			rem = result % 10;
			rem = rem * rem;
			SqSum = SqSum + rem;
			rem = 0;
			result = result / 10;

		}

		return SqSum;

	}
}

//	public static void happyNumbers(int start, int end) {
//		int cnt = 0;
//		int sum = 0;
//		int rem;
//		int sqare = 0;
//		int ret;
//		int temp3 = 0;
//		int temp4 = 0;
//		int temp5=0;
//		int temp = digitSum(start + 1);
//		while (start <= end) {
//
//			int temp2 = digitSum(start);
//			if (temp2 == 1) {
//				System.out.println("Happy" + start);
//			} else if (temp2 >= 1) {
//				temp3 = temp2 * temp2;
//				temp3 = digitSum(temp3);
//				if (temp3 == 1) {
//					System.out.println("Happy" + start);
//				}
//				temp5=start;
//			}
//				else if (temp3 >= 1) {
//				temp4 = temp3 * temp3;
//				temp4 = digitSum(temp3);
//				System.out.println("Happy" + start);
//			}
//			while(cnt<10)
//			{
//				temp4 = (int)Math.sqrt( digitSum(temp5));
//				cnt++;
//			}

//			start++;
//		}
//	}
//}

//	public static int seperateDigit(int num) {
//
//		int cnt = 0;
//		int temp = 0;
//		int SqareDigit;
//		if (num <= 0) {
//			return num;
//		}
//		temp = num % 10;
////		SqareDigit = (temp*temp)+(temp * temp);
////		System.out.println(SqareDigit);
//		num = num / 10;
//		return seperateDigit(num);
////		return SqareDigit;
//	}
//}
