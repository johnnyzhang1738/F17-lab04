package edu.ucsb.cs56.drawings.yash_rane.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a PatternedSkateboard that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Yash Rane
   @version for CS56, F17, UCSB
   
*/
public class PatternedSkateboard extends Skateboard implements Shape
{
    /**
       Constructor
    
    	@param x The X coordinate of the upper-left corner.
	@param y The Y coordinate of the upper-left corner.
	@param width The width of the skateboard
	@param height The height of the skateboard	
    */
    public PatternedSkateboard(double x, double y, double width, double height)
    {
 	super(x,y,width,height);

	double y_center = y+height/2;
	double x_center = x+width/2;
	
	Ellipse2D.Double leftEye = new Ellipse2D.Double(
		x_center - width/5, y_center-height/5,
		1.0,1.0
	);

	Ellipse2D.Double rightEye = new Ellipse2D.Double(
		x_center + width/5, y_center - height/5,
		1.0,1.0
	);

	Arc2D.Double smile = new Arc2D.Double(
		x_center - width/5, y_center,
		2*width/5, height/5,
		180.0, 180.0, 
		Arc2D.OPEN
	);


	GeneralPath skateboard = this.get();
        skateboard.append(leftEye, false);	
	skateboard.append(rightEye, false);
	skateboard.append(smile, false);
    }
}
