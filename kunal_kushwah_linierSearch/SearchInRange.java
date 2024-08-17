package kunal_kushwah_linierSearch;

import java.util.Scanner;

public class SearchInRange {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6,7,8,9};
	int target = 19;
	System.out.println(search(arr,target,0,2));
}
public static int search(int []arr,int target,int start,int end)
{ 
	if(arr.length == 0)
	{
		return -1;
	}
   for (int index = start; index <=end; index++) {
	    int element = arr[index]; 
    	if(target==element)
    	{
    		System.out.println(element);
    		return index;
    	}
		
	}
	
	return -1;
}
}
