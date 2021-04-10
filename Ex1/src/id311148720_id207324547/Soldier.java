package id311148720_id207324547;

public class Soldier extends Citizen {

	public Soldier(String name, int yearOfBirth, String idNum, boolean coronaIsulatins) throws Exception {
		super(name, yearOfBirth, idNum, coronaIsulatins);
		
	}
	public Soldier(Soldier copy) throws Exception{
		
		super(copy);
	}
	
	
	
	@Override 
 void setYearOfBirth(int YearOfBirth) throws Exception {

		F.CheckingAgeForSoldier(YearOfBirth);
		
		this.yearOfBirth=YearOfBirth;
		

	}

}
