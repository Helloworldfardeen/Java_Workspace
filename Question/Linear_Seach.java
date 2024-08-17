package Question;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
//you can increase time complexxity using break statement....
public class Linear_Seach {
	public static void main(String[] args) {
	Random ran = new Random();
	Scanner scan = new Scanner(System.in);
	System.out.println("Guess the Number Between 1 To 10 :");
	int input = scan.nextInt();
	int []arr = new int[10];
    for(int i = 0;i<arr.length;i++)
    {
      arr[i]=ran.nextInt(10);
    }
   
      for(int i = 0;i<arr.length;i++)
    {
      if(arr[i]==input)
      {
    	  System.out.println("Find");
    	  break;
      }
    }
      for(int i = 0;i<arr.length;i++)
      {
        System.out.print(arr[i]+" ,");
      }

 
    
	}

}
