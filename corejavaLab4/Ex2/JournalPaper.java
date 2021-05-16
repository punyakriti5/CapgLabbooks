package capg.lab4.Ex2;


public class JournalPaper extends WrittenItem {
	private int year;

	public JournalPaper(int uniqidnum, String title, int numcopies, String author, int year) {
		super(uniqidnum, title, numcopies, author);
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	void additem() {
		

	}

	@Override
	void checkIn() {
		
	}

	@Override
	void checkOut() {
		
	}

	@Override
	void print() {
		

	}

}