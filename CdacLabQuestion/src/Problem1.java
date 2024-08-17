import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
//import java.util.String;
public class Problem1 {

	public static void main(String[] args) {
		ArrayList<Integer>al = new ArrayList<Integer>();
		ArrayList<Integer>a = new ArrayList<Integer>();		
		System.out.println("Operation1 add element");
		al.add(11);
		al.add(12);
		al.add(18);
		al.add(15);
		al.add(16);
		al.add(21);
		al.add(20);
		System.out.println(al);
		
		System.out.println("Operation2 Remove Element");
		al.remove(3);
		System.out.println("After removing from 3rd index");
		System.out.println(al);
		
		System.out.println("Opration4 ");
		System.out.println("Modifing ArrayList to even number");
		for(Integer ele : al)
		{
			if(ele%2==0)
			{
				System.out.print("["+ele+"]");
			}
		}
      System.out.println("Operation 5 with using Ierator");
      Iterator<Integer> iterator = al.iterator();
      while (iterator.hasNext()) {
          System.out.println(iterator.next() + " ");
      }
      System.out.println("Operation 6 view a particular element using (get())");
      System.out.println(al.get(3));
	
      System.out.println("Operation 7 Sort our ArrayList (Collection.sort)");
      
      System.out.println();
  	System.out.println(al);	
      Collections.sort(al);
      for (Integer integer : al) {
		System.out.println(integer);
	}
	System.out.println(al);	
	  for (Integer integer : al) {
			System.out.println("                      "+integer);
				
		}
	  System.out.println(al);
		
	}
	

}
