import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class JukeBox2 {
	// TreeSet<Song> songList = new TreeSet<Song>();
	 ArrayList<Song> songList = new ArrayList<Song>();

	public static void main(String[] args) {
		new JukeBox2().go();

	}

	private void go() {
		getSongs();
		System.out.println(songList);
		 Collections.sort(songList);
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
