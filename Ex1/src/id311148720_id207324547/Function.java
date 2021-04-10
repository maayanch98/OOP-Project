package id311148720_id207324547;

import java.time.YearMonth;

public class Function extends Exception {

	public Function() {
	}

	private static YearMonth presentYear = YearMonth.now();
	private static final int intpresentYear = presentYear.getYear();

	public static void CheckingAge(Citizen[] array) throws Exception {

		for (int i = 0; i < array.length; i++) {

			if (intpresentYear - array[i].getYearOfBirth() <= 18) {

				throw new Exception("The age under 18 year old:)");
			}

		}
	}

	public static void CheckingAge1(Citizen c) throws Exception {

		if (intpresentYear - c.getYearOfBirth() <= 18) {

			throw new Exception("The age under 18 year old!!");

		}

	}

	public static void CheckingAgeForSoldier(int YearOfBirth) throws Exception {

		if (intpresentYear - YearOfBirth <= 18 && 21 >= intpresentYear - YearOfBirth) {

			throw new Exception("The age under 18 year old -soldier");

		}

	}

	public static void CheckingAgeAdult(int YearOfBirth) throws Exception {

		if (intpresentYear - YearOfBirth < 21) {

			throw new Exception("The age up to 18 year old");

		}
	}

	public static void CheckingAgeMinor(int YearOfBirth) throws Exception {

		if (intpresentYear - YearOfBirth > 18) {

			throw new Exception("The age under 18 year old99");

		}

	}

	public static Citizen[] CopyArrayCitizen(Citizen[] array) throws Exception {

		Citizen[] temp = new Citizen[array.length];

		for (int i = 0; i < array.length; i++) {

			if (array[i] instanceof Soldier) {
				temp[i] = new Soldier((Soldier) array[i]);
			}

			if (array[i] instanceof MinorCitizen) {
				temp[i] = new MinorCitizen((MinorCitizen) array[i]);
			}

			if (array[i] instanceof AdultCitizen) {
				temp[i] = new AdultCitizen((AdultCitizen) array[i]);
			}

		}
		return temp;
	}

	public static Party[] CopyArrayParty(Party[] array) {

		Party[] temp = new Party[array.length];

		for (int i = 0; i < array.length; i++) {

			temp[i] = new Party(array[i]);
		}
		return temp;
	}
	
	

}
