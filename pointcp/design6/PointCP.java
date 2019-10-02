
public interface PointCP {
	  
	  //Instance methods **************************************************
	 
	  public double getX();
	  public double getY();
	  public double getRho();
	  public double getTheta();
	  
	  public void convertStorageToPolar();
	  public void convertStorageToCartesian();
	  
	  public double getDistance(PointPolar pointB);
	  public double getDistance2(PointCartesian pointB);

	  public PointCartesian rotatePoint2(double rotation);
	  public PointPolar rotatePoint(double rotation);


		
	  
	  /**
	   * Returns information about the coordinates.
	   *
	   * @return A String containing information about the coordinates.
	   */
	  public String toString();
}
