package edu.ucsb.cs56.drawings.yash_rane.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a Lollypop that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Yash Rane 
   @version for CS56, F17, UCSB
   
*/
public class Lollypop extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
    
    	@param x the center x coordinate of the Lollypop
	@param y the bottom y coordinate of the Lollypop
	@param length the overall length of the lollypop
	@param radius the radius of the lollypop	
    */
    public Lollypop(double x, double y, double length, double radius)
    {
	
       
	double stickLength = length - radius*2;
	      

   	// Making the handle of the lollypop
	Line2D.Double stick = new Line2D.Double(
		x,y,
		x, y-stickLength
	);

	// Making the candy circle of the lollypop
	Ellipse2D.Double candy = new Ellipse2D.Double( 
		x-radius/2, y-radius,
		radius, radius	
	);

	GeneralPath lollypop = this.get();
        lollypop.append(stick, false);	
	lollypop.append(candy, false);
    }
}
