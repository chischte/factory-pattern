/**
 * Music App
 * 
 * @author Michael Wettstein
 */

package ch.factorypattern;

public class MusicApp {

	public static void main(final String[] args) {
		SingletonMusicFactory computerFactory = SingletonMusicFactory.getInstance();
		AbstractSong pc = computerFactory.getComputer("Classic", "2 GB", "500 GB", "2.4 GHz");
		AbstractSong server = computerFactory.getComputer("Pop", "16 GB", "1 TB", "2.9 GHz");
		pc.playSong();
		server.playSong();
		
	}
}