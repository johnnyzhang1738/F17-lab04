package edu.ucsb.cs56.drawings.cindylu.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;


/**
   A Lock with keyhole
      
   @author Cindy Lu
   @version for CS56, F17, UCSB
   
*/
public class LockWithKeyhole extends Lock implements Shape
{
    /**
     * Constructor for objects of class LockWithKeyhole
     */
    public LockWithKeyhole(double x, double y, double width, double height)
    {
	// construct the basic house shell
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	// Make the keyhole, "o" represents the top hole, /_\ represents the bottom hole;
	// |            |
	// |      o     |
	// |     /_\    |
	// |            |
	//
	// The top of hole will be at y + 0.75*height and the
	// height of the hole is 0.25height;
	
	double h = 0.40 * width;
	double holeTop = y + 0.65 * height;
	
	
	Ellipse2D.Double topHole =
	    new Ellipse2D.Double(x + h, holeTop, width/5, width/5);

	Line2D.Double bottomHL =
	    new Line2D.Double(x+(0.5*width), holeTop+(width/5), x+(0.35*width), y+(0.85*height));

	Shape bottomHR = ShapeTransforms.horizontallyFlippedCopyOf(bottomHL);
	bottomHR = ShapeTransforms.translatedCopyOf(bottomHR, 0.3*width, 0.0);

       	Line2D.Double bottom =
	    new Line2D.Double(x+(0.35*width), y+(0.85*height), x+(0.65*width), y+(0.85*height));
	
	// add the windows to the house
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")
	
        GeneralPath wholeLock = this.get();
        wholeLock.append(topHole, false);
        wholeLock.append(bottomHL, false);
	wholeLock.append(bottomHR, false);
	wholeLock.append(bottom, false);
    }    
}
