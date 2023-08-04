package in.co.exception;

public class TestPropagation {

	public static void main(String[] args) throws MistakeException {

		dad();
	}
	public static void dad() throws MistakeException {
		mom();
		
	}
	public static void mom() throws MistakeException {
		son();
		
	}
	
	public static void son() throws MistakeException{
		
	try {	
		
	System.out.println();
	
	throw new MistakeException();
	}
	catch(Exception e){
	
		System.out.println(e);
	
	}
  }
}
