/**
 * Music App
 * 
 * @author Michael Wettstein
 */

package ch.factorypattern;

public class MusicApp {

	public static void main(final String[] args) {
		MusicFactory musicFactory = MusicFactory.getInstance();
		AbstractSong aClassicSong = musicFactory.getSong("Classic", "Symphony No.9", "Bach");
		AbstractSong aPopSong = musicFactory.getSong("Pop", "Toxic", "Britney Spears");
		AbstractSong anotherPopSong = musicFactory.getSong("Pop", "Another Day", "Phil Collins");
		System.out.println(aPopSong.getInterpret());
		System.out.println(anotherPopSong.getTitle());
		System.out.println(aClassicSong.getTitle());
		aPopSong.setChartPlacement(22);
		System.out.println(aPopSong.getChartPlacement());
	}
}