package ch.factorypattern;

public class PopSong extends AbstractSong {

	private String title;
	private String interpret;
	
	public PopSong(String title, String interpret) {
		this.title = title;
		this.interpret = interpret;
			}

	@Override
	public void playSong(){
		System.out.print("lalalalala ...this is a pop song called " );
		System.out.print(title + " by ");
		System.out.println(interpret);

	}


}