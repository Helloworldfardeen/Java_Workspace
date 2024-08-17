package Assignment3_problem1;

public class SavingAccount extends BankAcount {
double interestRate;

public SavingAccount(String accountNumber , long totalBalance,double interestRate) {
	super(accountNumber,totalBalance);
	this.accountNumber=accountNumber;
	this.totalBalance=totalBalance;
	this.interestRate = interestRate;
}
//@Override
//public String toString() {
//	return "SavingAccount [interestRate=" + interestRate + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
//			+ ", toString()=" + super.toString() + "]";
//}
//public void addInterest( )
//{
//	
//}
@Override 
public void withdraw(long totalBalance) {
	
long amount = 0;
if (getBalance() - amount < 100) {
      System.out.println("Minimum balance of $100 required!");
  } else {
      super.withdraw(amount);
  }
}
}
