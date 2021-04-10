package id311148720_id207324547;

import java.time.Month;
import java.util.Scanner;

import id311148720_id207324547.Party.StreamType;

public class ElectuonMain {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		mangmentElection election;

		election = Creat();

		boolean checkingOption = true;

		do {
			System.out.println("please chooice options ");
			System.out.println("[1]");
			System.out.println("[2]");
			System.out.println("[3]");
			System.out.println("[4]");
			System.out.println("[5]");
			System.out.println("[6]");
			System.out.println("[7]");
			System.out.println("[8]");
			System.out.println("[9]");
			System.out.println("[10]");

			int chooiceOption;
			chooiceOption = s.nextInt();

			switch (chooiceOption) {

			case (1): {

				String cityName;
				String addressName;
				int addressNumber;
				int chooiceBallotBox;

				System.out.println("chooice type of balltbox? [1-3]");
				chooiceBallotBox = s.nextInt();
				s.nextLine();
				System.out.println("please enter a city name;");
				cityName = s.nextLine();

				System.out.println("please enter a address name;");
				addressName = s.nextLine();

				System.out.println("please enter a address number;");
				addressNumber = s.nextInt();
				s.nextLine();
				Address tempAdd = new Address(cityName, addressName, addressNumber);
				switch (chooiceBallotBox) {

				case (1): {

					try {

						RegularBalltBox temp = new RegularBalltBox(tempAdd);
						election.Addbox(temp);
						System.out.println("The Ballot Box are created successfully");
						checkingOption = false;
						break;
					} catch (Exception e) {

						e.getMessage();
						checkingOption = false;
						break;
					}

				}

				case (2): {

					try {

						CoronaBalltBox temp = new CoronaBalltBox(tempAdd);
						election.Addbox(temp);
						System.out.println("The Ballot Box are created successfully");
						checkingOption = false;
						break;
					} catch (Exception e) {

						e.getMessage();
						checkingOption = false;
						break;
					}

				}

				case (3): {

					try {

						SoldiredBalltBox temp = new SoldiredBalltBox(tempAdd);
						election.Addbox(temp);
						System.out.println("The Ballot Box are created successfully");
						checkingOption = false;
						break;
					} catch (Exception e) {

						e.getMessage();
						checkingOption = false;
						break;
					}

				}
			

				}
			}
			break;

			case (2):

			{
				boolean checkingWhile = true;

				while (checkingWhile) {

					try {
						String Name;
						String idNum;
						int yearOfBirth;
						boolean coronaIsulatins = false;
						char idnum_char;
						int chooiceCitizen;
						boolean checking_char = true;

						System.out.println("chooice type of Ctizen? [1-4]");
						chooiceCitizen = s.nextInt();
						s.nextLine();
						System.out.println("please enter a name;");
						Name = s.nextLine();

						System.out.println("please enter a yearOfBirth;");
						yearOfBirth = s.nextInt();
						s.nextLine();

						System.out.println("please enter  your ID number;");
						idNum = s.nextLine();

						while (checking_char) {

							System.out.println("Are you in isolation?[Y/N];");
							idnum_char = s.next().charAt(0);

							if (idnum_char == 'n' || idnum_char == 'N') {
								coronaIsulatins = false;
								checking_char = false;
							}
							if (idnum_char == 'y' || idnum_char == 'Y') {
								coronaIsulatins = true;
								checking_char = false;
							}

						}

						switch (chooiceCitizen) {

						case (1): {

							try {
								AdultCitizen temp = new AdultCitizen(Name, yearOfBirth, idNum, coronaIsulatins);
								election.AddCitizen(temp);
								System.out.println("The Citizen are created successfully");
								checkingOption = false;
								checkingWhile = true;

								break;
							} catch (Exception e) {

								System.out.println(e.getMessage());

							}
							break;
						}

						case (2): {

							try {
								MinorCitizen temp = new MinorCitizen(Name, yearOfBirth, idNum, coronaIsulatins);
								election.AddCitizen(temp);
								System.out.println("The Ballot Box are created successfully  (but cant to enter to list of votes)");
								checkingOption = false;
								checkingWhile = true;

								break;
							} catch (Exception e) {

								System.out.println(e.getMessage());

							}
							break;
						}

						case (3): {

							try {
								Soldier temp = new Soldier(Name, yearOfBirth, idNum, coronaIsulatins);
								election.AddCitizen(temp);
								System.out.println("The Ballot Box are created successfully");
								checkingOption = false;
								checkingWhile = true;

								break;
							} catch (Exception e) {

								System.out.println(e.getMessage());

							}
							break;
						}
						case (4): {

							try {

								Candidate  temp = new Candidate(Name, yearOfBirth, idNum, coronaIsulatins);
								election.AddCitizen(temp);
								System.out.println("The Ballot Box are created successfully");
								checkingOption = false;
								checkingWhile = true;

								break;
							} catch (Exception e) {

								System.out.println(e.getMessage());

							}
							break;
						}

						}

					}

					catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
			}

			case (3): {
				String nameOfParty;
				StreamType stream;
				System.out.println("please enter name of party");
				nameOfParty = s.nextLine();
				System.out.println("please enter stream of party:");
				System.out.println(StreamType.CENTRAL);
				System.out.println(StreamType.LEFT);
				System.out.println(StreamType.RIGHT);
				stream=StreamType.valueOf(s.nextLine());
				// month = Month.MARCH;
				checkingOption = false;
				break;
			}
			case (4): {
				// month = Month.APRIL;
				checkingOption = false;
				break;
			}
			case (5): {
				// month = Month.MAY;
				checkingOption = false;
				break;
			}
			case (6): {
				// month = Month.JUNE;
				checkingOption = false;
				break;
			}
			case (7): {
				// month = Month.JULY;
				checkingOption = false;
				break;
			}
			case (8): {
				// month = Month.AUGUST; // votes
				checkingOption = false;
				break;
			}
			case (9): {
				// month = Month.SEPTEMBER; //results
				checkingOption = false;
				break;
			}
			case (10): {
				// month = Month.OCTOBER; //exit
				checkingOption = true;
				break;
			}
			case (11): {
				// month = Month.OCTOBER;
				checkingOption = true;
				break;
			}
			default: {
				System.out.println("Error: please chooice option [1-10]");
			}
			}
		}

		while (!checkingOption);
		{

			System.out.println("buy buy :-) ");
		}

	}

