import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JukeBox3 {
	ArrayList<Song> songList = new ArrayList<Song>();

	public static void main(String[] args) {
		new JukeBox3().go();
	}

	class ArtistCompare implements Comparator<Song> {
		public int compare(Song one, Song two) {
			return one.getArtist().compareTo(two.getArtist());

		}
	}

	private void go() {
		getSongs();
		
		Collections.sort(songList);
		System.out.println(songList);
		ArtistCompare artistCompare = new ArtistCompare();
		Collections.sort(songList, artistCompare);
		System.out.println(songList);
	}

	private void getSongs() {

		try {
			File file = new File("/Users/vineeta/Workspace/Collections/src/SongList");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = reader.readLine()) != null) {
				addSong(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void addSong(String lineToParse) {
		String[] tokens = lineToParse.split("/");
		Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
		songList.add(nextSong);

	}

}
