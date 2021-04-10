package id311148720_id207324547;

public class AdultCitizen extends Citizen {

	public AdultCitizen(String name, int yearOfBirth, String idNum, boolean coronaIsulatins) throws Exception {
		super(name, yearOfBirth, idNum, coronaIsulatins);

	}

	public AdultCitizen(AdultCitizen copy) throws Exception {

		super(copy);
	}

	@Override
	void setYearOfBirth(int YearOfBirth) throws Exception {

		F.CheckingAgeAdult(YearOfBirth);
		this.yearOfBirth = YearOfBirth;

	}

}
