package ch.factorypattern;

import ch.factorypattern.AbstractSong;
import ch.factorypattern.PopSong;
import ch.factorypattern.ClassicSong;

public class SingletonMusicFactory {

	/**
	 * The singleton instance
	 */

	private static SingletonMusicFactory theInstance = null;
	
	//private SingletonComputerFactory(){		
	//}
	
	public static SingletonMusicFactory getInstance(){		
		if(theInstance == null){
			theInstance = new SingletonMusicFactory();
		}
		
		return theInstance;
	}
		 
	/**
	 * Creates an object
	 */	
	public AbstractSong getComputer(String type, String title, String interpret) {
		if ("Classic".equalsIgnoreCase(type))
			return new ClassicSong(title, interpret);
		else if ("Pop".equalsIgnoreCase(type))
			return new PopSong(title, interpret);

		return null;
	}
}
