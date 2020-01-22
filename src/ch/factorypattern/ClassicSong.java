package ch.factorypattern;

public class ClassicSong extends AbstractSong {

	private String title;
	private String interpret;

	public ClassicSong(String title, String interpret) {
		this.title = title;
		this.interpret = interpret;
	}

	@Override
	 public String getTitle() {
		return title;
	}
	@Override
	public String getInterpret() {
		return interpret;
	}

}