package edu.ucsb.cs56.drawings.ryanl.wiener.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Ellipse2D;

/**
   Shades
      
   @author Ryan Wiener
   @version for CS56, F17, UCSB
   
*/
public class Shades extends Glasses implements Shape
{
    /**
     * Constructor for objects of class Shades
     */
    public Shades(double x, double y, double width, double height)
    {
		// construct the basic glasses shell
		super(x,y,width,height);
		
		// get the GeneralPath that we are going to append stuff to
        GeneralPath gp = this.get();
		// build shades (concentric ellipses inside lenses)
		double i = 0, j = 0, ratio = 2 * height / width;
		while (i < width / 4 && j < height / 2) {
        	gp.append(new Ellipse2D.Double(x + width / 4 + i / 2, y + height / 2 + j / 2, width / 4 - i, height / 2 - j), false);
        	gp.append(new Ellipse2D.Double(x + 3 * width / 4 + i / 2, y + height / 2 + j / 2, width / 4 - i, height / 2 - j), false);
			i += 1 / ratio;
			j += ratio;
		}
    }    
}
