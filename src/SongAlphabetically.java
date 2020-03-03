import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SongAlphabetically {
	public static void main(String[] args) {
		System.out.println("Enter the number of songs: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println("Enter the songs list: ");
		String[] songs = new String[n];
		ArrayList<String> song = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			songs[i] = scanner.next();
			song.add(songs[i]);
			Collections.sort(song);

		}
		System.out.println(song);

	}

}
