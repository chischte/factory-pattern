package ch.factorypattern;

public class ClassicSong extends AbstractSong {

	private String title;
	private String interpret;

	public ClassicSong(String title, String interpret) {
		this.title = title;
		this.interpret = interpret;
	}

	@Override
	public void playSong() {
		System.out.print("tadadadada ...this is a classic song by ");
		System.out.println(interpret);
	}

}