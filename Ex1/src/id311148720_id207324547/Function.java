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

				throw new Exception("The age under 18 year old");
			}

		}
	}

	
}
