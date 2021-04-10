package id311148720_id207324547;

public abstract class Citizen {

	protected final static int presentYear = 2021;
	protected Function F = new Function();
	protected boolean coronaInsulation;
	protected BallotBox1 ballotBox;
	protected int yearOfBirth;
	protected String name;
	protected String idNum;

	public Citizen(String name, int yearOfBirth, String idNum, boolean coronaIsulatins) throws Exception {
		ballotBox = null;// to be able to use method
		setName(name);
		setIdNum(idNum);// throws Exception
		setYearOfBirth(yearOfBirth);// throws Exception
		this.coronaInsulation = coronaIsulatins;

	}

	public Citizen(Citizen copy) throws Exception {

		this(copy.name, copy.yearOfBirth, copy.idNum, copy.coronaInsulation);

	}

	public void setName(String name) {

		this.name = name;
	}

	public String getName() {

		return name;
	}

	abstract void setYearOfBirth(int YearOfBirth) throws Exception;

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public boolean getCoronaInsulation() {
		return coronaInsulation;
	}

	public void setCoronaInsulation(boolean coronaInsulation) {
		this.coronaInsulation = coronaInsulation;
	}

	private void setIdNum(String idNum) throws Exception {

		CheckId(idNum);
		this.idNum = idNum;

	}

	public String getIdNum() {

		return idNum;
	}

	public BallotBox1 getBallotBox() {
		return ballotBox;
	}

	public boolean setBallotBox(BallotBox1 newballotBox) {

		if (newballotBox instanceof CoronaBalltBox) {

			if (coronaInsulation == true) {
				if (presentYear - yearOfBirth >= 18) {

					this.ballotBox = newballotBox;

					return true;

				}
				return false;
			}

		}

		if (newballotBox instanceof SoldiredBalltBox) {

			if (presentYear - yearOfBirth >= 18 && presentYear - yearOfBirth <= 21) {

				if (coronaInsulation == false) {
					this.ballotBox = newballotBox;
					return true;

				}
				return false;
			}

		}

		if (newballotBox instanceof RegularBalltBox) {

			if (presentYear - yearOfBirth >= 18) {

				if (coronaInsulation == false) {
					this.ballotBox = newballotBox;
					return true;

				}
				return false;
			}

		}

		return false;
	}

	public boolean equals(Object obj) {

		if (!(obj instanceof Citizen)) {
			return false;
		}

		Citizen temp = (Citizen) obj;
		return name.equals(temp.getName()) && yearOfBirth == temp.yearOfBirth && idNum.equals(temp.getIdNum());
	}

	public String toString() {

		return "The name is: " + name + "\n" + "The year of birth is: " + yearOfBirth + "\n" + "The id number is: "
				+ idNum + "\n" + "The ballot box to which it is associated: " + ballotBox.getClass().getSimpleName()
				+ "\n" + "Is it in isolation? " + coronaInsulation + "\n";

	}

	private void CheckId(String id) throws Exception { // Method for  this class

		boolean temp = true;

		if (id.length() != 9) {
			throw new Exception("Erorr: Please enter 9 digits");

		}

		try { 						//  Because the command are throws Exception (Integer.parseInt(id))
			Integer.parseInt(id);

		}

		catch (NumberFormatException e) {
			throw new Exception("Erorr: Please enter  digits ");

		}

	}

}