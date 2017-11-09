package edu.ucsb.cs56.drawings.henryjeng.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;

/**
   A Bottle with a label
      
   @author Phill Conrad 
   @edited for Bottle by Henry Jeng
   @version for CS56, F17, UCSB
   
*/
public class BottleWithLabel extends Bottle implements Shape
{
    /**
     * Constructor for objects of class Bottle
     */
    public BottleWithLabel(double x, double y, double width, double height)
    {
	// construct the basic bottle shell
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	// Make a label, where l=width*0.1;
	//	
	double l = 0.1 * width;
	double labelTop = y + 0.5 * height;
	double labelHt =  0.25 * height;
	
	Rectangle2D.Double label1 =
	    new Rectangle2D.Double(x + l, labelTop, 8.0 * l, labelHt);;
	
	// add the label to the bottle
	
        GeneralPath wholeBottle = this.get();
        wholeBottle.append(label1, false);

    }    
}
