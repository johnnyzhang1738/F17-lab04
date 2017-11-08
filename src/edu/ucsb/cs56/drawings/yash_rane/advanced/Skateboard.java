package edu.ucsb.cs56.drawings.yash_rane.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Arc2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a Skateboard that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Yash Rane
   @version for CS56, F17, UCSB
   
*/
public class Skateboard extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
    
    	@param x The X coordinate of the upper-left corner.
	@param y The Y coordinate of the upper-left corner.
	@param width The width of the skateboard
	@param height The height of the skateboard	
    */
    public Skateboard(double x, double y, double width, double height)
    {
	
	double arcWidth = width/3;

	Arc2D.Double left = new Arc2D.Double(
		x, y,
		arcWidth, height,
		90.0, 180.0,
		Arc2D.OPEN
	);

	Arc2D.Double right = new Arc2D.Double(
		x+width-arcWidth, y,
		arcWidth, height,
		270.0, 180.0,
		Arc2D.OPEN
	);

	
	Line2D.Double top = new Line2D.Double(
		x+arcWidth/2,y,
		x+width-arcWidth/2, y
	);

 	Line2D.Double bottom = new Line2D.Double(
		x+arcWidth/2,y+height,
		x+width-arcWidth/2, y+height
	);      

	GeneralPath skateboard = this.get();
        skateboard.append(left, false);	
	skateboard.append(right, false);
	skateboard.append(top, false);
	skateboard.append(bottom, false);
    }
}
