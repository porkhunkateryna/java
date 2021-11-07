package t6_5;

import java.util.ArrayList;

public class Main {
public static void main(String[] args) {
		
		Audiotrack track1 = new Audiotrack(0, 44100, 16, 2, 1, "artist1", "track1", "alb", "1995", "Rock", "plst");
		Audiotrack track2 = new Audiotrack(320, 0, 0, 2, 4, "artist2", "track3", "alb", "1995", "Rap", "plst");
		Audiotrack track3 = new Audiotrack(0, 96000, 32, 1, 1, "artist3", "track3", "alb", "1995", "Rock", "plst");
		Audiotrack track4 = new Audiotrack(144, 0, 0, 1, 4, "artist4", "track4", "alb", "1995", "Rock", "plst");
		Audiotrack track5 = new Audiotrack(0, 192000, 32, 2, 1, "artist5", "track5", "alb", "1995", "Pop", "plst");
		Audiotrack track6 = new Audiotrack(320, 0, 0, 2, 4, "artist6", "track6", "alb", "1995", "Pop", "plst");
		Audiotrack[] tracks= {track1, track2, track3, track4, track5, track6};
		Playlist playlist = new Playlist(tracks);
		System.out.println(playlist);
		playlist.updateByGanres();
		System.out.println("UPDATED");
		System.out.println(playlist);
		
		double a = 201, b = 203;
		int i = 0;
		ArrayList <Audiotrack> plst = playlist.getPlaylist();
		while(true) {
			if ((a <= plst.get(i).length()) & (b >=plst.get(i).length())){
				System.out.println(plst.get(i));
				break;
			}
			i ++;
		}
	}

}
