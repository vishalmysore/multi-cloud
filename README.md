# Multi Cloud Function

A Museum of Pink Floyd songs, this is what I used to listen while writing millions of line of code!

checkout the code and run 

```
mvn clean install 
```

Run the main program <b>row.vishal.examples.SongsCollection</b> through your IDE or run through maven

```
mvn clean install spring-boot:run

```

once its up and running you can call the functional end points in this way


```
curl http://localhost:8080/getSongs
```

will return 

```
{"listOfSongs":[{"title":"Dark Side of the Moon","artist":"Pink Floyd","year":0,"popularity":0,"genre":null}]}
```

add a song

```
curl -X POST http://localhost:8080/addSong -H "Content-Type: application/json" -d "{title=hello,artist='pink floyd',year=1967, genre=rock, popularity=1000}"
```

this will not return any value as its a functional consumer.

get all songs

```
curl http://localhost:8080/getAllSongs
```

Songs are stored in memory and once the program restarts the data is cleared