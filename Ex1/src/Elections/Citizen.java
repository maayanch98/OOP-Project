package id311148720_id207324547;

public class Citizen {

	private String name;
	private int yearOfBirth;
	private String idNum;
	private BallotBox1 ballotBox;
	private boolean coronaInsulation;
	private final static int presentYear = 2021;

	public Citizen(String name, int yearOfBirth, String idNum, boolean coronaIsulatins) throws Exception {

		setName(name);
		setYearOfBirth(yearOfBirth);
		setIdNum(idNum);
		ballotBox = null;
this.coronaInsulation=coronaIsulatins;
	}

	public void setName(String name) {

		this.name = name;
	}

	public String getName() {

		return name;
	}

	private void setYearOfBirth(int newYearOfBirth) {
		this.yearOfBirth = newYearOfBirth;
	}

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
				if (presentYear - yearOfBirth > 18) {
					
					this.ballotBox = newballotBox;
					
					return true;
					
					
				}
				return false;
			}

		} else if (newballotBox instanceof SoldiredBalltBox) {

			if (presentYear - yearOfBirth >= 18 && presentYear - yearOfBirth <= 21) {

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
				+ idNum + "\n" + "The ballot box to which it is associated: " + ballotBox.getClass().getSimpleName() + "\n"
				+ "Is it in isolation? " + coronaInsulation + "\n";

	}

	public void CheckId(String id) throws Exception { // Private Function for SetID

		boolean temp = true;

		if (id.length() != 9) {

			throw new Exception("Erorr: Please enter 9 digits");

		}

		try {
			Integer.parseInt(id);

		}

		catch (NumberFormatException e) {
			throw new Exception("Erorr: Please enter  digits ");

		}

	}

}