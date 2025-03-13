import java.util.Collections;
import java.util.Comparator;
import java.util.List;

 public class Jukebox {
  public static void main(String[] args) {
    new Jukebox().go();
  }
  public void go() {
    List<SongV3> songList = MockSongs.getSongsV3();
    System.out.println(songList);
    Collections.sort(songList);
    System.out.println(songList);

    ArtistCompare artistCompare = new ArtistCompare();
    songList.sort(artistCompare);
    System.out.println(songList);

     // Inner class 
      songList.sort(new Comparator<SongV3>() {
          public int compare(SongV3 one, SongV3 two) {
            return one.getTitle().compareTo(two.getTitle());
        }
      });
    System.out.println(songList);

    // lambda expression
     songList.sort((one, two) -> one.getArtist().compareTo(two.getArtist()));
    System.out.println(songList);


  }
 }

class ArtistCompare implements Comparator<SongV3> {
  public int compare(SongV3 one, SongV3 two) {
    return one.getArtist().compareTo(two.getArtist());
  }
 }