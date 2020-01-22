package ch.factorypattern;
// import statements in this case optional:
import ch.factorypattern.AbstractSong;
import ch.factorypattern.PopSong;
import ch.factorypattern.ClassicSong;

public class MusicFactory {

	/**
	 * The singleton instance
	 */

	private static MusicFactory theInstance = null;
	
	// Private Constructor
	// will prevent the instantiation of this class directly
	private MusicFactory() {
	}
	
	public static MusicFactory getInstance(){		
		if(theInstance == null){
			theInstance = new MusicFactory();
		}
		return theInstance;
	}
		 
	// Creates objects:
	
	public AbstractSong createSong(String type, String title, String interpret) {
		if ("Classic".equalsIgnoreCase(type))
			return new ClassicSong(title, interpret);
		else if ("Pop".equalsIgnoreCase(type))
			return new PopSong(title, interpret);

		return null;
	}
}
