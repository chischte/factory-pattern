package ch.factorypattern;

public class PopSong extends AbstractSong {

	private String ram;
	private String hdd;
	private String cpu;

	public PopSong(final String ram, final String hdd, final String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public void playSong(){
		System.out.println("tadadadada ...this is a pop song" );
	}


}