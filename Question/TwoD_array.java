package Question;

import java.util.Iterator;
import java.util.Random;

public class TwoD_array {
public static void main(String[] args) {
int arr[][] = new int[5][5];
Random r = new Random();

for (int i = 0; i <5; i++) {
	for (int j = 0; j < 5; j++) {
         arr[i][j]=r.nextInt(100);		
	}
}

System.out.println("using_forloop");
for (int i = 0; i <5; i++) {
	for (int j = 0; j < 5; j++) {
         System.out.print(arr[i][j]+" ");		
	}
	System.out.println();
}
System.out.println("using forEach");
for (int[] row : arr) {
	for(int col : row) {
	 System.out.print(col +" ");
}
System.out.println();	
}

}
}
