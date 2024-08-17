package CdacFileHandling;

import java.io.Serializable;

public class Account implements Serializable {
	String Customer_name;
	String Customer_type;
	double Salary;
	double Interest;
	double Loan;
	double Emi;

	public Account(String customer_name, String customer_type, double salary, double interest, double loan) {
		Customer_name = customer_name;
		Customer_type = customer_type;
		Salary = salary;
		Interest = interest;
		this.Loan = loan;
		
		}

	

	public void Display() {
		System.out.println(Customer_name);
		System.out.println(Customer_type);
		System.out.println(Salary);
		System.out.println(Interest);
		System.out.println(Loan);
	}

	public void computeEmi()
	{
		Emi=(this.Salary+this.Interest+this.Loan)/1000;
     System.out.println("Emi is : "+Emi);
		
	}

}
