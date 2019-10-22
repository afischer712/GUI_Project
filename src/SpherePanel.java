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

import java.awt.event.*;
import javax.swing.*;
import java.text.*;


public class SpherePanel extends JPanel {
	
	// instance fields
	private JLabel rInput, vOutput, saOutput, vResult, saResult;
	private JTextField rText;
	private JButton clear, calculate;
	private Sphere s;
	
	
	// methods

/**
 * this method constructs the Panel for Sphere and calls the JPanel superconstructor
 */
	public SpherePanel() {
		
		// this sets up the Labels based on the instance fields above
		rInput = new JLabel("R = ");
		rInput.setAlignmentX(JLabel.RIGHT_ALIGNMENT);
	    rInput.setHorizontalAlignment(JLabel.RIGHT);
		vOutput = new JLabel("Volume: ");
		vOutput.setAlignmentX(JLabel.RIGHT_ALIGNMENT);
	    vOutput.setHorizontalAlignment(JLabel.RIGHT);
		saOutput = new JLabel("Surface Area: ");
		saOutput.setAlignmentX(JLabel.RIGHT_ALIGNMENT);
	    saOutput.setHorizontalAlignment(JLabel.RIGHT);
		vResult = new JLabel(" --");
		saResult = new JLabel(" --");
		
		// this sets up the Text field
		rText = new JTextField(10);
		
		//this sets up the buttons
		clear = new JButton("Clear");
		calculate = new JButton("Calculate");
		
		s = new Sphere();
		
		setBorder(BorderFactory.createTitledBorder("Sphere"));// creates border
		
		// these apply the previously created Labels and buttons to the Panel
		add(rInput);
		add(rText);
		add(vOutput);
		add(vResult);
		add(saOutput);
		add(saResult);
		add(clear);
		add(calculate);
		
		ButtonListener listener = new ButtonListener();
		
		clear.addActionListener(listener);
		calculate.addActionListener(listener);
		
		
	}// end SpherePanel constructor
	
	/**
	 * this method allows for the buttons to function. The actionlistener takes the source based
	 * on the buttons above and causes changes to occur based on the source
	 */
	private class ButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			
			
			if(event.getSource() == clear) {
				
				vResult.setText("--");
				saResult.setText("--");
				rText.setText(null);
				
			}// end if for clear pressed
			else if(event.getSource() == calculate) {
				
				NumberFormat nf = NumberFormat.getInstance();
				  nf.setMaximumFractionDigits(3); 
				  nf.setGroupingUsed(true);
				
				double radius;
				
				String text = rText.getText();
				radius = Double.parseDouble(text);
				
				s.setRadius(radius);
				
				vResult.setText(nf.format(s.getVolume()));
				saResult.setText(nf.format(s.getSurfaceArea()));
				
			}// end else if for calculate pressed
			
		}// end actionPerformed
		
	}// end ButtonListener

}// end class SpherePanel
