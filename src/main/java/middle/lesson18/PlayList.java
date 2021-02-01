package middle.lesson18;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PlayList {

	public static void main(String[] args) {
		List<Song> songs = new LinkedList<>();
		songs.add(new Song("Beautiful day", "U2", 4.06));
		songs.add(new Song("Song 2", "Blur", 2.02));
		songs.add(new Song("Polska", "Kult", 5.26));
		
		Collections.sort(songs, new DurationComparator());
		
		System.out.println(songs);
	}

}
