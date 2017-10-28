package edu.ucsb.cs56.drawings.brianhumphreys.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures
 * 
 * @author Phill Conrad 
 * @version for UCSB CS56, W16 
 */

public class AllMyDrawings
{
    /**  
    *This method creates a picture of a regular red bike 
    *that is shrunken by a factor of 2 of the user inputs
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Bike large = new Bike(100,200,100,300,30);
	g2.setColor(new Color(0xFF0000));		

	Shape small = ShapeTransforms.scaledCopyOfLL(large, 0.5,0.5);

	g2.draw(small);

	g2.setColor(Color.BLACK);
	g2.drawString("A shrunken red bike by Brian Humphreys", 20, 20);
	}
    
    
    /** This method creates a picture of a cyan bike for a beginner by giving the 
    *bike training wheels.  It translates the picture by 100 units, rotates it
    * by -1 radians and thickens the line elements.
     */
    public static void drawPicture2(Graphics2D g2) {
	
	TrainingBike b1 = new TrainingBike(150,300,100,200,20);
	g2.setColor(new Color(0x00FFFF));

	Shape b2 = ShapeTransforms.scaledCopyOfLL(b1,1.0,1.0);
	b2 = ShapeTransforms.translatedCopyOf(b2, 100,0);
	b2 = ShapeTransforms.rotatedCopyOf(b2,-1);

	Stroke thickness = new BasicStroke (5.5f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	Stroke orig = g2.getStroke();
	g2.setStroke(thickness);
	g2.draw(b2); 

	g2.setStroke(orig);
	g2.setColor(Color.BLACK);
	g2.drawString("A rotated cyan version of a bike for a beginner by Brian Humphreys", 20,20);

	}
    /** This method creates a picture of a magenta bike for a beginner. 
    *The line elements are thickened, the size has been scaled up, translated right 
    *180 units, and rotated vertically.
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	TrainingBike b1 = new TrainingBike(120,250,50,150,50);
	g2.setColor(new Color(0xFF00FF));

	Shape b2 = ShapeTransforms.scaledCopyOfLL(b1,1.1,1.1);
	b2 = ShapeTransforms.translatedCopyOf(b2, 180,0);
	b2 = ShapeTransforms.rotatedCopyOf(b2,(3 * 3.14) / 2);

	Stroke thickness = new BasicStroke (3.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
	
	Stroke orig = g2.getStroke();
	g2.setStroke(thickness);
	g2.draw(b2);

	g2.setStroke(orig);
	g2.setColor(Color.BLACK);

	g2.drawString("A verticle magenta bike for a beginner by Brian Humphreys",20,20);

    }       
}
