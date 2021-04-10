package id311148720_id207324547;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Party {

	public final static int numOfCandidates = 120;
	private int numOfActualCandidates = 0;
	private String name;
	private Candidate [] Candidates;
	private StreamType stream;
	String DateCreatedParty;
	private final int presentYear = 2021;
	private int totalVotes = 0;

	public enum StreamType {
		CENTRAL, LEFT, RIGHT,
	}

	public Party(String name, StreamType stream) {
		setName(name);
		setStream(stream);
		setNormalDate();
		Candidates = new Candidate [numOfCandidates];
	}

	public Party(Party copy) {

		setName(copy.name);
		setStream(copy.stream);
		this.DateCreatedParty = copy.DateCreatedParty;
		Candidates = new Candidate [numOfCandidates];

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

	public int getTotalVotes() {
		return totalVotes;
	}

	public void AddVotes() {
		totalVotes++;
	}

	public void AddCandidates(Candidate  newcandidates) {

		Candidates[numOfActualCandidates++] = newcandidates;

	}

	private void setNormalDate() {

		LocalDate temp = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.DateCreatedParty = temp.format(dtf);

	}

}
