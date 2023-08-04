package in.co.exception;

public class Accountone {
	
	private int balance;
	private String accountNumber;
	
	 public Accountone() {
		 System.out.println("in default constructor");
	       }
	
	public Accountone (int balance, String accountNumber) {
		this.balance = balance;
		this.accountNumber = accountNumber;
				
	}

 public void setBalance (int balance)  {  
 this.balance = balance;

	}
 
 public int getBalance() 
	{
		return balance;
	}
 
 
 public void setAccountNumber (String accountnumber)  {  
	 this.accountNumber = accountnumber;

		}
	 
	 public String getAccountnumber() 
		{
			return accountNumber;
		}
	 
	 public void deposite(int amount) {
		 int total = getBalance() + amount;
		 setBalance(total);
		 System.out.println("Balance after deposite + " + getBalance());
	 }
	 
	 public void withdrawl(int amount) throws InsufficientBalance {
		 
		 int total = getBalance() - amount;
		 
		 if(total < 2000) {
			 throw new InsufficientBalance();
	  }
		 else {
			 setBalance(total);
			 System.out.println("Balance after withdrawl = " + getBalance());
		 }
	 }


}
