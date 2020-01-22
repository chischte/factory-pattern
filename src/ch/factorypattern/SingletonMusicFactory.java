package ch.factorypattern;

import ch.factorypattern.AbstractComputer;
import ch.factorypattern.PCComputer;
import ch.factorypattern.ServerComputer;

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
	public AbstractComputer getComputer(String type, String ram, String hdd,
			 String cpu) {
		if ("Classic".equalsIgnoreCase(type))
			return new PCComputer(ram, hdd, cpu);
		else if ("Pop".equalsIgnoreCase(type))
			return new ServerComputer(ram, hdd, cpu);

		return null;
	}
}
