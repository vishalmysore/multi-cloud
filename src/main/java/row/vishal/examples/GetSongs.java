package row.vishal.examples;

import java.util.function.Supplier;

public class GetSongs implements Supplier<Album>{

	@Override
	public Album get() {
		Album album = new Album();
		album.addToList(new Song("Dark Side of the Moon", "Pink Floyd"));
		return album;
	}
}
