package id311148720_id207324547;

import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.time.format.TextStyle;
import java.util.Locale;

import id311148720_id207324547.Party.StreamType;

public class tryrr {

	public static void main(String[] args) throws Exception {

		
		
		try {
			
			
			Elections omri = new Elections(Month.AUGUST ,2026);
			
			AdultCitizen a = new AdultCitizen("omri" , 1990 , "311145432" ,false);
			Soldier b = new Soldier("omri" , 2001 , "311145432" ,false);
			Soldier c = new Soldier("omri" , 2001 , "311111132" ,false);
			Address tempAdd = new Address("tel","gggg", 10);
			RegularBalltBox temp = new RegularBalltBox(tempAdd);
			SoldiredBalltBox  temp2 = new SoldiredBalltBox (tempAdd);
			omri.setBox(temp);
			omri.setBox(temp2);
			
			omri.setCitizen(a);	
			
			
			Citizen [] d;
			
			
		
			
			omri.setCitizen(b);
			 d=omri.getVoterRegister();
			 
			 omri.setCitizen(c);
			 d=omri.getVoterRegister();
			
			
			System.out.println(	d[0]);
			System.out.println(	d[1]);
			System.out.println(	d[2]);
			
		
		}

		catch (Exception e) {

			System.out.println(e.getMessage());

		}
		
	}

}
