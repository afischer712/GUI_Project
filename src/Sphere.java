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
public class Sphere {

	// instance field
	private double radius;
	
	
	//methods
	
	/**
	 * the empty argument constructor sets the values for created sphere objects
	 */
	public Sphere(){
		radius = 1;
	}// end empty argument constructor
	
	/**
	 * This constructs the sphere object and passes the parameters to the setters for bounds checking
	 * @param r - the radius of the sphere
	 */
	public Sphere(double r) {
		
		this.setRadius(r);
		
	}// end Sphere constructor
	
	/**
	 * This method uses the given radius to find the volume of a sphere
	 * @return - the volume of the sphere
	 */
	public double getVolume() {
		double vol = 0;
		
		vol = 4 * 0.333333333333333 * Math.PI * Math.pow(radius, 3);
		
		return vol;
	}// end getVolume

	/**
	 * This method takes the values for radius and finds the surface area of the sphere
	 * @return - the Surface area of the Sphere
	 */
	public double getSurfaceArea() {
		double sa;
		
		sa = 4 * Math.PI * Math.pow(radius, 2);
		
		return sa;
	}
	
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
	
}// end class Sphere
