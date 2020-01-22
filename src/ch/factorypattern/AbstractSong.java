
package ch.factorypattern;
//
public abstract class AbstractSong implements SongInterface{
	
	private int chartNo;

	// implementation of interface methods:
	public void setChartPlacement(int chartNo)
	{
		this.chartNo=chartNo;
	}
	public int getChartPlacement()
	{
		return this.chartNo;
	}

	// interface method to be implemented
	// listed for information only:
	public abstract void playSong();
}