package edu.ucsb.cs56.drawings.xiaosun95.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a house that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.

   @author xiaosun95
   @version for CS56, f17, UCSB

*/
public class table extends GeneralPathWrapper implements Shape
{
    /**
       Constructor

       @param x x coord of lower left corner of table
       @param y y coord of lower left corner of table
       @param width width of the house
       @param height of house (including first story and second story)
    */
    public table(double x, double y, double width, double height)
    {

        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.

        double footHeight = .75 * height;

        double footwidth=0.2*width;
     double tableHeight = 0.25* height;
    
double firstfootleftxposition = x+0.2*width;
double secondfootleftxposition = x+0.6*width;
double tableleftyposition = y;
double footleftyposition=y+tableHeight;

        // Make the first story                                                 

        Rectangle2D.Double firstfoot =
            new Rectangle2D.Double(firstfootleftxposition,
				   footleftyposition,                                                             footwidth, footHeight);
	 Rectangle2D.Double secondfoot =
            new Rectangle2D.Double(secondfootleftxposition,
				   footleftyposition ,
                                   footwidth, footHeight);

 Rectangle2D.Double tableplat =
            new Rectangle2D.Double(x, y,
                                   width, tableHeight);



        // make the table.   Remember that y goes DOWN the page,                 
        // so we ADD to y to get a "lower" value on the screen                  

    

     // put the whole table together                                         

        GeneralPath wholetable = this.get();
        wholetable.append(firstfoot, false);
        wholetable.append(secondfoot, false);
        wholetable.append(tableplat, false);
    }
}


