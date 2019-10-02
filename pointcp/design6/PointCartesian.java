
public class PointCartesian implements PointCP {
	//Instance variables ************************************************

	  
	  /**
	   * Contains the current value of X or RHO depending on the type
	   * of coordinates.
	   */
	  private double x;
	  
	  /**
	   * Contains the current value of Y or THETA value depending on the
	   * type of coordinates.
	   */
	  private double y;
		
	  
	  //Constructors ******************************************************

	  /**
	   * Constructs a coordinate object, with a type identifier.
	   */
	  public PointCartesian(double x, double y)
	  {
	    this.x = x;
	    this.y = y;
	  }
	  
	  public PointCartesian(double[] Coord)
	  {

	    this.x = Coord[0];
	    this.y = Coord[1];
	  }
	  
	  public PointCartesian(PointPolar polarCoord) {
		  this.x = polarCoord.getX();
		  this.y = polarCoord.getY();
	  }
		
	  
	  //Instance methods **************************************************
	 
	 
	  public double getX()
	  {
	    return x; 
	  }
	  
	  public double getY()
	  {
	    return y;
	  }
	  
	  public double getRho()
	  {
	     return (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
	  }
	  
	  public double getTheta()
	  {
	      return Math.toDegrees(Math.atan2(y, x));
	  }
	  
	  /**
	   * Converts Cartesian coordinates to Polar coordinates.
	   */
	  public void convertStorageToPolar()
	  {
		System.out.println("Value is computed in polar but not stored: " + "[" + getRho() + ", " + getTheta() + "]\n." );
	  }
		
	  /**
	   * Converts Polar coordinates to Cartesian coordinates.
	   */
	  public void convertStorageToCartesian()
	  {
		 System.out.println("Value is stored in cartesian: " + "(" + x + ", " + y + ").\n");
	  }

	  /**
	   * Calculates the distance in between two points using the Pythagorean
	   * theorem  (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
	   *
	   * @param pointA The first point.
	   * @param pointB The second point.
	   * @return The distance between the two points.
	   */
	  public double getDistance(PointPolar pointB)
	  {
	    // Obtain differences in X and Y, sign is not important as these values
	    // will be squared later.
	    double deltaX = getX() - pointB.getX();
	    double deltaY = getY() - pointB.getY();
	    
	    return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
	  }
	  
	  /**
	   * Calculates the distance in between two points using the Pythagorean
	   * theorem  (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
	   *
	   * @param pointA The first point.
	   * @param pointB The second point.
	   * @return The distance between the two points.
	   */
	  public double getDistance2(PointCartesian pointB)
	  {
	    // Obtain differences in X and Y, sign is not important as these values
	    // will be squared later.
	    double deltaX = getX() - pointB.getX();
	    double deltaY = getY() - pointB.getY();
	    
	    return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
	  }
	  
	  /**
	   * Rotates the specified point by the specified number of degrees.
	   * Not required until E2.30
	   *
	   * @param point The point to rotate
	   * @param rotation The number of degrees to rotate the point.
	   * @return The rotated image of the original point.
	   */
	  public PointPolar rotatePoint(double rotation)
	  {
	    double radRotation = Math.toRadians(rotation);
	    double X = getX();
	    double Y = getY();
	        
	    return new PointPolar(
	      (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
	      (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
	  }
	  
	  
	  /**
	   * Rotates the specified point by the specified number of degrees.
	   * Not required until E2.30
	   *
	   * @param point The point to rotate
	   * @param rotation The number of degrees to rotate the point.
	   * @return The rotated image of the original point.
	   */
	  public PointCartesian rotatePoint2(double rotation)
	  {
	    double radRotation = Math.toRadians(rotation);
	    double X = getX();
	    double Y = getY();
	    
	    double tmpRho = (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y);
	    double tmpTheta = (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y);
	        
	    return new PointCartesian(
	    (Math.cos(Math.toRadians(tmpTheta)) * tmpRho),
	    (Math.sin(Math.toRadians(tmpTheta)) * tmpRho));
	  }
	  
	  /**
	   * Returns information about the coordinates.
	   *
	   * @return A String containing information about the coordinates.
	   */
	  public String toString()
	  {
	    return "Stored as Cartesian:\nCartesian (" + x + "," + y + ")\nPolar [" + getRho() + "," + getTheta() + "]\n";
	  }
}
