package id311148720_id207324547;

public class Candidate extends AdultCitizen  {

	int placeinPramriz=0;
	
	public Candidate(String name, int yearOfBirth, String idNum, boolean coronaIsulatins) throws Exception {
		super(name, yearOfBirth, idNum, coronaIsulatins);

		this.placeinPramriz=0;
	}

	
	public void AddPlaaceInPramriz(int place) {
		
		this.placeinPramriz=place;
	}

}
