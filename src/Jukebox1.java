
//import java.io.BufferedReader;
import java.io.*;
//import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Jukebox1 {
	// it will sort directly without sort method
	// TreeSet<String> songList = new TreeSet<String>();

	ArrayList<String> songList = new ArrayList<String>();

	public static void main(String[] args) {
		new Jukebox1().go();
	}

	public void go() {
		getSongs();
		Collections.sort(songList);
		System.out.println(songList);
	}

	void getSongs() {

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

	void addSong(String lineToParse) {
		String[] tokens = lineToParse.split("/");
		songList.add(tokens[0]);

	}

}
