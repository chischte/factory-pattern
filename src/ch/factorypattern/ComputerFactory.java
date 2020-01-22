package ch.factorypattern;

import ch.factorypattern.AbstractComputer;
import ch.factorypattern.PCComputer;
import ch.factorypattern.ServerComputer;

public class ComputerFactory {

	/**
	 * The singleton instance
	 */



	 
	/**
	 * Creates an object
	 */	
	public static AbstractComputer getComputer(String type, String ram, String hdd,
			 String cpu) {
		if ("PC".equalsIgnoreCase(type))
			return new PCComputer(ram, hdd, cpu);
		else if ("Server".equalsIgnoreCase(type))
			return new ServerComputer(ram, hdd, cpu);

		return null;
	}
}
