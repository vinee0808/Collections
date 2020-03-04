
public class Song implements Comparable<Song> {
	String title;
	String artist;
	String rating;
	String bpm;

	public Song(String title, String artist, String rating, String bpm) {
		this.title = title;
		this.artist = artist;
		this.rating = rating;
		this.bpm = bpm;
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public String getRating() {
		return rating;
	}

	public String getBpm() {
		return bpm;
	}

	@Override
	public String toString() {
		return this.artist + "/" + this.title + "/" + this.rating + "/" + this.bpm;
	}

	@Override
	public int compareTo(Song o) {
		return title.compareTo(o.getTitle());
	}

}
