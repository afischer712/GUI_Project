/**
 * 
 * This class creates the Panel of Geometry Calculator that takes in information for the cones and 
 * calculates the volume and surface area based on the given radius and height. 
 * 
 * @author Adam Fischer
 * @version 2/26/19
 * 
 * Programming Project 2
 * Spring 2019
 * 
 */

import java.awt.event.*;
import java.text.NumberFormat;
import javax.swing.*;

public class ConePanel extends JPanel{
	
	// instance fields
	private JLabel rInput, hInput, vOutput, saOutput, vResult, saResult;
	private JTextField rText, hText;
	private JButton clear, calculate;
	private Cone s;
	
	//methods
	
	/**
	 * this method constructs the Panel for Cone and calls the JPanel superconstructor
	 */
	public ConePanel() {
		
		rInput = new JLabel("R = ");
		rInput.setAlignmentX(JLabel.RIGHT_ALIGNMENT);
	    rInput.setHorizontalAlignment(JLabel.RIGHT);
		hInput = new JLabel("H = ");
		hInput.setAlignmentX(JLabel.RIGHT_ALIGNMENT);
	    hInput.setHorizontalAlignment(JLabel.RIGHT);
		vOutput = new JLabel("Volume:");
		vOutput.setAlignmentX(JLabel.RIGHT_ALIGNMENT);
	    vOutput.setHorizontalAlignment(JLabel.RIGHT);
		saOutput = new JLabel("Surface Area: ");
		saOutput.setAlignmentX(JLabel.RIGHT_ALIGNMENT);
	    saOutput.setHorizontalAlignment(JLabel.RIGHT);
		vResult = new JLabel(" --");
		saResult = new JLabel(" --");
		
		
		rText = new JTextField(10);
		hText = new JTextField(10);
		
		clear = new JButton("Clear");
		calculate = new JButton("Calculate");
		
		s = new Cone();
		
		setBorder(BorderFactory.createTitledBorder("Cone"));
		
		rInput.setAlignmentX(RIGHT_ALIGNMENT);
		add(rInput);
		add(rText);
		
		hInput.setAlignmentX(RIGHT_ALIGNMENT);
		add(hInput);
		add(hText);
		
		vOutput.setAlignmentX(RIGHT_ALIGNMENT);
		add(vOutput);
		add(vResult);
		
		saOutput.setAlignmentX(RIGHT_ALIGNMENT);
		add(saOutput);
		add(saResult);
		
		add(clear);
		add(calculate);
		
		ButtonListener listener = new ButtonListener();
		
		clear.addActionListener(listener);
		calculate.addActionListener(listener);
		
		
	}// end ConePanel constructor
	
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
				hText.setText(null);
				
			}// end if for clear pressed
			else if(event.getSource() == calculate) {
				
				NumberFormat nf = NumberFormat.getInstance();
				  nf.setMaximumFractionDigits(3); 
				  nf.setGroupingUsed(true);
				
				double radius;
				double height;
				
				String text = rText.getText();
				radius = Double.parseDouble(text);
				String txt = hText.getText();
				height = Double.parseDouble(txt);
				
				s.setRadius(radius);
				s.setHeight(height);
				
				vResult.setText(nf.format(s.getVolume()));
				saResult.setText(nf.format(s.getSurfaceArea()));
				
			}// end else if for calculate pressed
			
		}// end actionPerformed
		
	}// end ButtonListener

}// end class ConePanel
