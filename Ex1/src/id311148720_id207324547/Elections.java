package id311148720_id207324547;

import java.time.Month;
import java.time.YearMonth;

public class Elections {

	private static Function F = new Function();

	private Citizen[] voterRegister;
	private int placeInvoterRegister = 0;
	private Party[] listOfParty;
	private int placeInListOfParty = 0;
	private BallotBox1[] listOfBox;
	private int placeInListOfBox = 0;
	private static int presentRegularBox = 0;
	private static int presentSoldiredBalltBox = 0;
	private static int presentCoronaBalltBox = 0;
	private static int numOfvoterRegister = 100;
	private static int numOfParty = 100;
	private static int numBallotBox = 100;
	private Month month;
	int year;
	private static int presentYear = 2021;
	private static int maxRangeToSoldiredBalltBox = 18;

	public Elections(Month month, int year) throws Exception, ArrayIndexOutOfBoundsException {

		voterRegister = new Citizen[numOfvoterRegister];
		listOfParty = new Party[numOfParty];
		listOfBox = new BallotBox1[numBallotBox];
		setYear(year);
		setMonth(month);
	}

	public Month getMonth() {
		return month;
	}

	public boolean setMonth(Month month) throws Exception {
		if (month.getValue() < 1) {
			throw new Exception("please enter month [1-12]");

		}
		this.month = month;
		return true;
	}

	public int getYear() {
		return year;
	}

	public boolean setYear(int year) throws Exception {
		if (year < presentYear) {
			throw new Exception("please enter year over the: " + presentYear);
		}

		this.year = year;
		return true;
	}

	public Citizen[] getVoterRegister() {
		return voterRegister;

	}

	public boolean setCitizen(Citizen newCitizen) throws Exception, ArrayIndexOutOfBoundsException {

		if (newCitizen instanceof MinorCitizen)
			return false;

		if (voterRegister.length == placeInvoterRegister) {
			BigArray();
		}

		voterRegister[placeInvoterRegister++] = newCitizen;
		return true;

	}

	
	private boolean AddCitizenToBox(Citizen citizen) {

		if (listOfBox.length <= 0) {
			return false;
		}

		if (citizen instanceof Soldier && presentCoronaBalltBox <= 0 && citizen.coronaInsulation) {
			return false;
		}
		if (citizen instanceof Soldier && presentSoldiredBalltBox <= 0 && !(citizen.coronaInsulation)) {
			return false;
		}

		if (citizen instanceof AdultCitizen && presentCoronaBalltBox <= 0 && citizen.coronaInsulation) {
			return false;
		}
		if (citizen instanceof AdultCitizen && presentRegularBox <= 0 && !(citizen.coronaInsulation)) {
			return false;
		}

		int random = (int) Math.random() * listOfBox.length;
		boolean temp = true;

		while (temp) {

			if (citizen instanceof Soldier) {

				if (citizen.getCoronaInsulation()) {

					if (presentCoronaBalltBox > 0) {

						listOfBox[random].AddCitizen(citizen);
						temp = false;
					}
				} else if (presentSoldiredBalltBox > 0) {

					listOfBox[random].AddCitizen(citizen);
					temp = false;
				}

			}
			if (citizen instanceof AdultCitizen) {

				if (citizen.getCoronaInsulation()) {

					if (presentCoronaBalltBox > 0) {

						listOfBox[random].AddCitizen(citizen);
						temp = false;
					}
				} else if (presentRegularBox > 0) {

					listOfBox[random].AddCitizen(citizen);
					temp = false;
				}

			}

		}
		return true;
	}

	public Party[] getListOfParty() {
		return listOfParty;
	}

	public void setParty(Party newParty) throws Exception, ArrayIndexOutOfBoundsException {

		this.listOfParty[placeInListOfParty] = newParty;

	}

	public BallotBox1[] getListOfBox() {
		return listOfBox;
	}

	public void setBox(BallotBox1 newBox) {

		this.listOfBox[placeInListOfBox++] = newBox;

		if (newBox instanceof SoldiredBalltBox) {
			presentSoldiredBalltBox++;
		}
		if (newBox instanceof CoronaBalltBox) {
			presentCoronaBalltBox++;
		}
		if (!(newBox instanceof SoldiredBalltBox && newBox instanceof CoronaBalltBox)) {
			presentRegularBox++;
		}

	}

	public void AddCandidatesToParty(Candidate candidate, Party party) {

		party.AddCandidates(candidate);}
	

	public void SetPartyToAllBallotBox(Party[] arrayParty) {

		boolean temp = true;
		for (int i = 0; i < listOfBox.length && temp; i++) {

			listOfBox[i].setParty(arrayParty);
			if (listOfBox[i + 1] == null) {
				temp = false;
			}
		}

	}

	public boolean AddVoteToParty(Citizen citizenVote, int num)

	{
		if (listOfParty.length > 0) {
			citizenVote.getBallotBox().AddVoteToParty(num);
			return true;
		}
		return false;
	}

	private void BigArray() { // to use in this class

		Citizen[] temp = new Citizen[2 * placeInvoterRegister];

		for (int i = 0; i < voterRegister.length; i++) {

			temp[i] = voterRegister[i];

		}
		voterRegister = temp;

	}

}