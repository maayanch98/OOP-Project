package id311148720_id207324547;

public class  Exceptionid extends Exception  {
	
	public Exceptionid (String check) {
		super(check);
		
	}
	
	public void checkException(String check) {
		
		Integer.parseInt(check);
	}

}
