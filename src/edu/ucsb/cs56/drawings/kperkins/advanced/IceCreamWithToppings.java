package edu.ucsb.cs56.drawings.kperkins.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;

/**
   An IceCreamCone
      
   @author Kate Perkins
   @version for CS56, F17, UCSB
   
*/
public class IceCreamWithToppings extends IceCreamCone implements Shape
{
    /**
     * Constructor for objects of class IceCreamCone
     */
    public IceCreamWithToppings(double x, double y, double width, double height)
    {
	// construct the basic house shell
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	//define variables
	double r = 0.10 * width;
	double scoopTop = .5 * height;
	double sLen = .1 * height;

	//cherry on top
	Circle cherry = new Circle (x + width/2.0, y-scoopTop - r,r);

	//sprinkles
	Line2D.Double s1 = 
	    new Line2D.Double (x + width/4.0, y - sLen, 
			       x + width/4.0 + sLen, y - (2*sLen));
	Line2D.Double s2 = 
	    new Line2D.Double (x + width/2.0 + sLen, y - sLen/2.0,
			       x+ width/2.0, y -sLen);
	Line2D.Double s3 = 
	    new Line2D.Double (x + width/3.0, y - 4.0*sLen,
			       x + width/3.0 + sLen, y - 3.0*sLen);
	Line2D.Double s4 = 
	    new Line2D.Double (x + 3.0*width/4.0 + sLen, y - 3.0*sLen,
			       x + 3.0*width/4.0, y - 2.0*sLen);

	// add the cherry and sprinkles to ice cream cone
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")
	
        GeneralPath wholeIceCream = this.get();
	wholeIceCream.append(cherry, false);
	wholeIceCream.append(s1, false);
	wholeIceCream.append(s2, false);
	wholeIceCream.append(s3, false);
	wholeIceCream.append(s4, false);
    }    
}
