package id311148720_id207324547;

import java.time.YearMonth;

public class Elections {

	private static Function F = new Function();
	private Citizen[] voterRegister;
	private static int numOfvoterRegister = 100;
	private static int numOfParty = 100;
	private static int numBallotBox = 100;
	private Party[] listOfParty;
	private BallotBox1[] listOfBox;
	int month;
	int year;
	private static int presentYear = 2021;

	public int getMonth() {
		return month;
	}

	public boolean setMonth(int month) {
		if (month > 12 || month < 1) {
			return false;
		}
		this.month = month;
		return true;
	}

	public int getYear() {
		return year;
	}

	public boolean setYear(int year) {
		if (year < presentYear) {
			return false;
		}

		this.year = year;
		return true;
	}

	public Elections(Citizen[] voterRegister, Party[] listOfParety, BallotBox1[] listOfBox, int month, int year)
			throws Exception, ArrayIndexOutOfBoundsException {

		setVoterRegister(voterRegister);
		setListOfParty(listOfParety);
		setListOfBox(listOfBox);
		setYear(year);
		setMonth(month);
	}

	public Citizen[] getVoterRegister() {
		return voterRegister;
	}

	public void setVoterRegister(Citizen[] voterRegister) throws Exception, ArrayIndexOutOfBoundsException {

		F.CheckingAge(voterRegister);

		for (int i = 0; i < voterRegister.length; i++) {
			this.voterRegister = new Citizen[numOfvoterRegister];
			this.voterRegister[i] = voterRegister[i];

		}

	}

	public Party[] getListOfParty() {
		return listOfParty;
	}

	public void setListOfParty(Party[] listOfParty) throws Exception, ArrayIndexOutOfBoundsException {

		for (int i = 0; i < listOfParty.length; i++) {

			this.listOfParty = new Party[numOfParty];
			this.listOfParty[i] = listOfParty[i];
		}

	}

	public BallotBox1[] getListOfBox() {
		return listOfBox;
	}

	public void setListOfBox(BallotBox1[] listOfBox) {

		for (int i = 0; i < listOfParty.length; i++) {

			this.listOfBox = new BallotBox1[numBallotBox];
			this.listOfBox[i] = listOfBox[i];
		}

	}
}
