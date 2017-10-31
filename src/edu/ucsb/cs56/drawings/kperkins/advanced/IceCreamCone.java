package edu.ucsb.cs56.drawings.kperkins.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Arc2D;
import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of an ice cream cone that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Kate Perkins
   @version for CS56, F17, UCSB
   
*/
public class IceCreamCone extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of cone
       @param y y coord of lower left corner of cone
       @param width width of the cone
       @param height of ice cream cone (including cone and ice cream)
    */
    public IceCreamCone(double x, double y, double width, double height)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.

	
        double coneHeight  = .75 * height;
        double iceCreamHeight = height - coneHeight;
	double scoopHeight = .5 * height;
        
    
	//make the cone
	
        Line2D.Double leftCone = 
            new Line2D.Double (x,y, x + width/2.0, y + coneHeight);
	
        Line2D.Double rightCone =
            new Line2D.Double (x + width, y,
                               x + width/2.0, y + coneHeight);

	//make iceCream ball

	Arc2D.Double scoop = new Arc2D.Double (x,y - scoopHeight,width, height,
					       0, 180, Arc2D.CHORD);

        // put the whole ice cream cone together
	
        GeneralPath wholeIceCream = this.get();
        wholeIceCream.append(leftCone, false);
        wholeIceCream.append(rightCone, false);
	wholeIceCream.append(scoop, false);
    }
}
