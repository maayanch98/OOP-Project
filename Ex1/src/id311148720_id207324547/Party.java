package id311148720_id207324547;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Party {
	
	
	public final static int numOfCandidates = 120;
	private int numOfActualCandidates = 0;
	private String name;
	private Citizen[] Candidates;
	private StreamType stream;
	String DateCreatedParty;
	private int votes=0;
	private final int presentYear=2021;

	

	public enum StreamType {
		CENTRAL, LEFT, RIGHT,
	}

	public Party(String name, StreamType stream) {
		setName(name);
		setStream(stream);
		setNormalDate();
		Candidates = new Citizen[numOfCandidates];
	}

	public int getNumOfActualCandidates() {
		return numOfActualCandidates;
	}

	public String getDateCreatedParty() {
		return DateCreatedParty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StreamType getStream() {
		return stream;
	}

	public void setStream(StreamType stream) {
		this.stream = stream;
	}
	public int getVotes() {
		return votes;
	}

	public void AddVotes() {
		votes++;
	}

	public boolean AddCandidates(Citizen newcandidates ,int placeInPrimaries) {

		if (presentYear - newcandidates.getYearOfBirth() < 18) {
			return false;
		}
			Candidates [numOfActualCandidates++]=newcandidates;
			
			return true;
		
		

	}

	private void setNormalDate() {

		LocalDate temp = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.DateCreatedParty = temp.format(dtf);

	}

}
