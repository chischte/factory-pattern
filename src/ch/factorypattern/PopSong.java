package ch.factorypattern;

public class PopSong extends AbstractSong {

	private String title;
	private String interpret;
	
	public PopSong(final String title, final String interpret) {
		this.title = title;
		this.interpret = interpret;
			}

	@Override
	public void playSong(){
		System.out.print("lalalalala ...this is a pop song by " );
		System.out.println(interpret);

	}


}