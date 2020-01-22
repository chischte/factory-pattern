package ch.factorypattern;

public abstract class AbstractSong implements SongInterface{
	
	private int chartNo;

	// implementation of interface methods:
	// two interface methods are not implemented here: getTitle(), getInterpret)
	// they have to be implemented in the descendant classes
	public void setChartPlacement(int chartNo)
	{
		this.chartNo=chartNo;
	}

	public int getChartPlacement()
	{
		return this.chartNo;
	}
}