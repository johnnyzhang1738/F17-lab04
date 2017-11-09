package edu.ucsb.cs56.drawings.henryjeng.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**

   @author Henry Jeng
   @version for CS56, F17, UCSB
   
*/
public class Bottle extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of bottle
       @param y y coord of lower left corner of bottle
       @param width width of the bottle
       @param height of bottle (including first story and second story)
    */
    public Bottle(double x, double y, double width, double height)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        
        double heightOfBottom = .70 * height;
        double heightOfTop = .2 * height;
        double heightOfCap = height - (heightOfBottom + heightOfTop);
        double bottomUpperLeftY = y + (heightOfTop + heightOfCap);
        double capWidth = .5 * width;
        // Make the first story
        
        Rectangle2D.Double bottleBottom = 
            new Rectangle2D.Double(x, bottomUpperLeftY ,
				   width, heightOfBottom + heightOfCap);
	
        // make the top.   Remember that y goes DOWN the page,
        // so we ADD to y to get a "lower" value on the screen
        
        Line2D.Double leftTop = 
            new Line2D.Double (x, y + heightOfTop + heightOfCap,
                               x + capWidth/2.0, y+heightOfCap);
	
        Line2D.Double rightTop =
            new Line2D.Double (x + width - capWidth/2.0, y+heightOfCap,
                               x + width, y + heightOfTop + heightOfCap);
		
		Rectangle2D.Double bottleCap = 
            new Rectangle2D.Double(x + capWidth/2.0, y ,
				   capWidth, heightOfCap);
        // put the whole bottle together
	
        GeneralPath wholeBottle = this.get();
        wholeBottle.append(bottleBottom, false);
        wholeBottle.append(leftTop, false);
        wholeBottle.append(rightTop, false);   
		wholeBottle.append(bottleCap, false);
    }
}
