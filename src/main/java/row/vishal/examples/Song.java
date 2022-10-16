package row.vishal.examples;

import java.util.Objects;

public class Song {
	private String title;
	private String artist;
	private int year;
	private int popularity;
	private String genre;
	
	
	
	public Song(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}
	public Song(String title, String artist, int year, int popularity, String genre) {
		super();
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.popularity = popularity;
		this.genre = genre;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getPopularity() {
		return popularity;
	}
	public void setPopularity(int popularity) {
		this.popularity = popularity;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", year=" + year + ", popularity=" + popularity
				+ ", genre=" + genre + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(artist, genre, popularity, title, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		return Objects.equals(artist, other.artist) && Objects.equals(genre, other.genre)
				&& popularity == other.popularity && Objects.equals(title, other.title) && year == other.year;
	}
	
	

}
