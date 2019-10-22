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
public class Cylinder {
	
	// instance fields
	private double radius;
	private double height;

	
	// methods
	
	/**
	 * the empty argument constructor sets the values for created cylinder objects
	 */
	public Cylinder() {
		radius = 1;
		height = 1;
	}// end empty argument constructor
	
	/**
	 * This constructs the cylinder object and passes the parameters to the setters for bounds checking
	 * @param r - the radius of the cylinder
	 * @param h - the height of the cylinder
	 */
	public Cylinder(double r, double h) {
		
		this.setRadius(r);
		this.setHeight(h);
		
	}// end Cylinder constructor
	
	/**
	 * This method uses the given radius and height to find the volume of a cylinder
	 * @return - the volume of the cylinder
	 */
	public double getVolume() {
		double vol;
		
		vol = Math.PI * Math.pow(radius, 2) * height;
		
		return vol;
	}// end getVolume
	
	/**
	 * This method takes the values for radius and finds the surface area of the cylinder
	 * @return - the Surface area of the Cylinder
	 */
	public double getSurfaceArea() {
		double sa;
		
		sa = (2 * Math.PI * Math.pow(radius, 2)) + (2 * Math.PI * height * radius);
		
		return sa;
	}// getSurfaceArea
	
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
		}// end getHeight

		public void setHeight(double height) {
			if (height >=1)
				this.height = height;
			else
				this.height = 1;
		}// end setHeight with bounds checking
		
	
}// end class Cylinder
