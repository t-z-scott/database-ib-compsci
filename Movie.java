public class Movie {
	
	//instance variables
	private String title;
	private int year;
	private String genre;
	private boolean watched;
	private int length;
		
	public Movie() {}
	
	public Movie( String t, int y, String g, boolean w, int l ) {
		this.title = t;
		this.length = y;
		this.genre = g;
		this.watched = w;
		this.length = l;
	}
	
	//setters & getters
		
	public String getTitle() {
		return title;
	}
		
	public void setTitle(String t) {
		this.title = t;
	}
		
	public String getGenre() {
		return genre;
	}
		
	public void setGenre(String g) {
		this.genre = g;
	}
		
	public int getYear() {
		return year;
	}
		
	public void setYear(int yr) {
		this.year = yr;
	}
		
	public int getLength() {
		return length;
	}
		
	public void setLength(int l) {
		this.length = l;
	}
		
	public boolean getWatched() {
		return watched;
	}
		
	public void setWatched(boolean w) {
		this.watched = w;
	}
}