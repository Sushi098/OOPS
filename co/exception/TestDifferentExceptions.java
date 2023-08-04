package in.co.exception;

public class TestDifferentExceptions {
	
	public static void main(String[] args) {
		
		try {
			int a = 10;
			int b = 0;
			int c = a/b;
			
			System.out.println(c);
			String name = null;
			System.out.println(name.length());
			
		}catch(ArithmeticException e) {
			
			System.out.println(e);
			
		}catch(NullPointerException e) {
			
			System.out.println(e);
			
		}catch(Exception e) {
			
			System.out.println(e);
		
		}finally {
			System.out.println("finally block");
		
		}
		System.out.println("after catch block");
	

	}

}
