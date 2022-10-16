package row.vishal.examples;

import java.util.function.Consumer;

import com.google.gson.Gson;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class AddSong implements Consumer<String>{

	@Override
	public void accept(String jsonStr) {	 
	   Gson gson = new Gson();
       Song song = gson.fromJson(jsonStr, Song.class);	
       log.info("Song is {}",song); 
       Object obj = DataHolder.getDataHolder().getDataStore().get("pinkfloyd");
       Album album = null;
       if(obj == null ) {
    	   album = new Album();
    	   DataHolder.getDataHolder().getDataStore().put("pinkfloyd",album);
       } else {
    	   album = (Album)obj;
       }
       album.addToList(song);

	}
}
