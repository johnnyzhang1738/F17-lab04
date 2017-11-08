package edu.ucsb.cs56.drawings.cindylu.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a lock that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Cindy Lu
   @version for CS56, F17, UCSB
   
*/
public class Lock extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of lock
       @param y y coord of lower left corner of lock
       @param width width of the lock
       @param height of lock (including base and arm)
    */
    public Lock(double x, double y, double width, double height)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        
        double baseHeight = .5 * height;
        double armHeight = height - baseHeight;
        
        double baseUpperLeftY = y + armHeight;
        
        // Make the base
        
        Rectangle2D.Double base = 
            new Rectangle2D.Double(x, baseUpperLeftY ,
				   width, baseHeight);

	GeneralPath leftArm = new GeneralPath();
	leftArm.moveTo(x,baseUpperLeftY);
	leftArm.lineTo(x+(4*width/16),baseUpperLeftY-armHeight);
	leftArm.lineTo(x+(width/2),baseUpperLeftY-armHeight);
	
	Shape rightArm = ShapeTransforms.horizontallyFlippedCopyOf(leftArm);

	rightArm = ShapeTransforms.translatedCopyOf(rightArm, width, 0.0);
	
        // put the whole lock together
	
        GeneralPath wholeLock = this.get();
        wholeLock.append(base, false);
        wholeLock.append(leftArm, false);
        wholeLock.append(rightArm, false);    
    }
}
