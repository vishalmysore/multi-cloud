package row.vishal.examples;

import java.util.List;

public class Album {

	private List<Song> listOfSongs;
	
	private String title;
	
	private int id;
	
	public List<Song> getListOfSongs() {
		return listOfSongs;
	}
	public void setListOfSongs(List<Song> listOfSongs) {
		this.listOfSongs = listOfSongs;
	}
	
	public void addToList(Song song) {
		listOfSongs.add(song);
	}
}
