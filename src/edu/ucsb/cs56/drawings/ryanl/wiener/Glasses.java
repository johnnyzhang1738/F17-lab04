package edu.ucsb.cs56.drawings.ryanl.wiener;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of glasses
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Ryan Wiener
   @version for CS56, F17, UCSB
   
*/
public class Glasses extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of glasses
       @param y y coord of lower left corner of glasses
       @param width width of the glasses
       @param height of glasses
    */
    public Glasses(double x, double y, double width, double height)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.

		Line2D leftFrame = new Line2D.Double(x, y, x + width / 4, y + 3 * height / 4);
		Ellipse2D leftLense = new Ellipse2D.Double(x + width / 4, y + height / 2, width / 4, height / 2);
		Line2D middleFrame = new Line2D.Double(x + width / 2, y + 3 * height / 4, x + 3 * width / 4, y + 3 * height / 4);
		Ellipse2D rightLense = new Ellipse2D.Double(x + 3 * width / 4, y + height / 2, width / 4, height / 2);
		Line2D rightFrame = new Line2D.Double(x + 3 * width / 4, y, x + width, y + 3 * height / 4);
	
        // put the glasses together
	
        GeneralPath glasses = this.get();
        glasses.append(leftFrame, false);    
        glasses.append(leftLense, false);
        glasses.append(middleFrame, false);    
        glasses.append(rightLense, false);
        glasses.append(rightFrame, false);    
    }
}
