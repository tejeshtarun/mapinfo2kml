package net.mehrad.mapinfo2kml.mif;

/**
 * 
 * @author Mehrad
 *
 */
public class MifPoint extends MifData{

	private MifCoordinate coordinate;
	private MifSymbol symbol;
	
	public MifCoordinate getCoordinate() {
		return coordinate;
	}
	public void setCoordinate(MifCoordinate coordinate) {
		this.coordinate = coordinate;
	}
	public MifSymbol getSymbol() {
		return symbol;
	}
	public void setSymbol(MifSymbol symbol) {
		this.symbol = symbol;
	}
	
	
	
	
}
