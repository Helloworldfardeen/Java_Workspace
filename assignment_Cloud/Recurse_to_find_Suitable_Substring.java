package assignment_Cloud;

public class Recurse_to_find_Suitable_Substring {
	public static void main(String[] args) {
//		String str = "madam";        //answer 7
//		String str = "madamiamadam";//answer 29
		String str = "abracadabra";// answer 23
		int count  = 0;
		for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
				if(str.charAt(i)==str.charAt(j))
				{
					count++;
				}
			}			
		}
		System.out.println(count);
	}

}
