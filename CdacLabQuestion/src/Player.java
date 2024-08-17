
public class Player {
	int id;
	String plyName;
	int totalRun;
	int noOfWicket;
	int noOfMatches;
	String country;
	int noOfCentury;
	String Category;
	public Player(int id,String plyName, int totalRun, int noOfWicket, int noOfMatches, String country, int noOfCentury,String Category) {
		this.id=id;
		this.plyName = plyName;
		this.totalRun = totalRun;
		this.noOfWicket = noOfWicket;
		this.noOfMatches = noOfMatches;
		this.country = country;
		this.noOfCentury = noOfCentury;
		this.Category=Category;
	}
	 public void display()
	{
		System.out.println("----------------------------------------------");
		System.out.print("Id  :");
		System.out.println(id);
		System.out.print("Player Name:");
		System.out.println(plyName);
		System.out.print("Total Run :");
		System.out.println(totalRun);
		System.out.print("Number of wicket :");
		System.out.println(noOfWicket);
		System.out.print("Number of Matches :");
		System.out.println(noOfWicket);
		System.out.print("Country");
		System.out.println(country);
		System.out.print("Number of Centuries :");
		System.out.println(noOfCentury);
		System.out.print("Category");
		System.out.println(Category);
		System.out.print("---------------------------------------------");
	}
	

}
