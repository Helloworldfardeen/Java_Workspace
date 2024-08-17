package assignment_Cloud;

public class Tower_Of_Hanoi {
	public static void main(String[] args) {
		TowerOfHanoi(10, 'A', 'B', 'C');
	}
public static void TowerOfHanoi(int n,char Source,char temp,char Destination)
{
	if(n>0)
	{
		TowerOfHanoi(n-1, Source, Destination, temp);
		System.out.println(" ["+ Source + "-->" + Destination + "] ");
		TowerOfHanoi(n-1, temp, Source, Destination);
	}
}
}
