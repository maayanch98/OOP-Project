package id311148720_id207324547;

public class CopyArray<T> {
	

	public  T[]  CopyArray (T[] array) {
			
		T[] temp = (T[]) new Object[array.length];
		
		for(int i=0 ; i< array.length ; i++) {
			
			temp[i]= new (array[i]);
		}
	}

	
	
	
	
	
	
	
	
	

}
