package edu.ucsb.cs56.drawings.erick_suarez.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
/**
   A Door with a 3 by 3 window

   @author Erick Suarez
   @version for CS56, F17, UCSB

*/
public class DoorWithWindow extends Door implements Shape
{
    /**
     * Constructor for objects of class DoorWithWindow
     @param x x coord of lower left corner of Door
     @param y y coord of lower left corner of Door
     @param width width of the Door
     @param height of Door
     */
    public DoorWithWindow(double x, double y, double width, double height)
    {
	// construct the basic Door shell
	super(x,y,width,height);

	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();

	// Make a window, divided by 4 lines to make it a 3 by 3
	// The top of window will be at y + 0.5*height and the
	// height of the window is 0.25height;

	double windowWidth = 0.4 * width;
  double windowHeight =  0.5 * height;
	double windowX = x + .3 * width;
  double windowY = y + .1 * height;

	Rectangle2D.Double window =
	    new Rectangle2D.Double(windowX, windowY, windowWidth, windowHeight);

  //Make  dividers
  Line2D.Double leffVertical =
      new Line2D.Double (windowX + windowWidth/3.0, windowY,
                         windowX + windowWidth/3.0, windowY + windowHeight);
  Line2D.Double rightVertical =
      new Line2D.Double (windowX + 2*windowWidth/3.0, windowY,
                         windowX + 2*windowWidth/3.0, windowY + windowHeight);
  Line2D.Double topHorizontal =
      new Line2D.Double (windowX, windowY + windowHeight/3.0,
                         windowX + windowWidth, windowY + windowHeight/3.0);
  Line2D.Double botHorizonal =
      new Line2D.Double (windowX, windowY + 2*windowHeight/3.0,
                         windowX + windowWidth, windowY + 2*windowHeight/3.0);

	// add the windows to the door
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")

        GeneralPath wholeDoor = this.get();
        wholeDoor.append(window, false);
        wholeDoor.append(leffVertical, false);
        wholeDoor.append(rightVertical, false);
        wholeDoor.append(topHorizontal, false);
        wholeDoor.append(botHorizonal, false);


    }
}