	public static mangmentElection Creat() {

		int chooiceMonth;
		int chooiceYear;
		boolean checkingMonth = true;
		boolean checkingYear = true;
		Month month = null;
		mangmentElection election = null;
		Scanner s = new Scanner(System.in);

		while (checkingMonth || checkingYear)

		{
			try {

				while (checkingMonth) {

					System.out.println("please enter a month of election");
					System.out.println("[1]- january");
					System.out.println("[2]- February");
					System.out.println("[3]- March");
					System.out.println("[4]- April ");
					System.out.println("[5]- May");
					System.out.println("[6]- June");
					System.out.println("[7]- July");
					System.out.println("[8]- August");
					System.out.println("[9]- September");
					System.out.println("[10]- October");
					System.out.println("[11]- November");
					System.out.println("[12]- December");

					chooiceMonth = s.nextInt();
					s.nextLine();

					switch (chooiceMonth) {

					case (1): {
						month = Month.JANUARY;
						checkingMonth = false;
						break;
					}
					case (2): {
						month = Month.FEBRUARY;
						checkingMonth = false;
						break;
					}
					case (3): {
						month = Month.MARCH;
						checkingMonth = false;
						break;
					}
					case (4): {
						month = Month.APRIL;
						checkingMonth = false;
						break;
					}
					case (5): {
						month = Month.MAY;
						checkingMonth = false;
						break;
					}
					case (6): {
						month = Month.JUNE;
						checkingMonth = false;
						break;
					}
					case (7): {
						month = Month.JULY;
						checkingMonth = false;
						break;
					}
					case (8): {
						month = Month.AUGUST;
						checkingMonth = false;
						break;
					}
					case (9): {
						month = Month.SEPTEMBER;
						checkingMonth = false;
						break;
					}
					case (10): {
						month = Month.OCTOBER;
						checkingMonth = false;
						break;
					}
					case (11): {
						month = Month.NOVEMBER;
						checkingMonth = false;
						break;
					}
					case (12): {
						month = Month.DECEMBER;
						checkingMonth = false;
						break;
					}
					default: {
						System.out.println("Error: please chooice option [1-12]");
					}
					}
				}

				while (checkingYear) {
					System.out.println("please enter a Year of election");
					chooiceYear = s.nextInt();

					election = new mangmentElection(month, chooiceYear);

					checkingYear = false;

				}

			}

			catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}

		return election;

	}
}
