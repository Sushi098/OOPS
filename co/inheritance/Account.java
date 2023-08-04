package in.co.inheritance;

public class Account {
	
	private int balance;
	private String accountNumber;
	
	// public Account() {
	// System.out.println("in default constructor");
     //   }

	public Account (int balance, String accountNumber) {
		this.balance = balance;
		this.accountNumber = accountNumber;
				
	}

 public void setBalance (int balance)  {  
 this.balance = balance;

	}
}

