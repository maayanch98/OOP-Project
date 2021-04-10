package id311148720_id207324547;

public abstract class BallotBox1 {

	protected static Function F = new Function(); // to checking
	protected static int counterSerialNum = 1000;
	protected Citizen[] listOfCitizen;
	protected int sizeOfListCitizen = 100;
	protected Party[] listOfparty;
	protected int sizeOfListParty = 100;
	protected int priesentCitizenInTheList = 0; // its for counter the Citizen
	protected Address address;
	protected int SerialNum;
	protected final static int presentYear = 2021;
	protected static int mayVote = 18;

	public BallotBox1(Address address) throws Exception {
		setAddress(address);
		SerialNum = counterSerialNum++;
		listOfCitizen = new Citizen[sizeOfListCitizen];
		listOfparty = new Party[sizeOfListParty];

	}

	public BallotBox1(BallotBox1 copy) throws Exception {
		setAddress(new Address(copy.address));
		SerialNum = copy.SerialNum;
		listOfCitizen = F.CopyArrayCitizen(copy.listOfCitizen);
		listOfparty = F.CopyArrayParty(copy.getParty());

	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setParty(Party[] nameparty) {

		listOfparty = F.CopyArrayParty(nameparty);

	}

	public Party[] getParty() {

		return listOfparty;
	}

	public void AddVoteToParty(int partyname) {

		listOfparty[partyname - 1].AddVotes();

	}

	public String getVote(int partyname) {

		return listOfparty[partyname - 1].getName();

	}

	public Citizen[] getListOfCiziten() {
		return listOfCitizen;
	}

	abstract public boolean AddCitizen(Citizen newcitizen);

	public boolean equals(Object newobject) {

		if (!(newobject instanceof BallotBox1)) {
			return false;

		}

		boolean checking = true;
		BallotBox1 temp = (BallotBox1) newobject;

		for (int i = 0; i < listOfCitizen.length; i++) {

			if (!(listOfCitizen[i].equals(temp.getListOfCiziten()[i]))) {
				checking = false;
			}

		}

		return address.equal(temp.getAddress()) && checking;

	}

	public String toString() {

		StringBuffer B = new StringBuffer(address.toString());
		B.append("The several number of BallotBox: " + SerialNum + "\n\n");

		for (int i = 0; i < priesentCitizenInTheList; i++) {

			B.append(listOfCitizen[i].toString() + "\n");

		}

		return B.toString();
	}

}
