package ch.factorypattern;

public class ServerComputer extends AbstractComputer {

	private String ram;
	private String hdd;
	private String cpu;

	public ServerComputer(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}


	@Override
	public void playSong(){
		System.out.println("tadadadada ...this is a pop song" );
	}

	@Override
	public void showInterpret(){

	}

}