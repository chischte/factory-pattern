package ch.factorypattern;

public class PopSong extends AbstractSong {

	private String title;
	private String interpret;
	
	public PopSong(String title, String interpret) {
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