package id311148720_id207324547;

import java.time.Month;
import java.util.Arrays;

public class mangmentElection {

	private Elections election;
	

	public mangmentElection(Month month, int year) throws Exception {

		election = new Elections(month, year);
	}

	public void Addbox(BallotBox1 Box) {

		election.setBox(Box);

	}

	public void AddCitizen(Citizen citizen) throws Exception {

		election.setCitizen(citizen);
	}

	public void AddParty(Party party) throws Exception {

		election.setParty(party);
	}

	public void AddCandidatesToParty(Candidate candidatee, Party partyy) {

		election.AddCandidatesToParty(candidatee, partyy);

	}

	public void ShowBox() {
		boolean temp = true;
		
	
		for (int i = 0; i < election.getListOfBox().length && temp; i++) {

			if (election.getListOfBox()[i] != null) {
				System.out.println(election.getListOfBox()[i]);
			} else {
				temp = false;
			}

		}
	}

	public void ShowCitizen() {

		boolean temp = true;
		
		for (int i = 0; i < election.getVoterRegister().length && temp; i++) {

			if (election.getVoterRegister()[i] != null) {
				System.out.println(election.getVoterRegister()[i]);
			} else {
				temp = false;
			}

		}

	}

	public void ShowParty() {

		boolean temp = true;
		for (int i = 0; i < election.getListOfParty().length && temp; i++) {

			if (election.getListOfParty()[i] != null) {
				System.out.println(election.getListOfParty()[i]);
			} else {
				temp = false;
			}

		}

	}
	
	

}
