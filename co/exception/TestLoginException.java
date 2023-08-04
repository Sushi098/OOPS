package in.co.exception;

import javax.security.auth.login.LoginException;

public class TestLoginException {

	public static void main(String[] args) {

		String name = "admi";
		if (name.equals("admin")) {
			
			System.out.println("Valid user...");
		}
		else {
			try {				
			
			throw new LoginException();
			
		} catch(Exception e) {
			
			System.out.println("Not a valid user");
		}
			
		}
	}

}
