package id311148720_id207324547;

public class CoronaBalltBox extends BallotBox1 {

	public CoronaBalltBox(Address address) throws Exception {
		super(address);

	}

	@Override
	public boolean AddCitizen(Citizen newcitizen) {

		if (newcitizen.getCoronaInsulation() && (presentYear - newcitizen.getYearOfBirth() >= mayVote)) {

			listOfCitizen[priesentCitizenInTheList++] = newcitizen;

			return true;
		}
		return false;
	}

}
