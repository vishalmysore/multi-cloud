package row.vishal.examples;

import java.util.function.Supplier;

public class GetAllSongs implements Supplier<Album>{

	@Override
	public Album get() {
		return (Album)DataHolder.getDataHolder().getDataStore().get("pinkfloyd");
	}
}
