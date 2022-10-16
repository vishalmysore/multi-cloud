package row.vishal.examples;

import java.util.ArrayList;
import java.util.List;

public class Album {

	private List<Song> listOfSongs;
	
	private String title;
	
	private int id;
	
	public Album() {
		listOfSongs = new ArrayList<Song>();
	}
	
	public List<Song> getListOfSongs() {
		return listOfSongs;
	}
	public void setListOfSongs(List<Song> listOfSongs) {
		this.listOfSongs = listOfSongs;
	}
	
	public void addToList(Song song) {
		listOfSongs.add(song);
	}

	@Override
	public String toString() {
		return "Album [listOfSongs=" + listOfSongs + ", title=" + title + ", id=" + id + "]";
	}
	
}
