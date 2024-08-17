package sauravPractise;

import java.io.Serializable;

public class Players implements Serializable {
	int jrsyNo;
	String name;
	String team;
	double price;
	public Players(int jrsyNo, String name, String team, double price) {
		super();
		this.jrsyNo = jrsyNo;
		this.name = name;
		this.team = team;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Players [jrsyNo=" + jrsyNo + ", name=" + name + ", team=" + team + ", price=" + price + "]";
	}
	
	
	
	
	
	

}
