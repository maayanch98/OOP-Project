package id311148720_id207324547;

public class SoldiredBalltBox extends BallotBox1 {

	public SoldiredBalltBox(Address address) throws Exception {
		super(address);

	}

	@Override
	public boolean AddCitizen(Citizen newcitizen) {

		if (!(newcitizen.getCoronaInsulation() == false) && (presentYear - newcitizen.getYearOfBirth() >= mayVote)
				&& (newcitizen instanceof Soldier)) {

			listOfCitizen[priesentCitizenInTheList++] = newcitizen;

			return true;
		}
		return false;
	}

}
