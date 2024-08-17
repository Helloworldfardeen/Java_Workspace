package kunal_kushwah_linierSearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchInString {
	public static void main(String[] args) {
		String str = "Fardeen";
		char  str1[]=new char[6];
//		char arr[]= {'F','a','r','d','e','e','n'};
		System.out.println(searchByChar(str, 'e'));
		System.out.println(Arrays.toString(str.toCharArray()));
		System.out.println(search2(str, 'd'));
	}
	public static boolean search2(String str,char target)
	{
		if(str.length()==0)
			return false;
		for (char ch : str.toCharArray()) {
			if(ch==target)
			{
				return true;
				
			}
			
		}	
		return false;
	}

	public static boolean searchByChar(String str,char target)
	{
		if(str.length()==0)
			return false;
		for(int index = 0; index < str.length();index++)
		{
			if (target==str.charAt(index))
			{ 
				System.out.println("At Index Of "+index);
				System.out.println("find");
				return true;
			}
		}
		
		return false;
	}

}
