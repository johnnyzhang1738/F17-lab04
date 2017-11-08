package edu.ucsb.cs56.drawings.ryanl.wiener.simple;
import javax.swing.JFrame;

/** A viewer class to see a picture I drew with 
 *  just three simple Java graphics objects, namely
 *  Rectangle, Line2D.Double, Ellipse2D.Double
 *  
 * @author P. Conrad
 * @author Ryan Wiener
 * @version CS56, F17, UCSB
 */

public class PictureViewer
{
    public static void main(String[] args)
    {
		JFrame frame = new JFrame();
		
		// Set the size to whatever size you like (width, height)
		// For projects you turn in, lets not get any bigger than 640,480
    	  
		frame.setSize(640,480); // @@@ MODIFY THIS LINE IF YOU LIKE
		
		// Set your own title
		frame.setTitle("Ryan Wiener's Drawing"); // @@@ MODIFY THIS LINE
		
		// Always do this so that the red X (or red circle) works
		// to close the window. 
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Instantiate your drawing as a "component"
		
		PictureComponent component = new PictureComponent();
		
		// Always add your component to the frame 
		// and then make the window visible
		
		frame.add(component);
		frame.setVisible(true);
    }
}
