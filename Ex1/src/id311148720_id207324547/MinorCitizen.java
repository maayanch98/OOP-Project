package id311148720_id207324547;

public class MinorCitizen extends Citizen {

	public MinorCitizen(String name, int yearOfBirth, String idNum, boolean coronaIsulatins) throws Exception {
		super(name, yearOfBirth, idNum, coronaIsulatins);

	}

	public MinorCitizen(MinorCitizen copy) throws Exception {

		super(copy);
	}

	@Override
	void setYearOfBirth(int YearOfBirth) throws Exception {

		F.CheckingAgeMinor(YearOfBirth);
		this.yearOfBirth = YearOfBirth;

	}

}
