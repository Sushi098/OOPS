package in.co.exception;

public class TestAccount {

	public static void main(String[] args) {

		Accountone a = new Accountone();
		
		a.deposite(6000);
		
		try {
			a.withdrawl(4500);
		}
		catch(Exception e){
			System.out.println(e);
		}

	}

}

