package kunal_kushwah_linierSearch;
//leetcode.....
//Given An Array nums Integer,return how many of them contain an even number of digit..
//ex : 
//Input num = {12,345,2,6,7896}
//Output 2
//like  12,7896 (2,4) even digit so it output is 2 element.... in an array..
public class EvenDigit {
public static void main(String[] args) {
	int arr[]= {12,345,2,6,7896};
	System.out.println("The Number of digit is even in our Array :: ");
	System.out.println(evDigit(arr));
}
public static int evDigit(int arr[])
{
	int count =0;int temp;int countDigit=0;int store=0;int swap=0;
	for (int i = 0; i < arr.length; i++) {
	  store = arr[i];
	  temp  = 0;
	  count = 0;
	  while(store!=0)
	  {
		 store = store/10; 
		 count++;
	  }
	  arr[i]=count;
	  if(arr[i]%2==0)
	  {
		  countDigit++;
	  }
	}
	
	return countDigit;
}
}
