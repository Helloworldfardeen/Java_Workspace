package W3Resource;

public class Problem3 {
	public static void main(String[] args) {
		int n = 5;
		for(int i =0;i<=n;i++)
		{
		for(int j= n;j>=i;j--) {
			System.out.print(" ");
		} 
		
		for(int k=0;k<=i;k++) {
			if(k==0)
			System.out.print(k+" ");
		}
//		if(i==5)
		System.out.println();
//		continue;
		}
		int rows=6;  
		for (int i= 0; i<= rows-1; i++)  
		{  
		for (int j=0; j<=i; j++)  
		{  
		System.out.print(" ");  
		}  
		for (int k=0; k<=rows-1-i; k++)  
		{  
			if(k==0)
		System.out.print(k + " ");  
		}
//		if(i==5)
		System.out.println();  
//		continue;
		}  
	}
	

}
