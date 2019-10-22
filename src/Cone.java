/**
 * 
 * This class creates the Panel of Geometry Calculator that takes in information for the spheres and 
 * calculates the volume and surface area based on the given radius. 
 * 
 * @author Adam Fischer
 * @version 2/26/19
 * 
 * Programming Project 2
 * Spring 2019
 * 
 */
public class Cone {

	// instance fields
	private double radius;
	private double height;
	
	
	//methods
	
	/**
	 * the empty argument constructor sets the values for created cone objects
	 */
	public Cone() {
		radius = 1;
		height = 1;
	}// end empty argument constructor
	
	/**
	 * This constructs the cone object and passes the parameters to the setters for bounds checking
	 * @param r - the radius of the cone
	 * @param h - the height of the cone
	 */
	public Cone(double r, double h) {
		
		this.setRadius(r);
		this.setHeight(h);
		
	}// end Cone constructor

	/**
	 * This method uses the given radius and height to find the volume of a cone
	 * @return - the volume of the cone
	 */
	public double getVolume() {
		double vol;
		
		vol = height * 0.333333333333 * Math.PI * Math.pow(radius, 2);
		
		return vol;
	}// end getVolume
	
	/**
	 * This method takes the values for radius and height and finds the surface area of the cone
	 * @return - the Surface area of the Cone
	 */
	public double getSurfaceArea() {
		double sa;
		
		double thing = radius + ( Math.sqrt( Math.pow(height, 2) + Math.pow(radius, 2) ) );
		
		sa = Math.PI * radius * thing;
		
		return sa;
	}// end getSurfaceArea
	
	// getters and setters
	public double getRadius() {
		return radius;
	}// end getRadius

	public void setRadius(double radius) {
		if(radius>=1)
			this.radius = radius;
		else
			this.radius = 1;
	}// end setRadius with bounds checking

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (height >=1)
			this.height = height;
		else
			this.height = 1;
	}
	
}// end class Cone
