package id311148720_id207324547;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

import id311148720_id207324547.Party.StreamType;

public class tryrr {

	public static void main(String[] args) throws Exception {
		Citizen[] c = new Citizen[2];
		Party p;
		Address a = new Address("tel aviv", "derch htyasim", 120);
		try {

			c[0] = new Citizen("omri1", 1993, "311448720", true);
			c[1] = new Citizen("omri2", 1993, "311148720", true);
			// c[2] = new Citizen("omri3", 1993, "311148720", true);

			p = new Party("blue_white", StreamType.LEFT);

			System.out.println(p.AddCandidates(c[0], 10));
			System.out.println(p.AddCandidates(c[1], 10));
			System.out.println(p.getNumOfActualCandidates());

			BallotBox1 b;
			b = new CoronaBalltBox(a, c);

			System.out.println(b);

		}

		catch (Exception e) {

			System.out.println(e.getMessage());

		}

	}

}
