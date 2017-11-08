package edu.ucsb.cs56.drawings.erick_suarez.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a door that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.

   @author Erick Suarez
   @version for CS56, F17, UCSB

*/
public class Door extends GeneralPathWrapper implements Shape
{
    /**
       Constructor

       @param x x coord of lower left corner of Door
       @param y y coord of lower left corner of Door
       @param width width of the Door
       @param height of Door
    */
    public Door(double x, double y, double width, double height)
    {

        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.

        double doorHandleX = .8 * width + x;
        double doorHandleY = .55 * height + y;
        double doorHandleDiameter = .1 * width;

        // Make the door frame

        Rectangle2D.Double doorFrame =
            new Rectangle2D.Double(x, y, width, height);

        // make the door handle.   Remember that y goes DOWN the page,
        // so we ADD to y to get a "lower" value on the screen

        Ellipse2D.Double doorHandle =
            new Ellipse2D.Double( doorHandleX, doorHandleY,   /* upper left corner of bounding box */
              doorHandleDiameter, doorHandleDiameter); /* width and height are double the radius */

        // put the whole Door together

        GeneralPath wholeDoor = this.get();
        wholeDoor.append(doorFrame, false);
        wholeDoor.append(doorHandle, false);
    }
}
