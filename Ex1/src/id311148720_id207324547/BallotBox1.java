package id311148720_id207324547;

public class BallotBox1 {

	private static Function F = new Function(); // to checking
	protected static int counterseviralNum = 1000;
	protected int sizeOfList = 100;
	private static int priesentsizeOfList = 0;
	protected int seviraNum;
	protected Address address;
	protected Citizen[] listOfCitizen;
	private final static int presentYear = 2021;

	public BallotBox1(Address address, Citizen[] listOfCiziten) throws Exception {
		this.seviraNum = counterseviralNum++;
		setAddress(address);
		setListOfCitizen(listOfCiziten);

	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Citizen[] getListOfCiziten() {
		return listOfCitizen;
	}

	public void setListOfCitizen(Citizen[] newlistOfCitizen) throws Exception, ArrayIndexOutOfBoundsException {

		F.CheckingAge(newlistOfCitizen);
		this.listOfCitizen = new Citizen[sizeOfList];
		for (int i = 0; i < newlistOfCitizen.length; i++) {

			if (!(newlistOfCitizen[i].getCoronaInsulation() == true)) {

				throw new Exception("we found CoronaInsulation ");
			}
			

			this.listOfCitizen[i] = newlistOfCitizen[i];
			this.listOfCitizen[i].setBallotBox(this);
			priesentsizeOfList++;

		}

	}

	public boolean equals(Object newobject) {

		if (!(newobject instanceof BallotBox1)) {
			return false;
		}
		BallotBox1 temp = (BallotBox1) newobject;
		boolean checking = true;
		for (int i = 0; i < listOfCitizen.length; i++) {

			if (!(listOfCitizen[i].equals(temp.getListOfCiziten()[i]))) {
				checking = false;
			}

		}

		return address.equal(temp.getAddress()) && checking;

	}

	public String toString() {

		
		StringBuffer B = new StringBuffer(address.toString());
		
		
		for (int i = 0; i < priesentsizeOfList; i++) {
			
		B.append(listOfCitizen[i].toString()+"\n");

		}
		
		return B.toString();
	}
}
