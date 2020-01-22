package ch.factorypattern;

public interface SongInterface{

    public void setChartPlacement(int chartNo);
	
    public abstract int getChartPlacement();

    public abstract String getTitle();

    public abstract String getInterpret();

}
