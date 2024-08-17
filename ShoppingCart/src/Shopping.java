
public class Shopping {
////	Write a Java program to simulate an online shopping cart.
////
////	A shopping cart is a collection of items selected by a customer for purchase.
//	A user can add items to the cart, remove them, empty the cart, view the items in the cart,
//	view the items in the shop, and end shopping and proceed to checkout.(using arraylist)

	String CustomerName;
	String ProductName;
	double price;
	String name;
	String mobile;
	String items;
	
	
	public Shopping(String customerName, String productName, double price, String name, String mobile, String items) {
		CustomerName = customerName;
		ProductName = productName;
		this.price = price;
		this.name = name;
		this.mobile = mobile;
		this.items = items;
	}


	public String toString() {
		return "Shopping [CustomerName=" + CustomerName + ", ProductName=" + ProductName + ", price=" + price
				+ ", name=" + name + ", mobile=" + mobile + ", items=" + items + "]";
	}
     

	
	

}
