/**
 * Music App
 * 
 * @author Michael Wettstein
 */

package ch.factorypattern;

public class MusicApp {

	public static void main(final String[] args) {
		SingletonMusicFactory computerFactory = SingletonMusicFactory.getInstance();
		AbstractSong aClassicSong = computerFactory.getComputer("Classic", "Symphony No.9", "Bach");
		AbstractSong aPopSong = computerFactory.getComputer("Pop", "Toxic", "Britney Spears");
		AbstractSong anotherPopSong = computerFactory.getComputer("Pop", "Another Day", "Phil Collins");
		aClassicSong.playSong();
		aPopSong.playSong();
		anotherPopSong.playSong();
		
	}
}