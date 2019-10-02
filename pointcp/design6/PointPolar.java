
public class PointPolar implements PointCP {
	//Instance variables ************************************************
	  

	  /**
	   * Contains the current value of  RHO
	   */
	  private double Rho;
	  
	  /**
	   * Contains the current value of THETA
	   */
	  private double Theta;
		
	  
	  //Constructors ******************************************************

	  /**
	   * Constructs a coordinate object, with a type identifier.
	   */
	  public PointPolar(double Rho, double Theta)
	  {

	    this.Rho = Rho;
	    this.Theta = Theta;
	  }
	  
	  public PointPolar(double[] Coord)
	  {

	    this.Rho = Coord[0];
	    this.Theta = Coord[1];
	  }
	  
	  public PointPolar(PointCartesian cartesianCoord) {
		  this.Rho = cartesianCoord.getRho();
		  this.Theta = cartesianCoord.getTheta();
	  }
		
	  
	  //Instance methods **************************************************
	 
	 
	  public double getX()
	  {
		  return (Math.cos(Math.toRadians(Theta)) * Rho);
	  }
	  
	  public double getY()
	  {
		  return (Math.sin(Math.toRadians(Theta)) * Rho);
	  }
	  
	  public double getRho()
	  {
	      return Rho;
	  }
	  
	  public double getTheta()
	  {
	      return Theta;
	  }
	  
	  /**
	   * Converts Cartesian coordinates to Polar coordinates.
	   */
	  public void convertStorageToPolar()
	  {
		System.out.println("Value is stored in polar: " + "[" + Rho + ", " + Theta + "]\n." );
	  }
		
	  /**
	   * Converts Polar coordinates to Cartesian coordinates.
	   */
	  public void convertStorageToCartesian()
	  {
		 System.out.println("Value is computed in cartesian but not stored: " + "(" + getX() + ", " + getY() + ").\n");
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
	    return "Stored as Polar:\nCartesian (" + getX() + "," + getY() + ")\nPolar [" + Rho + "," + Theta + "]\n";
	  }
}
