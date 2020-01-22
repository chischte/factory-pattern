
package ch.factorypattern;

import ch.factorypattern.ComputerFactory;
import ch.factorypattern.AbstractComputer;

public class ComputerApp {

	public static void main(final String[] args) {
		AbstractComputer pc = ComputerFactory.getComputer("pc", "2 GB", "500 GB", "2.4 GHz");
		AbstractComputer server = ComputerFactory.getComputer("server", "16 GB", "1 TB", "2.9 GHz");
		System.out.println("Factory PC Config::" + pc);
		System.out.println("Factory Server Config::" + server);
	}
}