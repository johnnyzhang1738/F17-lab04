package edu.ucsb.cs56.drawings.ryanl.wiener.advanced;
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
      
   @author Phill Conrad 
   @author Ryan Wiener
   @version for CS56, F17, UCSB
   
*/
public class Glasses extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of house
       @param y y coord of lower left corner of house
       @param width width of the house
       @param height of house (including first story and second story)
    */
    public Glasses(double x, double y, double width, double height)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.

		double glassesWidth = width / 4;
		double frameY = y + height / 2;
		Ellipse2D leftLense = new Ellipse2D.Double(x, y, glassesWidth, height);
		Ellipse2D rightLense = new Ellipse2D.Double(x, y, glassesWidth, height);
		Line2D rightFrame = new Line2D.Double(x + 2 * glassesWidth, frameY, x + width - 2 * glassesWidth, frameY);
		//Line2D rightFrame = new Line2D(x, frameY, x + width, frameY);
	
        // put the whole house together
	
        GeneralPath glasses = this.get();
        glasses.append(leftLense, false);
        glasses.append(rightLense, false);
        glasses.append(rightFrame, false);    
    }
}
