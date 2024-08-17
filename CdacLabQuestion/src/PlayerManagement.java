

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class PlayerManagement {

	ArrayList<Player> createPlayerObject() {
		ArrayList<Player> pl = new ArrayList<>();
		Player p1 = new Player(1,"Virat Kholi", 18000, 2, 562, "India", 100, "Batsman");
		Player p2 = new Player(2,"Virat Kholi", 18000, 2, 562, "India", 100, "Batsman");
		Player p3 = new Player(3,"Virat Kholi", 18000, 2, 562, "India", 100, "Batsman");
		Player p4 = new Player(4,"Virat Kholi", 18000, 2, 562, "India", 100, "Batsman");
		Player p5 = new Player(5,"Virat Kholi", 18000, 2, 562, "India", 100, "Batsman");
		Player p6 = new Player(6,"Virat Kholi", 18000, 2, 562, "India", 100, "Batsman");
		Player p7 = new Player(7,"Virat Kholi", 18000, 2, 562, "India", 100, "Batsman");
		pl.add(p1);
		pl.add(p2);
		pl.add(p3);
		pl.add(p4);
		pl.add(p5);
		pl.add(p6);
		pl.add(p7);
		System.out.println("Players Object Created");
		return pl;

	}

	public void displayPlayerObject(ArrayList<Player> pl) {
		for (Player ele : pl) {
			ele.display();

		}
	}

	public void updateArraylist(ArrayList<Player> pl){
      Scanner sc = new Scanner (System.in);
		System.out.println("Enter Id");
       int pid =sc.nextInt();
       System.out.println("Change name :");
       String name=sc.next();
       for (Player ele : pl) {
    	   if(ele.id==pid)
    	   {
    		   ele.plyName=name;//FARDEEN
    	   }
		
	}
	}
	public void deletePlyObj(ArrayList<Player> pl)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id");
		int pid = sc.nextInt();
		int position =0;
		for (Player ele : pl) {
			if(ele.id==pid)
			{
//				position=pl.indexOf(ele);
				position=(pid-1);
			}
		}
		pl.remove(position);
	}

}
