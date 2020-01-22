/**
 * Music App
 * 
 * @author Michael Wettstein
 */

package ch.factorypattern;

public class MusicApp {

	public static void main(final String[] args) {
		// create factory:
		MusicFactory musicFactory = MusicFactory.getInstance();
		// create songs:
		AbstractSong aClassicSong = musicFactory.createSong("Classic", "Symphony No.9", "Bach");
		AbstractSong aPopSong = musicFactory.createSong("Pop", "Toxic", "Britney Spears");
		AbstractSong anotherPopSong = musicFactory.createSong("Pop", "Another Day", "Phil Collins");
		// get info:
		System.out.println(aPopSong.getInterpret());
		System.out.println(anotherPopSong.getTitle());
		System.out.println(aClassicSong.getTitle());
		// set/get chart placement:
		aPopSong.setChartPlacement(22);
		System.out.println(aPopSong.getChartPlacement());
	}
}