package net.mehrad.mapinfo2kml.mif;

import java.util.List;

/**
 * 
 * @author Mehrad
 *
 */
public class MifPLine extends MifData{

	private List<List<MifCoordinate>> points;
	private MifPen mifPen;
	
	public List<List<MifCoordinate>> getPoints() {
		return points;
	}
	public void setPoints(List<List<MifCoordinate>> points) {
		this.points = points;
	}
	public MifPen getMifPen() {
		return mifPen;
	}
	public void setMifPen(MifPen mifPen) {
		this.mifPen = mifPen;
	}
	
	
}