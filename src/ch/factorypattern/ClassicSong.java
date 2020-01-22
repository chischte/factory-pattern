package ch.factorypattern;

public class ClassicSong extends AbstractSong {

	private String ram;
	private String hdd;
	private String cpu;

	public ClassicSong(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public void playSong(){
		System.out.println("tadadadada ...this is a pop song" );
	}


}