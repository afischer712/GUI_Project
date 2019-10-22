/**
 * 
 * This class creates a JFrame used in the GUI for the Geometry Calculator. It also 
 * sets the Panels for Sphere, Cylinder, and Cone into a grid layout on the JFrame.
 * 
 * @author Adam Fischer
 * @version 2/26/19
 * 
 * Programming Project 2
 * Spring 2019
 * 
 */

import java.awt.*;
import javax.swing.*;

public class Application {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Geometry Calculator");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,400);
		frame.setLocationRelativeTo(null);
		
		frame.setLayout( new GridLayout(3,1));
		
		SpherePanel sPanel = new SpherePanel();
		sPanel.setLayout(new GridLayout(4,2));
		CylinderPanel cPanel = new CylinderPanel();
		cPanel.setLayout(new GridLayout(5,2));
		ConePanel coPanel = new ConePanel();
		coPanel.setLayout(new GridLayout(5,2));
		
		frame.add(sPanel);
		frame.add(cPanel);
		frame.add(coPanel);
		
		frame.setVisible(true);
		
	}// end main

}// end class Application
