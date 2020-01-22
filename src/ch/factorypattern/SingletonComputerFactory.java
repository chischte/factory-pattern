package ch.factorypattern;

import ch.factorypattern.AbstractComputer;
import ch.factorypattern.PCComputer;
import ch.factorypattern.ServerComputer;

public class SingletonComputerFactory {

	/**
	 * The singleton instance
	 */

	private static SingletonComputerFactory theInstance = null;
	
	//private SingletonComputerFactory(){		
	//}
	
	public static SingletonComputerFactory getInstance(){		
		if(theInstance == null){
			theInstance = new SingletonComputerFactory();
		}
		
		return theInstance;
	}
		 
	/**
	 * Creates an object
	 */	
	public AbstractComputer getComputer(String type, String ram, String hdd,
			 String cpu) {
		if ("PC".equalsIgnoreCase(type))
			return new PCComputer(ram, hdd, cpu);
		else if ("Server".equalsIgnoreCase(type))
			return new ServerComputer(ram, hdd, cpu);

		return null;
	}
}
