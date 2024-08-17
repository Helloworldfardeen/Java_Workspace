package kunal_kushwah_linierSearch;
//IN ORDER TO FIND MINIMUM YOU HAVE TO SWAP THE VALUE BUT FIRST ASSUME VALUE WITH FIRST NUM...
public class FindMin {
public static void main(String[] args) {
	int arr[]= {10,20,7,2,1,-99};
      findMinimum(arr);	
}
public static void findMinimum(int arr[])
{
	int ans=arr[0];
	for (int i = 0; i < arr.length; i++) {
		if(ans>arr[i])
		{
			ans=arr[i];
		}
	}
	System.out.println("The Minimum Number is ::");
	System.out.println(ans);
	
}
}
