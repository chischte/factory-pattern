package ch.factorypattern;

public class PCComputer extends AbstractComputer {

	private String ram;
	private String hdd;
	private String cpu;

	public PCComputer(final String ram, final String hdd, final String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public void playSong(){

	}

	@Override
	public void showInterpret(){

	}

}