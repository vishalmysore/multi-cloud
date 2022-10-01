package row.vishal.examples;

import java.util.HashMap;
import java.util.Map;

public class DataHolder {
	
	private static DataHolder dataHolder = new DataHolder();

	private Map<String,Object> dataStore = new HashMap<>();
	private DataHolder() {
		
	}
	
	public static DataHolder getDataHolder() {
		return dataHolder;
	}

	public Map<String, Object> getDataStore() {
		return dataStore;
	}
}
