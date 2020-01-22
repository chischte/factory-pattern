
package ch.factorypattern;
//
public abstract class AbstractSong implements SongInterface{
	
	
	public void setChartPlacement(int chartNo)
	{}
	public int getChartPlacement()
	{
		return 10;
	}

	// interface methods to be implemented:
	// listed for information only
	public abstract void playSong();

	
}